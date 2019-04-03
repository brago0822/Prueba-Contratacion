package com.pruebacontratacion.PruebaEMPRESAcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;


public interface IProductoRepo extends JpaRepository<Producto,Integer>{
	List<Producto> findByActivo(boolean activo);

}


