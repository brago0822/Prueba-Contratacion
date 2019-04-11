package com.pruebaempresa.PruebaEmpresaapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebacontratacion.PruebaEMPRESAcore.controller.ProductoController;
import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;

@RestController
@RequestMapping("api-rest/productos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class RestControllerProducto {
	@Autowired
	ProductoController prodController;
	@GetMapping ("/listar")
    public ResponseEntity<List<Producto>> listar() throws Exception {

		List<Producto> listaProductos = prodController.listar();
		return ResponseEntity.ok(listaProductos);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Producto> crear(@RequestBody Producto prod) {
		return new ResponseEntity<>(prodController.crearProducto(prod), HttpStatus.CREATED);
	}
}
