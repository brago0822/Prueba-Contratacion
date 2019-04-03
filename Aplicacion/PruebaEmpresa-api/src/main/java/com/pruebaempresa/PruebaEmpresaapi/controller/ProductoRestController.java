package com.pruebaempresa.PruebaEmpresaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebacontratacion.pruebaempresacore.controllers.ProductoController;
import com.pruebacontratacion.pruebaempresacore.model.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {
	@Autowired
	ProductoController prodController;
	
	@GetMapping("/listar")
    public List<Producto> listar() throws Exception {
	    List<Producto> listaProductos = prodController.listar();
    	return listaProductos;
	}
	
	@PostMapping("/crear")
	public String crear(@RequestBody Producto prod) {
		//return prod.toString();
		ProductoController prodController = new ProductoController();
		return prodController.crearProducto(prod);
	}

}
