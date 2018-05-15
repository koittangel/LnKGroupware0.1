package com.lnk.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.lnk.exception.DeptException;
import com.lnk.model.Dept;

public class DeptDaoImpl implements DeptDao {
	
	private static final String MAPPER_NS = Dept.class.getName();
	
	@Autowired
	private SqlSession session;
	
	public DeptDaoImpl() {}
	
	
	// 부서 추가
	@Override
	public void insert(Dept dept) throws DeptException {
		try {
			session.insert(MAPPER_NS + ".insert-dept", dept);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DeptException(e.getMessage());
		}
		
	}
	

	// 부서 상세 보기
	@Override
	public Dept select(String deptNo) throws DeptException {
		Dept dept = null;
		
		try {
			dept = session.selectOne(MAPPER_NS + ".select-dept", deptNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DeptException(e.getMessage());
		}
		return dept;
	}

	// 부서 목록
	@Override
	public List<Dept> selectAll() throws DeptException {
		List<Dept> list = null;
		try {
			list = session.selectList(MAPPER_NS + ".select-all-dept");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DeptException(e.getMessage());
		}
		return list;
	}

	// 부서 수정
	@Override
	public void update(Dept dept) throws DeptException {
		try {
			session.update(MAPPER_NS + ".update-dept", dept);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DeptException(e.getMessage());
		}
		
	}

	// 부서 삭제
	@Override
	public void delete(String deptNo) throws DeptException {
		try {
			session.delete(MAPPER_NS + ".delete-dept", deptNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DeptException(e.getMessage());
		}
		
	}

}
