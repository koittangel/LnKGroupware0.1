package com.lnk.dao;

import com.lnk.exception.EmpException;
import com.lnk.model.Grade;

public interface GradeDao {
	
	public Grade select(Integer gradeNo) throws EmpException;

}
