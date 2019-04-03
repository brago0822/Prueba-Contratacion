package com.pruebacontratacion.pruebaempresacore.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.stereotype.Service;

import com.pruebacontratacion.pruebaempresacore.model.Producto;
import com.pruebacontratacion.pruebaempresacore.util.JPAUtil;

@Service
public class ProductoService {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	public int crearProducto(Producto prod){
		try {
//			rod.setId(0L);
			//Producto p2 = prod;
			Producto p2 = new Producto("Televisor", "Televisor Samsung 55 pulgadas", true);
			em.getTransaction().begin(); //Se inicia transacción
			em.persist(p2);// Se inserta el producto
			em.getTransaction().commit();//Se realiza commit para finalizar la transacción
			System.out.println("PRODUCTO INSERTADO = " + p2.toString());

		} catch (Exception e) {
			System.out.println("ERROR SERVICE = " + e.getMessage());
			return 0; //Se ha presentado error
		}
		return 1;//No se ha presentado ningún error
	}
	
	public List<Producto> listarProductos(){
		List<Producto> listadoProductos = null;
		try {
			listadoProductos = em.createQuery("FROM Producto p where p.activo is :estado",Producto.class)
					.setParameter("estado", true)
					.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listadoProductos;
	}

	public ProductoService() {
		 emf = JPAUtil.getEntityManagerFactory();
		 em = emf.createEntityManager();
	}
	
}
