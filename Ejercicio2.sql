INSERT INTO alumnos VALUES('Lucas','Manilva','Lopez',123523,'Alhamar 3','M','01-NOV-1979',1);

INSERT INTO alumnos VALUES('Antonia','Lopez','Alcantara',2567567,'Maniquí 21','H','',2);

INSERT INTO alumnos VALUES('Manuel','Alcantara','Pedrós',3123689,'Julian 2','','',2);

INSERT INTO alumnos VALUES('José','Pérez','Caballar',4896765,'Jarcha 5','M','03-FEB-1977',1);



ALTER TABLE alumnos
ADD constraint sex_ch CHECK (SEXO IN('H','M','P'));


INSERT INTO alumnos VALUES('Sergio','Navas','Retal',123543,'','P','',1);



ALTER TABLE PROFESORES ADD edad NUMBER(2) NULL;

ALTER TABLE PROFESORES
ADD constraint rango_edad CHECK ((edad>=18 AND edad<=65));



ALTER TABLE CURSOS add CONSTRAINT max_alum CHECK (maximo_alumnos > 10);



UPDATE cursos
SET num_horas = 100
Where num_horas=80;


ALTER TABLE CURSOS
ADD constraint horas_ch CHECK (num_horas>=100);


ALTER TABLE ALUMNOS
DROP CONSTRAINT SEX_CH;

No, porque hay alumnos distintos que pueden estar matriculados en el mismo curso.

alter table profesores 
drop CONSTRAINT SYS_C007065;

alter tabla cursos
add constraint fecha_ini CHECK (fecha_inicio!=null);


ALTER TABLE profesores
drop constraint profesores_pk cascade;

alter table profesores
add constraint nombre_pk PRIMARY KEY (nombre,apellido1,apellido2);

Da error

Da error 

DELETE FROM Profesores
WHERE Nombre = 'Laura'
And Apellido1='Jiménez';

update alumnos
set fecha_nacimiento='23-DIC-1976'
where dni = 2567567 ;


15)

CREATE TABLE NOMBRE_DE_ALUMNOS (
nombre completo) AS SELECT Nombre||' '||Apellido1||' '||Apellido2 AS NombreCompleto
FROM Alumnos;