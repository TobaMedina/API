package com.example.demo.DAO;

import java.util.List;

import com.example.demo.modelos.UnidadModel;

public interface IUnidadDao {
    public List<UnidadModel> findAll();
    public UnidadModel findById(int id);
    public void save(UnidadModel unidad);
    public void deleteById(int id);
}
