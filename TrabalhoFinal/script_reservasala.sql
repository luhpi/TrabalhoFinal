create database reservasala;
use reservasala;
SET DATEFORMAT dmy;

-- usuários para autenticação

CREATE TABLE usuarios(
id integer primary key not null auto_increment,
nome varchar(100),
senha varchar(30),
apoio boolean);

INSERT INTO reservasala VALUES("Alan Turing","thankmelater", false);
INSERT INTO reservasala VALUES("Margaret Dayhoff","takeadayhoff", true);
INSERT INTO reservasala VALUES("Alessandra Dahmer","justcallmeduda", true);
INSERT INTO reservasala VALUES("Waluigi","youcantescapeme", false);
INSERT INTO reservasala VALUES("Hideo Kojima","konamicode", false);
INSERT INTO reservasala VALUES("Todd Howard","kingcrimson", false);
INSERT INTO reservasala VALUES("Keanu Reaves", "doggo", true);
INSERT INTO reservasala VALUES("aluno", "aluno", false);
INSERT INTO reservasala VALUES("apoio", "apoio", true);

-- solicitante da reserva
CREATE TABLE solicitante(
id_sol integer primary key not null auto_increment,
curso varchar(100),
nome_sol varchar(100),
telefone varchar(11),
email varchar(100)
);

-- atividade da reserva
CREATE TABLE reserva(
id_sol integer foreign key REFERENCES solicitante(id_sol),
id_res integer primary key not null auto_increment,
atividade varchar(100),
data_req_ini date,
dara_req_fin date
);

-- dados do apoio para a reserva
CREATE TABLE apoio(
id_res integer foreign key REFERENCES reserva(id_res),
id_apo integer primary key not null auto_increment,
sala varchar(100),
servidor varchar(100),
obs varchar(200),
data_res_ini date,
dara_res_fin date
);

-- SELECT * FROM reservasala;
