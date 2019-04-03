package com.pruebacontratacion.PruebaEMPRESAcore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;
import com.pruebacontratacion.PruebaEMPRESAcore.service.ProductoService;

@Controller
public class ProductoController {
		@Autowired
		ProductoService prodService;
		
		public List<Producto> listar() {
			List<Producto> listadoProductos = null;
			listadoProductos = prodService.listarProductos();
			return listadoProductos;
		}

		public Producto crearProducto (Producto prod) {
			return prodService.crearProducto(prod);
		}
}
