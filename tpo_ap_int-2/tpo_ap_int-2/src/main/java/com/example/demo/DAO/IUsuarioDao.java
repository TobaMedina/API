package com.example.demo.DAO;
import java.util.List;

import com.example.demo.modelos.UsuarioModel;

public interface IUsuarioDao {
    public List<UsuarioModel> findAll();
    public UsuarioModel findById(int id);
    public void save(UsuarioModel usuario);
    public void deleteById(int id);
}
