CREATE TABLE customer(
	customerId int NOT NULL PRIMARY KEY,
	name varchar(50)
	
);

INSERT INTO customer(customerId, name)
VALUES(101,'Ravi')


CREATE TABLE orders(
	orderId int NOT NULL PRIMARY KEY,
	orderDate varchar(150),
	customerId int NOT NULL,
	FOREIGN KEY(customerId)
		REFERENCES customer(customerId)
);

INSERT INTO orders(orderId, orderDate, customerId)
VALUES(201,'10/08/2019',101)


CREATE TABLE lineItem(
	lineItemId int NOT NULL PRIMARY KEY,
	quantity int,
	orderId int NOT NULL,
	FOREIGN KEY(orderId)
		REFERENCES orders(orderId)
);


CREATE TABLE product(
	productId int NOT NULL PRIMARY KEY,
	productName varchar(250),
	price int,
	lineItemId int NOT NULL,
	FOREIGN KEY(lineItemId)
		REFERENCES lineItem(lineItemId)
);

SELECT * FROM product;
SELECT * FROM lineItem;
SELECT * FROM orders;
SELECT * FROM customer;
