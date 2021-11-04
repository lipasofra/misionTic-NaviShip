CREATE TABLE prestamos (
	cuenta CHAR(50),
    fecha date,
    tiempoPrestamo int,
    barco CHAR(50),
    foreign key (barco) references barco(registro),
    foreign key (cuenta) references cliente(cuenta),
    primary key (fecha, barco)
);

INSERT INTO prestamos VALUES ("ViajeSeguro", "2010-01-20", 100, "AF45678");
INSERT INTO prestamos VALUES ("Confianzavelas", "2010-05-21", 1000, "LF48679");
INSERT INTO prestamos VALUES ("Condores", "2015-12-18", 80, "CO4867910");
INSERT INTO prestamos VALUES ("Serviciosnavierosperu", "2019-08-05", 150, "US48679");
INSERT INTO prestamos VALUES ("juansanchez", "2011-01-30", 200, "US58219");
INSERT INTO prestamos VALUES ("ViajeSeguro", "2010-01-20", 100, "IR45678");
INSERT INTO prestamos VALUES ("Confianzavelas", "2010-05-21", 1000, "PA48679");
INSERT INTO prestamos VALUES ("Condores", "2015-12-18", 80, "PE48679");
INSERT INTO prestamos VALUES ("Serviciosnavierosperu", "2019-08-05", 150, "CO48679");
INSERT INTO prestamos VALUES ("juansanchez", "2011-01-30", 200, "BR58219");
INSERT INTO prestamos VALUES ("Confianzavelas", "2021-08-05", 150, "CO48679");
