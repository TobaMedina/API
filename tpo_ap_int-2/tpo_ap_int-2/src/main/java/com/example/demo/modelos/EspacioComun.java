package com.example.demo.modelos;

import jakarta.persistence.*;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/

import java.math.BigInteger;

@Entity
@Table(name = "espaciosComunes")

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class EspacioComun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspacioComun;
    private int piso;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "Edificio_Id")
    private EdificioModel edificio;
	public int getPiso() {
		return this.piso;
	}
	public void setPiso(int piso2) {
		this.piso= piso2;
		
	}
	public String getDescripcion() {
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
}
