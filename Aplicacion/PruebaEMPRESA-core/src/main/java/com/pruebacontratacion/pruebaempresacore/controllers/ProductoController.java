package com.pruebacontratacion.pruebaempresacore.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.pruebacontratacion.pruebaempresacore.model.Producto;
import com.pruebacontratacion.pruebaempresacore.services.ProductoService;


@Controller
public class ProductoController {
	//@Autowired
	ProductoService prodService;
	
	public List<Producto> listar() {
		List<Producto> listadoProductos = null;
		listadoProductos = prodService.listarProductos();
		return listadoProductos;
		
		/*for (Producto prod : listadoProductos) {
			System.out.println(prod.toString());
		}*/
	}

	public String crearProducto (Producto prod) {
		int idEstado = 0;
		String mensaje = "";
		System.out.println("PRODUCTO EN CONTROLLER = "+prod.toString());
		idEstado = prodService.crearProducto(prod);
		
		mensaje = (idEstado == 1) ? "PRODUCTO REGISTRADO CORRECTAMENTE": "ERROR AL INSERTAR EL PRODUCTO";
			
		return mensaje;
	}

	public ProductoController() {
		prodService = new ProductoService();
	}
	
}
