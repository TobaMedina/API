package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelos.UsuarioModel;

public interface IUsuarioServicio {

    public List<UsuarioModel> findAll();
    public UsuarioModel findById(int id);
    public void save (UsuarioModel usuario);
    public void update(int idUsuario, UsuarioModel usuario);
    public void deleteById(int id);

}
