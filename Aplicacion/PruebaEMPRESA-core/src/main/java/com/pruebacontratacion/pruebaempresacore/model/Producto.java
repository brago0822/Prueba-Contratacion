package com.pruebacontratacion.pruebaempresacore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="prueba_empresa_db.producto")
public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id", nullable = false)
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generador_id_producto")
    @SequenceGenerator(name = "generador_id_producto", sequenceName = "prueba_empresa_db.producto_id_seq",allocationSize = 1)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="activo", nullable = false)
	private boolean activo;
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public Producto() {
//		super();
		System.out.println("Contructor");
	}
	
	public Producto(String nombre, String descripcion, boolean activo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	public Producto(Long id, String nombre, String descripcion, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", activo=" + activo
				+ "]";
	}
}
