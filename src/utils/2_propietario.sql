CREATE TABLE propietario (
	pro_identificacion bigint NOT NULL PRIMARY KEY,
    pro_razonsocial CHAR(80),
    pro_tipo CHAR(40),
    pro_pais CHAR(40)
);

INSERT INTO propietario VALUES (87984564564, "Ship Latina", "Empresa", "Colombia");
INSERT INTO propietario VALUES (87983512364564, "Delfines SA", "Empresa", "Venezuela");
INSERT INTO propietario VALUES (8798156974, "Condores", "Empresa", "Ecuador");
INSERT INTO propietario VALUES (87987815, "Velas de los Andes", "Empresa", "Peru");
INSERT INTO propietario VALUES (87973245, "Pedro Torres", "Persona", "Colombia");

