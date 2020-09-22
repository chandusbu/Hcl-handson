create database Electricity;
use Electricity;
create table electricity_connection_type(id int primary key,connection_name varchar(30) Not NULL);
desc electricity_connection_type;
create table slab(id int primary key,FOREIGN KEY(id) REFERENCES electricity_connection_type(id),
from_unit int(11) NOT NULL,to_unit int(11) NOT NULL,rate Float NOT NULL);
create table building_type(id int primary key,name varchar(100),FOREIGN KEY (id) REFERENCES 
electricity_connection_type(id));
create table building(id int(11) primary key,owner_name varchar(100) NOT NULL,address varchar(100) NOT NULL,
FOREIGN KEY(id) REFERENCES  building_type(id),contact_number varchar(100),email_address varchar(100));
