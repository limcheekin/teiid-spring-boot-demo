DROP TABLE IF EXISTS 
product_symbols;

CREATE TABLE product_symbols (
	productId VARCHAR(10) NOT NULL,
	symbolType INTEGER,
	symbol VARCHAR(10) NOT NULL,
	cusip VARCHAR(20),
	CONSTRAINT PK_ProductId PRIMARY KEY (productId)
);
