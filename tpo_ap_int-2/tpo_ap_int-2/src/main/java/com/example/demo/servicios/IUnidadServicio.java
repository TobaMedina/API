package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelos.UnidadModel;

public interface IUnidadServicio {
    public List<UnidadModel> findAll();
    public UnidadModel findById(int id);
    public void save(UnidadModel unidad);
    public void update(int idUnidad, UnidadModel unidad);
    public void deleteById(int id);
}
