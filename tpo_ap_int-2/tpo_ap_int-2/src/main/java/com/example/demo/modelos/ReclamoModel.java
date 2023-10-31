package com.example.demo.modelos;

import jakarta.persistence.*;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/
import java.math.BigInteger;

@Entity
@Table(name = "reclamos")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class ReclamoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReclamo;
    private String estado;
    private String descripcion;
    @OneToOne
    private UsuarioModel usuario;
    @OneToOne
    private EdificioModel edificio;
    @OneToOne
    private UnidadModel unidad;
    
	public String  getEstado() {
		return this.estado;
	}

	public void setEstado(String estado2) {
		this.estado= estado2;
		
	}

	public String  getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion2) {
		this.descripcion= descripcion2;
		
	}

	public EdificioModel getEdificio() {
		return this.edificio;
	}

	public void setEdificio(EdificioModel edificio2) {
		this.edificio= edificio2;
		
	}

	public UnidadModel getUnidad() {
		return this.unidad;
	}

	public void setUnidad(UnidadModel unidad2) {
		this.unidad=unidad2;
		
	}

	public UsuarioModel getUsuario() {
		return this.usuario;
	}

	public void setUsuario(UsuarioModel usuario2) {
		this.usuario=usuario2;
	}
}
