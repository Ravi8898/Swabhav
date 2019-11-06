CREATE TABLE bankmaster(
	name varchar(50) NOT NULL PRIMARY KEY,
	pswd varchar(50) NOT NULL,
	balance double
);

CREATE TABLE banktxn(
	name varchar(50) NOT NULL,
	amount double,
	txntype varchar(10),
	`emp` date,
	FOREIGN KEY(name) 
	REFERENCES bankmaster(name)
);

SELECT * FROM bankmaster;
SELECT * FROM banktxn;

Delete from bankmaster where name='Ravi Maurya';

DROP TABLE banktxn 