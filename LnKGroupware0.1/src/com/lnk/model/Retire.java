package com.lnk.model;

import java.io.Serializable;
import java.util.Date;

public class Retire implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer retireNo;				// 퇴직 신청서 번호
	private Integer deptNo;					// 부서 번호
	private Integer gradeNo;				// 직위 번호
	private Integer empNo;					// 사원 번호
	private Integer documentNo;				// 문서 종류 번호
	private String retire01;				// 근속 년수
	private Date retire02;					// 퇴직 희망일
	private String retire03;				// 내용
	private String retire04;				// 비고
	private Date regDate;					// 작성일
	private Date modiDate;					// 수정일
	private String state;					// 결재 상태
	private Dept dept;						// 부서 정보
	private Grade grade;					// 직위 정보
	private Emp emp;						// 사원 정보
	private Document document;				// 문서 종류 정보
	
	public Retire() {}

	public Retire(Integer retireNo, Integer deptNo, Integer gradeNo, Integer empNo, Integer documentNo, String retire01,
			Date retire02, String retire03, String retire04, Date regDate, Date modiDate, String state) {
		super();
		this.retireNo = retireNo;
		this.deptNo = deptNo;
		this.gradeNo = gradeNo;
		this.empNo = empNo;
		this.documentNo = documentNo;
		this.retire01 = retire01;
		this.retire02 = retire02;
		this.retire03 = retire03;
		this.retire04 = retire04;
		this.regDate = regDate;
		this.modiDate = modiDate;
		this.state = state;
	}

	public Integer getRetireNo() {
		return retireNo;
	}

	public void setRetireNo(Integer retireNo) {
		this.retireNo = retireNo;
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

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Integer getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(Integer documentNo) {
		this.documentNo = documentNo;
	}

	public String getRetire01() {
		return retire01;
	}

	public void setRetire01(String retire01) {
		this.retire01 = retire01;
	}

	public Date getRetire02() {
		return retire02;
	}

	public void setRetire02(Date retire02) {
		this.retire02 = retire02;
	}

	public String getRetire03() {
		return retire03;
	}

	public void setRetire03(String retire03) {
		this.retire03 = retire03;
	}

	public String getRetire04() {
		return retire04;
	}

	public void setRetire04(String retire04) {
		this.retire04 = retire04;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getModiDate() {
		return modiDate;
	}

	public void setModiDate(Date modiDate) {
		this.modiDate = modiDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((deptNo == null) ? 0 : deptNo.hashCode());
		result = prime * result + ((document == null) ? 0 : document.hashCode());
		result = prime * result + ((documentNo == null) ? 0 : documentNo.hashCode());
		result = prime * result + ((emp == null) ? 0 : emp.hashCode());
		result = prime * result + ((empNo == null) ? 0 : empNo.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((gradeNo == null) ? 0 : gradeNo.hashCode());
		result = prime * result + ((modiDate == null) ? 0 : modiDate.hashCode());
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((retire01 == null) ? 0 : retire01.hashCode());
		result = prime * result + ((retire02 == null) ? 0 : retire02.hashCode());
		result = prime * result + ((retire03 == null) ? 0 : retire03.hashCode());
		result = prime * result + ((retire04 == null) ? 0 : retire04.hashCode());
		result = prime * result + ((retireNo == null) ? 0 : retireNo.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Retire)) {
			return false;
		}
		
		Retire other = (Retire) obj;
		if (this.retireNo.equals(other.retireNo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Retire [retireNo=");
		builder.append(retireNo);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append(", gradeNo=");
		builder.append(gradeNo);
		builder.append(", empNo=");
		builder.append(empNo);
		builder.append(", documentNo=");
		builder.append(documentNo);
		builder.append(", retire01=");
		builder.append(retire01);
		builder.append(", retire02=");
		builder.append(retire02);
		builder.append(", retire03=");
		builder.append(retire03);
		builder.append(", retire04=");
		builder.append(retire04);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", modiDate=");
		builder.append(modiDate);
		builder.append(", state=");
		builder.append(state);
		builder.append(", dept=");
		builder.append(dept);
		builder.append(", grade=");
		builder.append(grade);
		builder.append(", emp=");
		builder.append(emp);
		builder.append(", document=");
		builder.append(document);
		builder.append("]");
		return builder.toString();
	}

}
