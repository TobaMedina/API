package com.example.demo.servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IUsuarioDao;
import com.example.demo.modelos.UsuarioModel;


@Service
public class UsuarioServicio implements IUsuarioServicio{
    @Autowired
    private IUsuarioDao usuarioDAO;
    @Override
    public List<UsuarioModel> findAll() {
        List<UsuarioModel> usuarios = usuarioDAO.findAll();
        return usuarios;
    }

    @Override
    public UsuarioModel findById(int id) {
        UsuarioModel usuario = usuarioDAO.findById(id);
        return usuario;
    }

    @Override
    public void save(UsuarioModel usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public void update(int idUsuario, UsuarioModel usuario) {
        UsuarioModel usuarioExistente = usuarioDAO.findById(idUsuario);

        if(usuarioExistente != null){
            usuarioExistente.setUsuario(usuario.getUsuario());
            usuarioExistente.setPassword(usuario.getPassword());
            usuarioExistente.setCuil(usuario.getCuil());
            usuarioExistente.setNombreCompleto(usuario.getNombreCompleto());
            usuarioExistente.setTipoUsuario(usuario.getTipoUsuario());

            usuarioDAO.save(usuarioExistente);
        }
    }

    @Override
    public void deleteById(int id) {
        usuarioDAO.deleteById(id);
    }
}
