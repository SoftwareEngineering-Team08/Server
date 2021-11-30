CREATE DATABASE IF NOT EXISTS sogong;
use sogong;

CREATE TABLE owner(
		onum INT AUTO_INCREMENT,
		id VARCHAR(100),
		pw VARCHAR(100),
		oname VARCHAR(100),
		PRIMARY KEY(onum));

CREATE TABLE region(
		rid INT AUTO_INCREMENT,
		rname VARCHAR(100),
		stage INT,
		PRIMARY KEY(rid));

CREATE TABLE shop(
		sid INT AUTO_INCREMENT,
		bussinessType VARCHAR(100),
		sname VARCHAR(100),
		rid INT,
		maxPeople INT,
		onum INT,
		PRIMARY KEY(sid),
		FOREIGN KEY (rid) references region(rid),
		FOREIGN KEY (onum) references owner(onum) on update cascade on delete cascade);

INSERT INTO region(rname, stage) VALUES ('Seoul', 3);
INSERT INTO region(rname, stage) VALUES ('Daejeon', 3);
INSERT INTO region(rname, stage) VALUES ('Daegu', 2);
INSERT INTO region(rname, stage) VALUES ('Busan', 3);
INSERT INTO region(rname, stage) VALUES ('Gwangju', 2);
INSERT INTO region(rname, stage) VALUES ('Ulsan', 2);
INSERT INTO region(rname, stage) VALUES ('Jeju', 1);

INSERT INTO owner(id, pw, oname) VALUES ('dong', '1234', 'ldh');
INSERT INTO owner(id, pw, oname) VALUES ('oh', '1234', 'ohg');
INSERT INTO owner(id, pw, oname) VALUES ('soo', '1234', 'cjs');

INSERT INTO shop(bussinessType, sname, rid, maxPeople, onum) VALUES ('academy', 'etoos', 1, 30, 1);
INSERT INTO shop(bussinessType, sname, rid, maxPeople, onum) VALUES ('gym', 'healchang', 3, 50, 2);
INSERT INTO shop(bussinessType, sname, rid, maxPeople, onum) VALUES ('bar', 'Daebak', 7, 20, 2);
INSERT INTO shop(bussinessType, sname, rid, maxPeople, onum) VALUES ('restaurant', 'Starbucks', 2, 20, 2);

