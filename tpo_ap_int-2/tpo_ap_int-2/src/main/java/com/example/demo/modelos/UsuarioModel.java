package com.example.demo.modelos;

import jakarta.persistence.*;

/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/
import java.math.BigInteger;

@Entity
@Table (name = "usuarios")

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String usuario;
    private String password;
    private String cuil;
    private String nombreCompleto;
    private TipoUsuario tipoUsuario;

    public UsuarioModel(String usuario, String password, String cuil, String nombreCompleto, TipoUsuario tipoUsuario) {
        this.usuario = usuario;
        this.password = password;
        this.cuil = cuil;
        this.nombreCompleto = nombreCompleto;
        this.tipoUsuario = tipoUsuario;
    }




	public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}