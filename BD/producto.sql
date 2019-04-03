
/* Borrado de Tabla si existe */

DROP TABLE IF EXISTS prueba_empresa_db.producto CASCADE
;

/* Creación de Tabla */

CREATE TABLE prueba_empresa_db.producto
(
	id SERIAL PRIMARY KEY NOT NULL ,
	nombre varchar(50) NULL,
	descripcion varchar(100) NULL,
	activo boolean NOT NULL  DEFAULT true
)
;

/* ----- Permisos al usuario creado sobre la tabla */
GRANT INSERT ON prueba_empresa_db.producto TO examen_user;
GRANT SELECT ON prueba_empresa_db.producto TO examen_user;
GRANT UPDATE ON prueba_empresa_db.producto TO examen_user;
GRANT DELETE ON prueba_empresa_db.producto TO examen_user;