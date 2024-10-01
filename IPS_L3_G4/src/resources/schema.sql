--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table Employees;
create table  Employees(nif varchar(32) primary key not null, name varchar(32) not null,
 surname varchar(32) not null, birthdate date not null, job varchar(32) not null, number varchar(32) not null, salary int not null);
