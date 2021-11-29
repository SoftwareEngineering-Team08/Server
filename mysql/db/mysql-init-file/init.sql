CREATE DATABASE IF NOT EXISTS sogong;
use sogong;

CREATE TABLE owner(
		onum INT AUTO_INCREMENT,
		id VARCHAR(100),
		pw VARCHAR(100),
		name VARCHAR(100),
		PRIMARY KEY(onum));

CREATE TABLE shop(
		sid INT AUTO_INCREMENT,
		bussinessType VARCHAR(100),
		sname VARCHAR(100),
		location VARCHAR(100),
		maxPeople INT,
		limitPeople INT,
		onum INT,
		PRIMARY KEY(SID),
		foreign key (onum) references owner(onum) on update cascade on delete cascade);

CREATE TABLE distance(
		did INT AUTO_INCREMENT,
		location VARCHAR(100),
		stage INT,
		parameter FLOAT,
		PRIMARY KEY(did));

INSERT INTO owner(id, pw, name) VALUES ('dong', '1234', 'ldh');
INSERT INTO owner(id, pw, name) VALUES ('oh', '1234', 'ohg');
INSERT INTO owner(id, pw, name) VALUES ('soo', '1234', 'cjs');

INSERT INTO shop(bussinessType, sname, location, maxPeople, onum) VALUES ('academy', 'etoos', 'sejong', 30, 1);
INSERT INTO shop(bussinessType, sname, location, maxPeople, onum) VALUES ('gym', 'healchang', 'seoul', 50, 2);
INSERT INTO shop(bussinessType, sname, location, maxPeople, onum) VALUES ('bar', 'Daebak', 'busan', 20, 2);
INSERT INTO shop(bussinessType, sname, location, maxPeople, onum) VALUES ('restaurant', 'Starbucks', 'daejeon', 20, 2);

INSERT INTO distance(location, stage, parameter) VALUES ('seoul', 3, 0.25);
INSERT INTO distance(location, stage, parameter) VALUES ('gyeungi', 3, 0.25);
INSERT INTO distance(location, stage, parameter) VALUES ('daejeon', 2, 0.5);
INSERT INTO distance(location, stage, parameter) VALUES ('daegu', 3, 0.25);
INSERT INTO distance(location, stage, parameter) VALUES ('sejong', 2, 0.5);
INSERT INTO distance(location, stage, parameter) VALUES ('busan', 2, 0.5);
INSERT INTO distance(location, stage, parameter) VALUES ('jeju', 1, 0.7);
