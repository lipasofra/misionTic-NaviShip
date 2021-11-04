CREATE TABLE de_motor (
	registro CHAR(50) PRIMARY KEY,
    Marca CHAR(30),
    cantidadMotores int,
    autonomia_horas int,
    foreign key (registro) references barco(registro)
);

INSERT INTO de_motor VALUES ("IR45678", "Airbus Ships", 1, 200);
INSERT INTO de_motor VALUES ("PA48679", "BELL", 2, 300);
INSERT INTO de_motor VALUES ("PE48679", "JSC RUSSIAN", 3, 350);
INSERT INTO de_motor VALUES ("CO48679", "SIKORSKY", 2, 280);
INSERT INTO de_motor VALUES ("BR58219", "BELL", 2, 500);

SELECT de_motor.Marca, de_motor.cantidadMotores, de_motor.autonomia_horas, propietario.pro_razonsocial FROM de_motor JOIN barco ON de_motor.registro=barco.registro JOIN propietario ON barco.propietario=propietario.pro_identificacion WHERE de_motor.registro="CO48679";