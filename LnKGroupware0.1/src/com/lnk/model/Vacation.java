package com.lnk.model;

import java.io.Serializable;
import java.util.Date;

public class Vacation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer vacationNo;			// 휴가 신청서 번호
	private Integer deptNo;				// 부서 번호
	private Integer gradeNo;			// 직위 번호
	private Integer empNo;				// 사원 번호
	private Integer documentNo;			// 문서 종류 번호
	private String vacation01;			// 휴가 종류
	private Integer vacation02;			// 휴가 일수
	private Date vacation03;			// 휴가 시작
	private Date vacation04;			// 휴가 종료
	private String vacation05;			// 휴가 사유
	private Date regDate;				// 작성일
	private Date modiDate;				// 수정일
	private String state;				// 결재 상태
	private Dept dept;					// 부서 정보
	private Grade grade;				// 직위 정보
	private Emp emp;					// 사원 정보
	private Document document;			// 문서 종류 정보
	
	public Vacation() {}

	public Vacation(Integer vacationNo, Integer deptNo, Integer gradeNo, Integer empNo, Integer documentNo,
			String vacation01, Integer vacation02, Date vacation03, Date vacation04, String vacation05, Date regDate,
			Date modiDate, String state, Dept dept, Grade grade, Emp emp, Document document) {
		this.vacationNo = vacationNo;
		this.deptNo = deptNo;
		this.gradeNo = gradeNo;
		this.empNo = empNo;
		this.documentNo = documentNo;
		this.vacation01 = vacation01;
		this.vacation02 = vacation02;
		this.vacation03 = vacation03;
		this.vacation04 = vacation04;
		this.vacation05 = vacation05;
		this.regDate = regDate;
		this.modiDate = modiDate;
		this.state = state;
		this.dept = dept;
		this.grade = grade;
		this.emp = emp;
		this.document = document;
	}

	public Integer getVacationNo() {
		return vacationNo;
	}

	public void setVacationNo(Integer vacationNo) {
		this.vacationNo = vacationNo;
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

	public String getVacation01() {
		return vacation01;
	}

	public void setVacation01(String vacation01) {
		this.vacation01 = vacation01;
	}

	public Integer getVacation02() {
		return vacation02;
	}

	public void setVacation02(Integer vacation02) {
		this.vacation02 = vacation02;
	}

	public Date getVacation03() {
		return vacation03;
	}

	public void setVacation03(Date vacation03) {
		this.vacation03 = vacation03;
	}

	public Date getVacation04() {
		return vacation04;
	}

	public void setVacation04(Date vacation04) {
		this.vacation04 = vacation04;
	}

	public String getVacation05() {
		return vacation05;
	}

	public void setVacation05(String vacation05) {
		this.vacation05 = vacation05;
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
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((vacation01 == null) ? 0 : vacation01.hashCode());
		result = prime * result + ((vacation02 == null) ? 0 : vacation02.hashCode());
		result = prime * result + ((vacation03 == null) ? 0 : vacation03.hashCode());
		result = prime * result + ((vacation04 == null) ? 0 : vacation04.hashCode());
		result = prime * result + ((vacation05 == null) ? 0 : vacation05.hashCode());
		result = prime * result + ((vacationNo == null) ? 0 : vacationNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Vacation)) {
			return false;
		}
		
		Vacation other = (Vacation) obj;
		if (this.vacationNo.equals(other.vacationNo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vacation [vacationNo=");
		builder.append(vacationNo);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append(", gradeNo=");
		builder.append(gradeNo);
		builder.append(", empNo=");
		builder.append(empNo);
		builder.append(", documentNo=");
		builder.append(documentNo);
		builder.append(", vacation01=");
		builder.append(vacation01);
		builder.append(", vacation02=");
		builder.append(vacation02);
		builder.append(", vacation03=");
		builder.append(vacation03);
		builder.append(", vacation04=");
		builder.append(vacation04);
		builder.append(", vacation05=");
		builder.append(vacation05);
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
