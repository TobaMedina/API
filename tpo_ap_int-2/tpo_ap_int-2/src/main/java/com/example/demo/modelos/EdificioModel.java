package com.example.demo.modelos;

import jakarta.persistence.*;
/*
 --ELEMENTOS QUE VAN A SERVIR PARA EL FRONT--
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "edificios")

//ELEMENTOS FRONT MANEJO DE DATA
//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class EdificioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEdificio;
    private String direccion;
    @OneToMany(mappedBy = "edificio", cascade = CascadeType.ALL)
    private List<UnidadModel> unidades;
    @OneToMany(mappedBy = "edificio", cascade = CascadeType.ALL)
    private List<EspacioComun> espaciosComunes;
   

	public EdificioModel(int i, String string) {
	}
	public boolean soyEseEdificio(int id){
        return this.idEdificio==id;
    }
	public String getDireccion() {
		String dir=this.direccion;
		return dir;
	}
	
	public void setDireccion(String direccion2 ) {
		this.direccion=direccion2 ;
		
	}
	public List<UnidadModel> getUnidades() {
		List<UnidadModel> unidades2= this.unidades;
		return unidades2;
	}
	public void setUnidades(List<UnidadModel> unidades2) {
		this.unidades=unidades2;
		
	}
	public List<EspacioComun> getEspaciosComunes() {
		List<EspacioComun> Ecomun= this.espaciosComunes;
		return Ecomun;
	}
	public void setEspaciosComunes(List<EspacioComun> espaciosComunes2) {
		this.espaciosComunes=espaciosComunes2;
		
	}
}
