package com.example.demo.modelos;

import jakarta.persistence.*;
/*
 * Elementos front
 * 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/
//import java.math.BigInteger;

@Entity
@Table(name = "unidades")

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class UnidadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnidad;
    private int piso;
    private int numero;
    private boolean habitada;
    @OneToOne
    private UsuarioModel duenio;
    @OneToOne
    private UsuarioModel inquilino;
    @ManyToOne
    @JoinColumn(name = "Edificio_Id")
    private EdificioModel edificio;
    
    
	public int getNumero() {
		return this.numero;
	}


	public void setNumero(int numero2) {
		
	this.numero=numero2;
	}

	public int getPiso() {
		return this.piso;
	}


	public void setPiso(int piso2) {
		this.piso= piso2;
		
	}


	public UsuarioModel getDuenio() {
		return this.duenio;
	}


	public void setDuenio(UsuarioModel duenio2) {
		this.duenio= duenio2;
	}


	public UsuarioModel getInquilino() {
		return this.inquilino;
	}


	public void setInquilino(UsuarioModel inquilino2) {
		this.inquilino= inquilino2;
	}


	public EdificioModel getEdificio() {
		return this.edificio;
	}


	public void setEdificio(EdificioModel edificio2) {
		this.edificio= edificio2;
			
	}
}
