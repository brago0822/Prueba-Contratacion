
/* Borrado de Secuencias para Autonumérico si existen*/

DROP SEQUENCE IF EXISTS prueba_empresa_db.producto_id_seq
;

/* Creación de Secuencia para autonumérico */

CREATE SEQUENCE prueba_empresa_db.producto_id_seq INCREMENT 1 START 1
;

/* Borrado de Tabla si existe */

DROP TABLE IF EXISTS prueba_empresa_db.producto CASCADE
;

/* Creación de Tabla */

CREATE TABLE prueba_empresa_db.producto
(
	id bigint NOT NULL   DEFAULT NEXTVAL('prueba_empresa_db.producto_id_seq'),
	nombre varchar(50) NULL,
	descripcion varchar(100) NULL,
	activo boolean NOT NULL   DEFAULT true
)
;

/* Creación de Llave Primaria*/

ALTER TABLE prueba_empresa_db.producto ADD CONSTRAINT PK_producto
	PRIMARY KEY (id)
;

/* ----- Permisos al usuario creado sobre la tabla */
GRANT INSERT ON prueba_empresa_db.producto TO examen_user;
GRANT SELECT ON prueba_empresa_db.producto TO examen_user;
GRANT UPDATE ON prueba_empresa_db.producto TO examen_user;
GRANT DELETE ON prueba_empresa_db.producto TO examen_user;