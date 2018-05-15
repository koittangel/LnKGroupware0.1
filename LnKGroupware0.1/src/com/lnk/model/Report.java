package com.lnk.model;

import java.io.Serializable;
import java.util.Date;

public class Report implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer reportNo;			// 업무 보고서 번호
	private Integer deptNo;				// 부서 번호
	private Integer gradeNo;			// 직위 번호
	private Integer empNo;				// 사원 번호
	private Integer documentNo;			// 문서 종류 번호
	private String report01;			// 주요 업무
	private String report02;			// 업무 내용
	private String report03;			// 비고
	private Date regDate;				// 작성일
	private Date modiDate;				// 수정일
	private String state;				// 결재 상태
	private Dept dept;					// 부서 정보
	private Grade grade;				// 직위 정보
	private Emp emp;					// 사원 정보
	private Document document;			// 문서 종류 정보
	
	public Report() {}

	public Report(Integer reportNo, Integer deptNo, Integer gradeNo, Integer empNo, Integer documentNo, String report01,
			String report02, String report03, Date regDate, Date modiDate, String state) {
		this.reportNo = reportNo;
		this.deptNo = deptNo;
		this.gradeNo = gradeNo;
		this.empNo = empNo;
		this.documentNo = documentNo;
		this.report01 = report01;
		this.report02 = report02;
		this.report03 = report03;
		this.regDate = regDate;
		this.modiDate = modiDate;
		this.state = state;
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
		result = prime * result + ((report01 == null) ? 0 : report01.hashCode());
		result = prime * result + ((report02 == null) ? 0 : report02.hashCode());
		result = prime * result + ((report03 == null) ? 0 : report03.hashCode());
		result = prime * result + ((reportNo == null) ? 0 : reportNo.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Report)) {
			return false;
		}
		Report other = (Report) obj;
		if (this.reportNo.equals(other.reportNo)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Report [reportNo=");
		builder.append(reportNo);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append(", gradeNo=");
		builder.append(gradeNo);
		builder.append(", empNo=");
		builder.append(empNo);
		builder.append(", documentNo=");
		builder.append(documentNo);
		builder.append(", report01=");
		builder.append(report01);
		builder.append(", report02=");
		builder.append(report02);
		builder.append(", report03=");
		builder.append(report03);
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
