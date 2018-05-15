package com.lnk.service;

import java.util.List;
import com.lnk.exception.DeptException;
import com.lnk.model.Dept;

public interface DeptService {
	
	// 부서 추가
	public void add(Dept dept) throws DeptException;
	
	// 부서 상세
	public Dept detail(String deptNo) throws DeptException;
	
	// 부서 목록
	public List<Dept> list() throws DeptException;
	
	// 부서 수정
	public void modify(Dept dept) throws DeptException;
	
	// 부서 삭제
	public void remove(String deptNo) throws DeptException;

}
