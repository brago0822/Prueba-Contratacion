package com.pruebaempresa.PruebaEmpresaapi.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebacontratacion.PruebaEMPRESAcore.controller.ProductoController;
import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;


@RestController
@RequestMapping("/productos")
public class RestControllerProducto {
	
	@GetMapping("/listar")
    public List<Producto> listar() throws Exception {
		ProductoController prodController = new ProductoController();

	    List<Producto> listaProductos = prodController.listar();
    	return listaProductos;
	}
	
	@PostMapping("/crear")
	public Producto crear(@RequestBody Producto prod) {
		//return prod.toString();
		ProductoController prodController = new ProductoController();
		return prodController.crearProducto(prod);
	}
}
