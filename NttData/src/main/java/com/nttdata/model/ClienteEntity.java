package com.nttdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class ClienteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
	private Long cliente_id;
	
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String telefono;
    private String direccion;
    private String ciudad_de_residencia;
    private String tipo_documento;
    private String nombre_documento;
    private Integer numero_documento;
	/**
	 * @return the cliente_id
	 */
	public Long getCliente_id() {
		return cliente_id;
	}
	/**
	 * @param cliente_id the cliente_id to set
	 */
	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
	}
	/**
	 * @return the primer_nombre
	 */
	public String getPrimer_nombre() {
		return primer_nombre;
	}
	/**
	 * @param primer_nombre the primer_nombre to set
	 */
	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}
	/**
	 * @return the segundo_nombre
	 */
	public String getSegundo_nombre() {
		return segundo_nombre;
	}
	/**
	 * @param segundo_nombre the segundo_nombre to set
	 */
	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}
	/**
	 * @return the primer_apellido
	 */
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	/**
	 * @param primer_apellido the primer_apellido to set
	 */
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	/**
	 * @return the segundo_apellido
	 */
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	/**
	 * @param segundo_apellido the segundo_apellido to set
	 */
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the ciudad_de_residencia
	 */
	public String getCiudad_de_residencia() {
		return ciudad_de_residencia;
	}
	/**
	 * @param ciudad_de_residencia the ciudad_de_residencia to set
	 */
	public void setCiudad_de_residencia(String ciudad_de_residencia) {
		this.ciudad_de_residencia = ciudad_de_residencia;
	}
	/**
	 * @return the tipo_documento
	 */
	public String getTipo_documento() {
		return tipo_documento;
	}
	/**
	 * @param tipo_documento the tipo_documento to set
	 */
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	/**
	 * @return the nombre_documento
	 */
	public String getNombre_documento() {
		return nombre_documento;
	}
	/**
	 * @param nombre_documento the nombre_documento to set
	 */
	public void setNombre_documento(String nombre_documento) {
		this.nombre_documento = nombre_documento;
	}
	/**
	 * @return the numero_documento
	 */
	public Integer getNumero_documento() {
		return numero_documento;
	}
	/**
	 * @param numero_documento the numero_documento to set
	 */
	public void setNumero_documento(Integer numero_documento) {
		this.numero_documento = numero_documento;
	}
    
    
	
    
    
    
    

}
