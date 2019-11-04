CREATE TABLE contacts(

	contactID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,
	firstName varchar(50),
	lastName varchar(50),
	contactNo varchar(15),`customer``dept`
	emailId varchar(100)
);

INSERT INTO contacts (firstName, lastName, contactNo, emailId)
VALUES ('Ravi', 'Maurya', 8898356801, 'ravi@gmail'),('Sunny', 'Maurya', 7021564446, 'sunny@gmail'),('Nilam', 'Menat', 9137498713, 'nilam@gmail');

SELECT * FROM contacts;
DROP TABLE contacts;

ALTER TABLE `swabhav``swabhav`