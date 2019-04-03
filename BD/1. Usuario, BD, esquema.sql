
/*Creación de usuario y base de datos */

CREATE USER examen_user PASSWORD 'pruebacontratacion2019';
CREATE DATABASE prueba_contratacion OWNER examen_user;


/*---------------------------------------------------------------*/
-- Con conexión creada a prueba_contratacion

CREATE SCHEMA prueba_empresa_db;