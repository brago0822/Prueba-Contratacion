package com.pruebacontratacion.PruebaEMPRESAcore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;


public interface IProductoRepo extends JpaRepository<Producto,Integer>{

	public List<Producto> findByActivo (boolean activo);
}


