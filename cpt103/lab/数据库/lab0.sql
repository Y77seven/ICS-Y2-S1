show databases;
USE mydb;
CREATE TABLE account_balance(
	card_id VARCHAR(20) PRIMARY KEY,
	holder_name VARCHAR(50),
    balance DECIMAL(11,2)
);

INSERT INTO account_balance (card_id, holder_name, balance) VALUES 
('54321111', 'Don Peterson', 99999999.12),
('47182222', 'Maya Jones', 6250.23),
('66173333', 'Harry Graham', 20.33);
show TABLES;
DESCRIBE account_balance;
SELECT * FROM account_balance;

