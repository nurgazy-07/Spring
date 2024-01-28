
-- 1
  create table userr(id serial primary key, name varchar not null, age int);
--CREATE TABLE
  alter table userr drop column name;
--ALTER TABLE
  alter table userr add column user_name varchar;
--ALTER TABLE

-- 2
  create table Animals(id serial primary key, name_animals varchar, animal_color varchar);
--CREATE TABLE
  insert into Animals(id, name_animals, animal_color)
  values(1, 'cat', 'black');
--INSERT 0 1

-- 3
  create table Car(id serial primary key, models_car varchar, color varchar);
--CREATE TABLE
  alter table Car rename column models_car to modell;
--ALTER TABLE

-- 4
  create table Сountry(id serial primary key, name_country varchar);
--CREATE TABLE

-- 5
  create table Kyrgyzstan(id serial primary key, name_countr varchar);
--CREATE TABLE

--6
 create table House(name varchar not null, floors varchar, price int);
--CREATE TABLE

--7
 create table laptop(id int primary key, model varchar not null, price int);
--CREATE TABLE

--8
 create table Toys(name varchar not null, color varchar unique);
--CREATE TABLE

--9
 create table money(banknote varchar not null, how_many varchar);
--CREATE TABLE

--10
 create table factoy(id int primary key, name_factory varchar not null, plant_purpose varchar);
--CREATE TABLE