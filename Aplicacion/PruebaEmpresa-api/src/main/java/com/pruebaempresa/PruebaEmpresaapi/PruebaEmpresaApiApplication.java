package com.pruebaempresa.PruebaEmpresaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pruebaempresa","com.pruebacontratacion"})
public class PruebaEmpresaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaEmpresaApiApplication.class, args);
	}

}
