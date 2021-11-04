CREATE TABLE de_vela (
	registro CHAR(50) PRIMARY KEY,
    modelo CHAR(10),
    cantidadVelas int,
    tipo CHAR(10),
    capacidad int,
    foreign key (registro) references barco(registro)
);

INSERT INTO de_vela VALUES ("AF45678", "V370", 4, "CARGA", 100);
INSERT INTO de_vela VALUES ("LF48679", "V380", 2, "PASAJEROS", 10);
INSERT INTO de_vela VALUES ("CO4867910", "S388", 4, "PASAJEROS", 20);
INSERT INTO de_vela VALUES ("US48679", "C525", 2, "CARGA", 250);
INSERT INTO de_vela VALUES ("US58219", "C525-452", 2, "PASAJEROS", 80);
