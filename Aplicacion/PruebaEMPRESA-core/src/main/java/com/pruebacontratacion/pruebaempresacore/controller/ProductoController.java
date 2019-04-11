package com.pruebacontratacion.PruebaEMPRESAcore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pruebacontratacion.PruebaEMPRESAcore.model.Producto;
import com.pruebacontratacion.PruebaEMPRESAcore.repository.IProductoRepo;
import com.pruebacontratacion.PruebaEMPRESAcore.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
		@Autowired
		ProductoService prodService;
		@Autowired
		IProductoRepo prodRepo;
		@GetMapping("/listar")
		public List<Producto> listar() {
			return prodRepo.findByActivo(true);
		}
		@PostMapping("/crear")
		public Producto crearProducto (@RequestBody Producto prod) {
			return prodService.crearProducto(prod);
		}
}
