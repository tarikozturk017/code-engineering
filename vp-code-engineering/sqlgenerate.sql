CREATE TABLE customer (id int(10) NOT NULL AUTO_INCREMENT, name varchar(40) NOT NULL, address varchar(255), email varchar(30) NOT NULL UNIQUE, PRIMARY KEY (id));
CREATE TABLE account (acc_no char(8) NOT NULL, creation_date date NOT NULL, balance double DEFAULT 0.0 NOT NULL, PRIMARY KEY (acc_no));
CREATE TABLE customer_account (customerid int(10) NOT NULL, accountacc_no char(8) NOT NULL, PRIMARY KEY (customerid, accountacc_no));
ALTER TABLE customer_account ADD CONSTRAINT FKcustomer_a553823 FOREIGN KEY (customerid) REFERENCES customer (id);
ALTER TABLE customer_account ADD CONSTRAINT FKcustomer_a404216 FOREIGN KEY (accountacc_no) REFERENCES account (acc_no);
