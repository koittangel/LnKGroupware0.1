package com.lnk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnk.dao.DeptDao;
import com.lnk.exception.DeptException;
import com.lnk.model.Dept;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;
	
	public DeptServiceImpl() {}
	
	// 부서 추가
	@Override
	public void add(Dept dept) throws DeptException {
		dao.insert(dept);
	}

	// 부서 상세
	@Override
	public Dept detail(String deptNo) throws DeptException {
		return dao.select(deptNo);
	}

	// 부서 목록
	@Override
	public List<Dept> list() throws DeptException {
		return dao.selectAll();
	}

	// 부서 수정
	@Override
	public void modify(Dept dept) throws DeptException {
		dao.update(dept);
	}

	// 부서 삭제
	@Override
	public void remove(String deptNo) throws DeptException {
		dao.delete(deptNo);
	}
	
}
