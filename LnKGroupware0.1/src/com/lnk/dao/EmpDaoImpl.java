package com.lnk.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lnk.exception.EmpException;
import com.lnk.model.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {
	
	private static final String MAPPER_NS = Emp.class.getName();
	
	@Autowired
	private SqlSession session;
	
	public EmpDaoImpl() {}

	// 사원 추가
	@Override
	public void insert(Emp emp) throws EmpException {
		session.insert(MAPPER_NS + ".insert-emp", emp);
	}

	// 사원 상세
	@Override
	public Emp select(Integer empNo) throws EmpException {
		Emp emp = null;
		
		try {
			emp = session.selectOne(MAPPER_NS + ".select-emp", empNo);
		} catch (Exception e) {
			throw new EmpException(e.getMessage());
		}
		return emp;
	}

	// 사원 목록
	@Override
	public List<Emp> selectAll() throws EmpException {
		List<Emp> list = null;
		try {
			list = session.selectList(MAPPER_NS + ".select-all-emp");
		} catch (Exception e) {
			throw new EmpException(e.getMessage());
		}
		return list;
	}

	// 사원 수정
	@Override
	public void update(Emp emp) throws EmpException {
		try {
			session.update(MAPPER_NS + ".update-emp", emp);
		} catch (Exception e) {
			throw new EmpException(e.getMessage());
		}
	}

	// 사원 삭제
	@Override
	public void delete(Integer empNo) throws EmpException {
		try {
			session.delete(MAPPER_NS + ".delete-emp", empNo);
		} catch (Exception e) {
			throw new EmpException(e.getMessage());
		}
	}
	
	// 사원 번호를 이용해 사원 권한 삭제
	@Override
	public void deleteEmpGrade(Integer empNo) throws EmpException {
		session.delete(MAPPER_NS + ".delete-connection", empNo);
	}

	// 사원 이메일을 이용해 사원 정보 가져오기
	@Override
	public Emp selectByEmail(String email) throws EmpException {
		Emp emp = null;
		try {
			emp = session.selectOne(MAPPER_NS + ".select-emp-by-empNo", email);
		} catch (Exception e) {
			throw new EmpException(e.getMessage());
		}
		return emp;
	}
	
	// 권한 연결 테이블 Connection에 정보 입력하기
	@Override
	public void insertConnection(Emp emp) throws EmpException {
		session.insert(MAPPER_NS + ".insert-grade", emp);
		
	}

}
