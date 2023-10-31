package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelos.ReclamoModel;

public interface IReclamoServicio {
    public List<ReclamoModel> findAll();
    public ReclamoModel findById(int id);
    public void save(ReclamoModel reclamo);
    public void update(int idReclamo, ReclamoModel reclamo);
    public void deleteById(int id);
}
