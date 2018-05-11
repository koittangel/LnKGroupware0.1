# 결재
CREATE TABLE approval (
	approval_no		INT				NOT NULL		AUTO_INCREMENT=100000		PRIMARY KEY,
	dept_no			INT,
	position_no		INT,
	title			VARCHAR(30)		NOT NULL,
	writer			VARCHAR(20)		NOT NULL,
	reg_date		DATE			NOT NULL,
	modi_date		DATE,
	content			VARCHAR(255)	NOT NULL,
	state			VARCHAR(20)		NOT NULL,
	FOREIGN KEY (writer) REFERENCES emp(emp_no)
);

# 직급
CREATE TABLE grade (
	grade_no			INT				NOT NULL		PRIMARY KEY,
	grade_name		VARCHAR(20)		NOT NULL
);
