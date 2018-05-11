package com.lnk.model;

public enum GradeNo {
	MASTER(100),
	CEO(200),
	DIRECTOR(201),
	HEAD(202),
	CHEIF(203),
	STAFF(204);
	
	
	private Integer gradeNo;
	
	private GradeNo(Integer gradeNo) {
		this.gradeNo = gradeNo;
	}
	
	public Integer getGradeNo() {
		return this.gradeNo;
	}
}
