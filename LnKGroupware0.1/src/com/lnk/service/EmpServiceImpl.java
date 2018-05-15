package com.lnk.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnk.dao.EmpDao;
import com.lnk.dao.GradeDao;
import com.lnk.exception.EmpException;
import com.lnk.model.Emp;
import com.lnk.model.Grade;
import com.lnk.model.GradeNo;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDao empDao;
	
	@Autowired
	private GradeDao gradeDao;
	
	// 비밀번호 암호화
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	// 사원 추가
	@Override
	public void add(Emp emp) throws EmpException {
		// 입력 받은 비밀번호 암호화
		String enocode = passwordEncoder.encode(emp.getPassword());
		emp.setPassword(enocode);
		
		Grade grade = null;
		
		if (emp.getGradeNo().equals(GradeNo.MASTER.getGradeNo())) {
			// MASTER 권한 입력 (100, "MASTER")
			grade = new Grade(GradeNo.MASTER.getGradeNo(), GradeNo.MASTER.name());
		}
		
		if (emp.getGradeNo().equals(GradeNo.CEO.getGradeNo())) {
			// CEO 권한 입력 (200, "CEO")
			grade = new Grade(GradeNo.CEO.getGradeNo(), GradeNo.CEO.name());
		}
		
		if (emp.getGradeNo().equals(GradeNo.DIRECTOR.getGradeNo())) {
			// DIRECTOR 권한 입력 (201, "DIRECTOR")
			grade = new Grade(GradeNo.DIRECTOR.getGradeNo(), GradeNo.DIRECTOR.name());
		}
		
		if (emp.getGradeNo().equals(GradeNo.HEAD.getGradeNo())) {
			// HEAD 권한 입력 (202, "HEAD")
			grade = new Grade(GradeNo.HEAD.getGradeNo(), GradeNo.DIRECTOR.name());
		}
		
		if (emp.getGradeNo().equals(GradeNo.CHEIF.getGradeNo())) {
			// CHEIF 권한 입력 (203, "CHEIF")
			grade = new Grade(GradeNo.CHEIF.getGradeNo(), GradeNo.CHEIF.name());
		}
		
		if (emp.getGradeNo().equals(GradeNo.STAFF.getGradeNo())) {
			// STAFF 권한 입력 (204, "STAFF")
			grade = new Grade(GradeNo.STAFF.getGradeNo(), GradeNo.STAFF.name());		
		}

		// Set컬렉션을 이용하여 emp 객체에 권한 담기
		Set<Grade> grades = new HashSet<>();
		
		// emp테이블에 입력
		empDao.insert(emp);
		
		// connection 테이블에 사용자 권한 정보 입력
		empDao.insertConnection(emp);
		
	}

	// 사원 상세
	@Override
	public Emp detail(Integer empNo) throws EmpException {
		return empDao.select(empNo);
	}

	// 사원 목록
	@Override
	public List<Emp> list() throws EmpException {
		return empDao.selectAll();
	}

	// 사원 수정
	@Override
	public String modify(Emp emp) throws EmpException {
		// 수정 전 기존에 저장되어 있던 첨부파일명 가져오기
		Emp item = empDao.select(emp.getEmpNo());
		String filename = item.getPhoto();
		
		// 입력받은 비밀번호를 암호화
		emp.setPassword(passwordEncoder.encode(emp.getPassword()));
		
		// 암호화된 emp객체를 데이터베이스로 전달
		empDao.update(emp);
		
		return filename;
	}

	// 사원 삭제
	@Override
	public void remove(Integer empNo) throws EmpException {
			empDao.deleteEmpGrade(empNo);
			empDao.delete(empNo);
	}

	// 사원 이메일을 이용해 사원 정보 가져오기
	@Override
	public Emp detailByEmail(String email) throws EmpException {
		return empDao.selectByEmail(email);
	}

	// 사원 권한 가져오기
	@Override
	public Grade getGrade(Integer gradeNo) throws EmpException {
		return gradeDao.select(gradeNo);
	}

	// Principal 객체 가져오기(로그인한 사용자)
	@Override
	public UserDetails getPrincipal() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Object principal = auth.getPrincipal();
		if (principal instanceof UserDetails) {
			return (UserDetails) principal;
		}
		return null;
	}

	// 로그아웃
	@Override
	public void logout(HttpServletRequest req, HttpServletResponse resp) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(req, resp, auth);
		}
	}

	// 비밀번호 일치 확인
	@Override
	public boolean ispPasswordMatched(String oldPassword) throws EmpException {
		// 현재 로그인한 사원의 암호화된 비밀번호 가져옴
		String email = this.getPrincipal().getUsername();
		Emp emp = empDao.selectByEmail(email);
		
		// 입력한 비밀번호와 기존 비밀번호를 비교하여 일치하면 true, 아니면 false 리턴
		return passwordEncoder.matches(oldPassword, emp.getPassword());
	}

}
