CREATE TABLE cliente (
	cuenta CHAR(50) PRIMARY KEY,
    email CHAR(80),
    Nombre CHAR(50),
    País CHAR(15),
    razonsocial CHAR(30)    
);

INSERT INTO cliente VALUES ("ViajeSeguro", "viajeseguro@gmail.com", "Pepe Rivera", "Colombia", "Viaje Seguro");
INSERT INTO cliente VALUES ("Confianzavelas", "alanbrito@confianzaennuestrasvelas.com", "Alan Brito", "Venezuela", "Confianza en nuestras velas");
INSERT INTO cliente VALUES ("Condores", "jhonbunan@condores.co", "Jhon Bunan", "Ecuador", "Condores del sur");
INSERT INTO cliente VALUES ("Serviciosnavierosperu", "serviciosnavieros@yahoo.com", "Eliot Ramirez", "Peru", "Servicios navieros");
INSERT INTO cliente VALUES ("juansanchez", "juansanchez@pilotosasociados.com", "Juan Sanchez", "Colombia", "Capitanes asociados");
