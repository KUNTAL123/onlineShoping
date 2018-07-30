Create TABLE category(

 id IDENTITY,
 name VARCHAR(50),
 description VARCHAR(250),
 image_url VARCHAR(50),
 is_active BOOLEAN,
 
 CONSTRAINT  pk_category_id PRIMARY KEY(id)

);

insert into category(name,description,image_url,is_active)values('Laptop','this is a description of Laptop','c_1.png','true');
insert into category(name,description,image_url,is_active)values('Telivision','this is a description of Television','c_2.png','true');
insert into category(name,description,image_url,is_active)values('Mobile','this is a description of Moblile','c_3.png','true');


CREATE TABLE user_detail (
id IDENTITY,
first_name varchar(50),
last_name varchar(50),
role varchar(50),
enabled boolean,
password varchar(50),
email varchar(50),
contanct_number varchar(15),
CONSTRAINT pk_user_id PRIMARY KEY(id),
);

insert into user_detail (first_name,last_name,role,enabled,password,email,contanct_number) values
('Birat','Kholi','Admin','true','123','k@gmail.com','00000000000');

insert into user_detail (first_name,last_name,role,enabled,password,email,contanct_number) values
('Anpam','Kher','user','true','345','kher@gmail.com','00000000000');

insert into user_detail (first_name,last_name,role,enabled,password,email,contanct_number) values
('Soni','Sood','user','true','err1','s@gmail.com','00000000000');



CREATE TABLE product(
id IDENTITY,
code varchar(20),
name varchar(50),
brand varchar(50),
description varchar(255),
unit_price DECIMAL(10,2),
quantity INT,
is_active BOOLEAN,
category_id INT,
supplier_id INT,
purchases INT DEFAULT 0,
views INT DEFAULT 0,
CONSTRAINT pk_product_id PRIMARY KEY(id),
CONSTRAINT fk_product_category_id FOREIGN KEY (category_id)REFERENCES category(id),
CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id)REFERENCES user_detail(id),

);

INSERT INTO PRODUCT (code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
values ('PRADABC123DEFX','iphone 5S','apple','this is one of the best phone available in the Market','25000','3','true','3','3','0','0');
INSERT INTO PRODUCT (code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
values ('PRADDEF123DEFX','Sumsang 7S','Sumsang','this is smartphone by Samsung','3000','3','true','3','3','0','0');
INSERT INTO PRODUCT (code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
values ('PRADEFG123DEFX','google pixel','google','this is one of smart phone of samsung','25000','3','true','3','3','0','0');

INSERT INTO PRODUCT (code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
values ('PRADHIJ123DEFX','Mack booke pro','apple','this is one of the best laptop available in the Market','80000','3','true','3','3','0','0');

INSERT INTO PRODUCT (code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
values ('PRAKLM123DEFX','Dell Latitde E6510','del','this is one of the best laptop available in the Market','60000','3','true','3','3','0','0');

