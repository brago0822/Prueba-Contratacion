package com.pruebacontratacion.PruebaEMPRESAcore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;
import com.pruebacontratacion.PruebaEMPRESAcore.repository.IProductoRepo;

@Service
@Transactional
public class ProductoService {
	@Autowired
	IProductoRepo prodRepo;
	public Producto crearProducto(Producto prod){
		return prodRepo.save(prod);
	}
	
	public List<Producto> listarProductos(){
		return prodRepo.findByActivo(true);
	}
	
}
