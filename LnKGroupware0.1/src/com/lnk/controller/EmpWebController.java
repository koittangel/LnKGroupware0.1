package com.lnk.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lnk.model.Emp;
import com.lnk.service.EmpService;
import com.lnk.service.FileService;

@Controller
public class EmpWebController {
	
	@Autowired 
	private EmpService empService;
	
	@Autowired
	private FileService fileService;
	
	// 사원 추가 (추가하기 화면)
	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	// 사원 추가 (추가하기 화면에서 전달받은 값으로 사원 생성)
	@RequestMapping(value="join.do", method=RequestMethod.POST)
	public String join(HttpServletRequest req,
						String empName, 
						String password, 
						String email,
						String hireDate, 
						@RequestParam("photo") MultipartFile photo) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			Date dateHire = format.parse(hireDate);
			
			Emp emp = new Emp(null, empName, password, email, dateHire, null);
			
		} catch (Exception e) {
			
		}
		
		return "redirect:index.do";
		
	}
	
	// 사원 상세
	
	// 사원 목록
	
	// 사원 수정
	
	// 사원 삭제
	
	// 사원 이메일을 이용해 사원 정보 가져오기
	
	// 사원 권한 가져오기
	
	// Principal 객체 가져오기(로그인한 사용자)
	
	// 로그아웃
	
	// 비밀번호 일치 확인
	
	
	
}
