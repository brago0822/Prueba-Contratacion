package com.pruebaempresa.PruebaEmpresaapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebacontratacion.PruebaEMPRESAcore.controller.ProductoController;
import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;

@RestController
@RequestMapping("/api-rest/productos")
public class RestControllerProducto {
	@Autowired
	ProductoController prodController;
	@GetMapping("/listar")
    public List<Producto> listar() throws Exception {

		List<Producto> listaProductos = prodController.listar();
    	return listaProductos;
	}
	
	@PostMapping("/crear")
	public Producto crear(@RequestBody Producto prod) {
		return prodController.crearProducto(prod);
	}
}
