CREATE TABLE College(
	collegeId int NOT NULL,
	name varchar(150) NOT NULL,
	description varchar(250),
	PRIMARY KEY(collegeId)
)

CREATE TABLE Students(
	rollNo int NOT NULL,
	name varchar(25) NOT NULL,
	cgpi float NOT NULL,	
	collegeId int NOT NULL,
	PRIMARY KEY(rollNo),
	FOREIGN KEY(collegeId)
		REFERENCES College(collegeId)
);

INSERT INTO college (collegeId, name, description)
VALUES (1,'VIVA','')

INSERT INTO college (collegeId, name)
VALUES (3,'St. Francis')

INSERT INTO college (collegeId, name, description)
VALUES (2,'ATHARVA','This is Atharva College')

INSERT INTO Students (rollNO, name, cgpi, collegeId)
VALUES (101,'Ravi',8.2,1)

INSERT INTO Students (rollNO, name, cgpi,collegeId)
VALUES (102,'Sunny',7.2,1)

INSERT INTO Students (rollNO, name, cgpi)
VALUES (103,'Floyd',7.2,3)

DELETE FROM `Students` WHERE `rollNo`=2

UPDATE `Students` SET `name`='Akash' WHERE `rollNo`=1

ALTER TABLE Students
ADD collegeId float NOT NULL

DROP TABLE College
DROP TABLE Students
SELECT * FROM Students;
SELECT * FROM College

