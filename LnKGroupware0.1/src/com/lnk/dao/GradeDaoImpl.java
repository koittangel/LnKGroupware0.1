package com.lnk.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lnk.exception.EmpException;
import com.lnk.model.Grade;

@Repository
public class GradeDaoImpl implements GradeDao {
	
	private static final String MAPPER_NS = Grade.class.getName();
	
	@Autowired 
	private SqlSession session;
	
	public GradeDaoImpl() {}

	@Override
	public Grade select(Integer gradeNo) throws EmpException {
		Grade grade = null;
		
		try {
			grade = session.selectOne(MAPPER_NS + ".select_grade", gradeNo);
		} catch (Exception e) {
			throw new EmpException(e.getMessage());
		}
		return grade;
	}
}
