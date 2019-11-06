CREATE TABLE customers(

	customerId integer NOT NULL AUTO_INCREMENT PRIMARY KEY,
	customerName varchar(50) NOT NULL,
	customerBalance double(10,2)
);

INSERT INTO customers(customerName, customerBalance)
VALUES('Ravi',25000);

CREATE TABLE merchant(

	merchantId integer NOT NULL AUTO_INCREMENT PRIMARY KEY,
	merchantName varchar(50) NOT NULL,
	merchantBalance double(15,2)
);

INSERT INTO merchant(merchantName, merchantBalance)
VALUES('D-Mart',100000);

SELECT * FROM customers;
SELECT * FROM merchant;

start transaction;

UPDATE customers 
SET customerBalance=customerBalance-5000 
WHERE customerId=1;

UPDATE merchant 
SET merchantBalance=merchantBalance+5000 
WHERE merchantIds=2;
commit;