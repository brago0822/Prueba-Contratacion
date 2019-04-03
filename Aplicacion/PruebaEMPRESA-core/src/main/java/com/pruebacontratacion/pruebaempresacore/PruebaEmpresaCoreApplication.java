package com.pruebacontratacion.pruebaempresacore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pruebacontratacion.pruebaempresacore.controllers.ProductoController;
import com.pruebacontratacion.pruebaempresacore.model.Producto;
@SpringBootApplication
public class PruebaEmpresaCoreApplication {
	
	@Autowired
	ProductoController prodController;
	
	public static void main(String[] args) {
		/*try {
			String url = "jdbc:postgresql://localhost:5432/prueba_contratacion";
			String user = "examen_user";
			String pass = "pruebacontratacion2019ee";
			Connection myConn = DriverManager.getConnection(url,user,pass);
			System.out.println("Conexion correcta");
		}
		catch (Exception ex){
			System.out.println("ERRRRROR");
			ex.getMessage();
		}
		*/
		
		SpringApplication.run(PruebaEmpresaCoreApplication.class, args);
		//ProductoController prodController = new ProductoController();
		//Producto prod = new Producto("Televisor UHD", "Televisor Samsung 55 pulgadas", true);
		//prodController.crearProducto(prod);
		
		//List<Producto> list = prodController.listar();
				
		//list.forEach(producto -> System.out.println(producto.toString() + "\n"));
		
	}

}
