package com.pruebaempresa.PruebaEmpresaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pruebacontratacion.pruebaempresacore","com.pruebaempresa.PruebaEmpresaapi"})
public class PruebaEmpresaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaEmpresaApiApplication.class, args);
	}

}
