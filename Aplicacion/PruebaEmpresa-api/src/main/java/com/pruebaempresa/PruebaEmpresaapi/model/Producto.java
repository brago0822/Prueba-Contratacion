package com.pruebaempresa.PruebaEmpresaapi.model;

import java.io.Serializable;

public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
	private String descripcion;
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
