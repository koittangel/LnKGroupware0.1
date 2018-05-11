SHOW TABLES;

DROP TABLE vacation;
DROP TABLE retire;
DROP TABLE report;
DROP TABLE connection;
DROP TABLE emp;
DROP TABLE grade;
DROP TABLE document;
DROP TABLE dept;


# 부서 
CREATE TABLE dept (
	dept_no		INT				NOT NULL		PRIMARY KEY,
	dept_name	VARCHAR(20) 	NOT NULL
);


# 그룹웨어 사용 권한이자 직위 (관리자, 사장, 이사, 부장, 대리, 사원)
CREATE TABLE grade (
	grade_no		INT				NOT NULL	PRIMARY KEY,
	grade_name		VARCHAR(30)		NOT NULL
);


# 결재문서번호 
CREATE TABLE document (
	document_no		INT				NOT NULL		PRIMARY KEY,
	documnet_name	VARCHAR(30)		NOT NULL
);


# 사원 
CREATE TABLE emp (
	emp_no			INT				NOT NULL 	AUTO_INCREMENT		PRIMARY KEY,
	emp_name		VARCHAR(20)		NOT NULL,
	password		VARCHAR(20)		NOT NULL,
	dept_no			INT				NOT NULL,
	grade_no		INT				NOT NULL,
	email			VARCHAR(40)		NOT NULL,
	hire_date		DATE			NOT NULL,
	photo			VARCHAR(255), 
	FOREIGN KEY (dept_no)		REFERENCES dept(dept_no),
	FOREIGN KEY (grade_no)		REFERENCES grade(grade_no)
);



# 권한 연결
CREATE TABLE connection (
	emp_no			INT		NOT NULL,
	grade_no		INT		NOT NULL,
	FOREIGN KEY (emp_no)		REFERENCES	emp(emp_no),
	FOREIGN	 KEY (grade_no)		REFERENCES grade(grade_no) 
);



# 업무보고서
CREATE TABLE report (
	report_no		INT				NOT NULL	AUTO_INCREMENT		PRIMARY KEY,
	dept_no			INT 			NOT NULL,
	grade_no		INT 			NOT NULL,
	emp_no			INT 			NOT NULL,
	document_no		INT				NOT NULL,
	report_01		VARCHAR(100)	NOT NULL,
	report_02		VARCHAR(255)	NOT NULL,
	report_03		VARCHAR(255),
	reg_date		DATE			NOT NULL,
	modi_date		DATE,
	state			VARCHAR(10)		NOT NULL,
	FOREIGN KEY (dept_no)		REFERENCES dept(dept_no),
	FOREIGN KEY (grade_no)		REFERENCES grade(grade_no),
	FOREIGN KEY (emp_no)		REFERENCES emp(emp_no),
	FOREIGN KEY (document_no)	REFERENCES document(document_no)
	
);


# 휴가신청서
CREATE TABLE vacation (
	vacation_no		INT				NOT NULL	AUTO_INCREMENT		PRIMARY KEY,
	dept_no			INT 			NOT NULL,
	grade_no		INT 			NOT NULL,
	emp_no			INT 			NOT NULL,
	document_no		INT				NOT NULL,
	vacation_01		VARCHAR(10)		NOT NULL,
	vacation_02		INT				NOT NULL,
	vacation_03		DATE			NOT NULL,
	vacation_04		DATE			NOT NULL,
	vacation_05		VARCHAR(255)	NOT NULL,	
	reg_date		DATE			NOT NULL,
	modi_date		DATE,
	state			VARCHAR(10)		NOT NULL,
	FOREIGN KEY (dept_no)		REFERENCES dept(dept_no),
	FOREIGN KEY (grade_no)		REFERENCES grade(grade_no),
	FOREIGN KEY (emp_no)		REFERENCES emp(emp_no),
	FOREIGN KEY (document_no)	REFERENCES document(document_no)
);


# 퇴직신청서
CREATE TABLE retire (
	retire_no		INT				NOT NULL	AUTO_INCREMENT		PRIMARY KEY,
	dept_no			INT 			NOT NULL,
	grade_no		INT 			NOT NULL,
	emp_no			INT 			NOT NULL,
	document_no		INT				NOT NULL,
	retire_01		VARCHAR(20)		NOT NULL,
	retire_02		DATE			NOT NULL,
	retire_03		VARCHAR(255)	NOT NULL,
	retire_04		VARCHAR(255),
	reg_date		DATE			NOT NULL,
	modi_date		DATE,
	state			VARCHAR(10)		NOT NULL,
	FOREIGN KEY (dept_no)		REFERENCES dept(dept_no),
	FOREIGN KEY (grade_no)		REFERENCES grade(grade_no),
	FOREIGN KEY (emp_no)		REFERENCES emp(emp_no),
	FOREIGN KEY (document_no)	REFERENCES document(document_no)
);
