
--JEFES
--int Id PRIMARY KEY
--String Usuario
--String Contraseña
--String Imagen
--double Sueldos empleados a pagar (Voluntario)

--EMPLEADOS
--int Id
--int Id_jefe
--String Nombre
--double Sueldo
--date/Greg Fecha incorporación

CREATE TABLE JEFES(
    Id NUMERIC(3) NOT NULL PRIMARY KEY,
    Nombre VARCHAR(20) NOT NULL,
    Usuario VARCHAR(20) NOT NULL,
    Password VARCHAR(20) NOT NULL,
    Imagen VARCHAR(40),
    Sueldo_a_pagar NUMERIC(10, 3)
);

CREATE TABLE EMPLEADOS(
    Id NUMERIC(3) NOT NULL PRIMARY KEY,
    Id_jefe NUMERIC(3) NOT NULL,
    Nombre VARCHAR(20) NOT NULL,
    Sueldo NUMERIC(10, 3),
    Fecha_incorp DATE
);

ALTER TABLE empleados
ADD CONSTRAINT fk_empleados_jefe
    FOREIGN KEY (Id_jefe)
    REFERENCES JEFES(Id)
    ON DELETE CASCADE;

INSERT INTO JEFES VALUES (1, 'Di Qi', 'diqi', 'diqi', 'default.jpg', 0);
INSERT INTO JEFES VALUES (2, 'Andrés', 'andres', 'andres', 'default.jpg', 0);
INSERT INTO JEFES VALUES (3, 'Antonio', 'antonio', 'antonio', '1001.jpg', 0);
INSERT INTO JEFES VALUES (4, 'Bernardo', 'bernardo', 'bernardo', '1002.jpg', 0);
INSERT INTO JEFES VALUES (5, 'Carlos', 'carlos', 'carlos', '1003.jpg', 0);

INSERT INTO EMPLEADOS VALUES (1, 1, 'Antonio', 3000, '1/10/2018');
INSERT INTO EMPLEADOS VALUES (2, 1, 'Beatriz', 2000, '2/20/2018');
INSERT INTO EMPLEADOS VALUES (3, 1, 'Carlos', 4000, '3/22/2018');
INSERT INTO EMPLEADOS VALUES (4, 2, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (5, 2, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (6, 2, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (7, 3, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (8, 3, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (9, 3, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (10, 4, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (11, 4, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (12, 4, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (13, 5, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (14, 5, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (15, 5, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (16, 1, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (17, 1, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (18, 1, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (19, 1, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (20, 1, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (21, 1, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (22, 1, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (23, 1, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (24, 1, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (25, 2, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (26, 2, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (27, 2, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (28, 2, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (29, 2, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (30, 2, 'Fernando', 2200, '6/26/2018');
INSERT INTO EMPLEADOS VALUES (31, 2, 'Diego', 5000, '4/12/2018');
INSERT INTO EMPLEADOS VALUES (32, 2, 'Elena', 1500, '5/17/2018');
INSERT INTO EMPLEADOS VALUES (33, 2, 'Fernando', 2200, '6/26/2018');