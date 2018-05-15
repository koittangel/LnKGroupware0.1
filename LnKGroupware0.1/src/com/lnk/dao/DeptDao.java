package com.lnk.dao;

import java.util.List;

import com.lnk.exception.DeptException;
import com.lnk.model.Dept;

public interface DeptDao {
	
	// 부서 추가
	public void insert(Dept dept) throws DeptException;
	
	// 부서 상세 보기
	public Dept select(String deptNo) throws DeptException;
	
	// 부서 목록
	public List<Dept> selectAll() throws DeptException;
	
	// 부서 수정 
	public void update(Dept dept) throws DeptException;
	
	// 부서 삭제
	public void delete(String deptNo) throws DeptException;
}
