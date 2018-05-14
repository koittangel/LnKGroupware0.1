package com.lnk.model;

import java.io.Serializable;

public class Grade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer gradeNo;			// 직위권한 번호
	private String gradeName;			// 직위권한 명
	
	public Grade() {}

	public Grade(Integer gradeNo, String gradeName) {
		this.gradeNo = gradeNo;
		this.gradeName = gradeName;
	}

	public Integer getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(Integer gradeNo) {
		this.gradeNo = gradeNo;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gradeName == null) ? 0 : gradeName.hashCode());
		result = prime * result + ((gradeNo == null) ? 0 : gradeNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Grade)) {
			return false;
		}
		
		Grade other = (Grade) obj;
		if (this.gradeNo.equals(other.gradeNo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Grade [gradeNo=");
		builder.append(gradeNo);
		builder.append(", gradeName=");
		builder.append(gradeName);
		builder.append("]");
		return builder.toString();
	}

}