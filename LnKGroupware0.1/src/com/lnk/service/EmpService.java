package com.lnk.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.userdetails.UserDetails;

import com.lnk.exception.EmpException;
import com.lnk.model.Emp;
import com.lnk.model.Grade;

public interface EmpService {
	
	// 사원 추가
	public void add(Emp emp) throws EmpException;
	
	// 사원 상세 보기
	public Emp detail(Integer empNo) throws EmpException; 
	
	// 사원 목록
	public List<Emp> list() throws EmpException;
	
	// 사원 수정
	public String modify(Emp emp) throws EmpException;
	
	// 사원 삭제
	public void remove(Integer empNo) throws EmpException;
	
	// 사원 번호를 이용해 사원 정보 가져오기
	public Emp detailByEmpNo(Integer emoNo) throws EmpException; 
	
	// 사원 권한 가져오기
	public Grade getGrade(Integer gradeNo) throws EmpException;
	
	// Principal 객체 가져오기(로그인한 사용자)
	public UserDetails getPrincipal();
	
	// 로그아웃
	public void logout(HttpServletRequest req, HttpServletResponse resp);
	
	// 비밀번호 일치 확인
	public boolean ispPasswordMatched(String oldPassword) throws EmpException;


}
