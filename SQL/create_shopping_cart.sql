CREATE TABLE customer(
	customerId int NOT NULL PRIMARY KEY,
	name varchar(50) NOT NULL
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
	quantity int NOT NULL,
	orderId int NOT NULL,
	FOREIGN KEY(orderId)
		REFERENCES orders(orderId)
);

INSERT INTO lineItem(lineItemId, quantity, orderId)
VALUES(301,2,201)

CREATE TABLE product(
	productId int NOT NULL PRIMARY KEY,
	productName varchar(250) NOT NULL,
	price int NOT NULL,
	FOREIGN KEY(productId)
		REFERENCES lineItem(lineItemId)
);

DROP TABLE product

INSERT INTO product(productId, productName, price)
VALUES(301,'Book',255)

SELECT * FROM product;
SELECT * FROM lineItem;
SELECT * FROM orders;
SELECT * FROM customer;
