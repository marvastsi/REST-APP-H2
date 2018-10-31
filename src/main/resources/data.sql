
DROP TABLE PERSON;

CREATE TABLE PERSON (
    ID INT(6), 
    NAME VARCHAR(100),
    AGE  INT(6),
    SEX VARCHAR(1),
    PRIMARY KEY(ID))
ENGINE=InnoDB;


insert into PERSON
values
      (1,'MARCELO', 30, 'M'),
      (2,'Rosangela', 33, 'F'),
      (3,'Fabio', 30, 'M');




--ALTER TABLE PERSON MODIFY COLUMN SEX VARCHAR(1);
