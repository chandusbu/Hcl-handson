use electricity;
ALTER TABLE building RENAME COLUMN owner_name TO building_owner_name;
desc building;
 ALTER TABLE building MODIFY COLUMN address varchar(255);
 desc building;
 CREATE TABLE Persons (  
    ID int NOT NULL,  
   commercial_connection_name varchar(45) NOT NULL,  
    check_connection_name varchar(11) CHECK (check_connection_name='commercial' or'home'));  
ALTER TABLE electricity_connection_type
ADD COLUMN commercial_connection_name  VARCHAR(15) AFTER connection_name;
ALTER TABLE electricity_connection_type
ADD COLUMN home_connection_name  VARCHAR(15) AFTER connection_name;
alter table electricity_connection_type add CONSTRAINT check_connection_name  check (check_connection_name='commercial_connection_name');
 ALTER TABLE building RENAME TO building_details; 
 
 desc building_details;
 drop table slab;
 drop table building_details;
 insert into electricity_connection_type values(1,'home','airtel','gg');
 insert into electricity_connection_type values(2,'commercial','jio','kk');
 insert into electricity_connection_type values(7,'home','voda','ii');
 insert into electricity_connection_type values(8,'home','bsnl','uu');
 insert into electricity_connection_type values(9,'home','uninor','nn');
 
 
 desc electricity_connection_type;
 desc slab;
 insert into slab  values(4,01,20,45.0);
 insert into slab values(5,03,34,66.0);
 insert into slab values(6,04,44,55.0);
select * from slab;
select*from electricity_connection_type;
select*from slab;
select * from slab where from_unit like "1%";
insert into building_type values(1,'florence');
insert into building_type values(3,'hira');
insert into building_type values(4,'aqua');
insert into building_type values(5,'moksha');
insert into building_type values(6,'hgf');
insert into building_type values(7,'uyu','forum');
insert into building_type values(8,'kk','city');
insert into building_type values(9,'home','orion');
 
 
select * from building_type;
alter table building_type add column shopping_mall varchar(100);
ALTER TABLE building_type RENAME COLUMN shopping_mall TO mall;

desc building_type;
select*from slab;
DELETE FROM slab;
DELETE FROM building_type WHERE name = 'home';
desc building_type;
select * from building_type;
select * from building_type;
delete from building_type where name='home';
select * from electricity_connection_type order by connection_name;
select *from building_type order by name;
select * from building_details order by owner_name;
create table building(id int primary key,owner_name varchar(100),address varchar(100),
Foreign key(id) references building_type(id));
desc building_type;
desc building;
insert into building values(1,'chandu','chennai',836474);
insert into building values(2,'chandu','chennai',848748);
insert into building values(3,'chandu','chennai',7667);
insert into building values(4,'home','voda',8798);

 
create table meter(id int primary key,meter_number varchar(100),FOREIGN KEY (id) REFERENCES building(id));
desc meter;
insert into meter values(1,300);
insert into meter values(2,400);
insert into meter values(3,500);
insert into meter values(7,600);
insert into meter values(8,600);
insert into meter values(9,600);
insert into meter values(4,600);
insert into meter values(5,600);




create table bill(id int primary key,foreign key(id) references meter(id),
month int(11),year int(11),due_date date,total_units int(11),
payable_amount FLOAT,is_payed TINYINT(1),payment_date DATE,fine_amount float);
insert into bill values(1,08,1999,"2020-08-09",6000,450.4,44,"2020-09-09",599.8);
insert into bill values(2,08,1999,"2020-08-10",5000,450.4,44,"2020-09-10",599.8);
insert into bill values(3,08,1999,"2020-08-28",4000,450.4,44,"2020-09-09",599.8);
insert into bill values(4,09,2020,'2017-10-01', 7000,458.4,88,"2018-12-09",1000.6);

DESC bill;
create table electricity_reading(id int primary key,foreign key(id) references meter(id),day date,h1 int(11),
h2 int(11),h3 int(11),h4 int(11),h5 int(11),h6 int(11),h7 int(11),h8 int(11),h9 int(11),h10 int(11),total_units int(11));
desc electricity_reading;
insert into electricity_reading values(1,"2017-06-15",100,200,300,600,399,544,766,566,788,543,2000);
select * from electricity_connection_type order by connection_name asc;
select * from building_type order by name asc;
select * from building order by owner_name asc;
insert into electricity_reading values(2,"2017-06-15",100,200,300,600,399,544,766,566,788,543,4000);
insert into electricity_reading values(3,"2017-06-15",100,200,300,600,399,544,766,566,788,543,9000);
desc electricity_reading;
insert into electricity_reading values(9,"2017-06-15",100,200,300,600,399,544,766,566,788,543,500);
insert into electricity_reading values(8,"2017-06-15",100,200,300,600,399,544,766,566,788,543,1000);
insert into electricity_reading values(7,"2017-06-15",100,200,300,600,399,544,766,566,788,543,999);

select * from electricity_reading order by total_units desc;
select meter_number from meter;
desc building;
alter table building add column contact_number int(10);
desc building;
insert into building values(4,'chandu','chennai',83175871);
insert into building values(5,'chandu','chennai',900325780);
insert into building values(6,'chandu','chennai',976305386);
insert into building values(8,'manu','hyd',97678);
insert into building values(9,'manish','kerala',8899);
select owner_name,contact_number from building order by owner_name asc;
select payable_amount,fine_amount,total_units from bill order by total_units desc;
desc slab;
select * from slab order by from_unit asc;
insert into building values(7,'Nicholas','hyd',8776564);
select * from building where owner_name='Nicholas';
select * from bill where total_units>1000 order by total_units desc;
select owner_name, address , contact_number from building  order by owner_name asc;
select * from building where owner_name like 'm%' order by owner_name asc;
select * from building where id=2 order by owner_name asc; 
select * from electricity_reading where total_units between 500 and 1000 order by total_units asc;
desc electricity_reading;
alter table electricity_reading add column h13 int(11); 
alter table electricity_reading add column h14 int(11);
insert into electricity_reading values(1,"2020-09-22",60,23,24,45,46,78,89,23,70,59,3477,50,33);
insert into electricity_reading values(2,"2020-10-01",60,23,24,45,46,78,89,23,70,59,2000,88,55);
insert into electricity_reading values(3,"2020-09-22",60,23,24,45,46,78,89,23,70,59,3477,50,33);
select* from  electricity_reading where (h13<h14) order by total_units desc;




