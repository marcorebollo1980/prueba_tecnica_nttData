CREATE DATABASE ntt_data_cliente;
USE ntt_data_cliente;

CREATE TABLE IF NOT EXISTS cliente (
    cliente_id INT AUTO_INCREMENT PRIMARY KEY,
    primer_nombre    VARCHAR(255) NULL,
    segundo_nombre   VARCHAR(255) NULL,
    primer_apellido  VARCHAR(255) NULL,
    segundo_apellido VARCHAR(255) NULL,
    telefono  VARCHAR(255) NULL,
    direccion VARCHAR(255) NULL,
    ciudad_de_residencia VARCHAR(255) NULL,
    tipo_documento VARCHAR(255) NULL,
    nombre_documento VARCHAR(255) NULL,
    numero_documento integer
)  ENGINE=INNODB;

INSERT INTO `ntt_data_cliente`.`cliente`
(`cliente_id`,
`primer_nombre`,
`segundo_nombre`,
`primer_apellido`,
`segundo_apellido`,
`telefono`,
`direccion`,
`ciudad_de_residencia`,
`tipo_documento`,
`nombre_documento`,
`numero_documento`)
VALUES
(2,
"xxxxx",
"xxxxxxx",
"xxxx",
"xxxxx",
"123456789",
"cartagena",
"cartagena",
"P",
"pasaporte",
"23445322");