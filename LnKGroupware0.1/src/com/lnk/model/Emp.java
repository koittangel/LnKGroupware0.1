package com.lnk.model;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer empNo;				// 사원 번호
	private String empName;				// 사원 성명
	private String password;			// 비밀 번호
	private Integer deptNo;				// 부서 번호
	private Integer gradeNo;			// 직위 번호
	private String email;				// 이메일
	private Date hireDate;				// 입사일
	private String photo;				// 프로필 사진
	private Dept dept; 					// 부서 정보 
	private Grade grade;				// 직위 정보
	
	public Emp() {}

	public Emp(Integer empNo, String empName, String password, Integer deptNo, Integer gradeNo, String email,
			Date hireDate, String photo) {
		this.empNo = empNo;
		this.empName = empName;
		this.password = password;
		this.deptNo = deptNo;
		this.gradeNo = gradeNo;
		this.email = email;
		this.hireDate = hireDate;
		this.photo = photo;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Integer getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(Integer gradeNo) {
		this.gradeNo = gradeNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((deptNo == null) ? 0 : deptNo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empNo == null) ? 0 : empNo.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((gradeNo == null) ? 0 : gradeNo.hashCode());
		result = prime * result + ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if  (!(obj instanceof Emp)) {
			return false;
		}
		
		Emp other = (Emp) obj;
		if (this.empNo.equals(other.empNo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [empNo=");
		builder.append(empNo);
		builder.append(", empName=");
		builder.append(empName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append(", gradeNo=");
		builder.append(gradeNo);
		builder.append(", email=");
		builder.append(email);
		builder.append(", hireDate=");
		builder.append(hireDate);
		builder.append(", photo=");
		builder.append(photo);
		builder.append(", dept=");
		builder.append(dept);
		builder.append(", grade=");
		builder.append(grade);
		builder.append("]");
		return builder.toString();
	}

}
