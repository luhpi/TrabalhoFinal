create database reservasala;
use reservasala;

CREATE TABLE usuarios(
id integer(10) primary key,
nome varchar(100),
senha varchar(30));

INSERT INTO reservasala VALUES(1,"Alan Turing","thankmelater");
INSERT INTO reservasala VALUES(2,"Margaret Dayhoff","takeadayhoff");
INSERT INTO reservasala VALUES(3,"Alessandra Dahmer","justcallmeduda");
INSERT INTO reservasala VALUES(4,"Waluigi","youcantescapeme");
INSERT INTO reservasala VALUES(5,"Hideo Kojima","konamicode");
INSERT INTO reservasala VALUES(6,"Todd Howard","kingcrimson");

SELECT * FROM reservasala;