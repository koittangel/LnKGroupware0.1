package com.lnk.model;

import java.io.Serializable;

public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer deptNo;			// 부서 번호
	private String deptName;		// 부서 명 
	
	public Dept() {}

	public Dept(Integer deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + ((deptNo == null) ? 0 : deptNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Dept)) {
			return false;
		}
		
		Dept other = (Dept) obj;
		if (this.deptNo.equals(other.deptNo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dept [deptNo=");
		builder.append(deptNo);
		builder.append(", deptName=");
		builder.append(deptName);
		builder.append("]");
		return builder.toString();
	}
	
}
