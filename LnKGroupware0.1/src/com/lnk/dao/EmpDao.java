package com.lnk.dao;

import java.util.List;

import com.lnk.exception.EmpException;
import com.lnk.model.Emp;

public interface EmpDao {
	
	// 사원 추가
	public void insert(Emp emp) throws EmpException;
	
	// 사원 상세
	public Emp select(Integer empNo) throws EmpException;
	
	// 사원 목록
	public List<Emp> selectAll() throws EmpException;
	
	// 사원 수정
	public void update(Emp emp) throws EmpException;
	
	// 사원 삭제
	public void delete(Integer empNo) throws EmpException;
	
	// 사원 번호를 이용해 사원 권한 삭제
	public void deleteEmpGrade(Integer empNo) throws EmpException;
	
	// 사원 이메일을 이용해 사원 정보 가져오기
	public Emp selectByEmail(String email) throws EmpException;
	
	// 권한 연결 테이블 Connection에 정보 입력하기
	public void insertConnection(Emp emp) throws EmpException;
	
	// connection 테이블 전체 삭제
	// public void deleteAllConnection();
	
	// connection 테이블 행의 수 가져오기
	// public Integer getCountConnection();

}
