package com.example.demo.servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IReclamoDao;
import com.example.demo.modelos.ReclamoModel;

@Service
public class ReclamoServicio implements IReclamoServicio{

    @Autowired
    private IReclamoDao reclamoDAO;
    @Override
    public List<ReclamoModel> findAll() {
        List<ReclamoModel> reclamos = reclamoDAO.findAll();
        return reclamos;
    }

    @Override
    public ReclamoModel findById(int id) {
        ReclamoModel reclamo = reclamoDAO.findById(id);
        return reclamo;
    }

    @Override
    public void save(ReclamoModel reclamo) {
        reclamoDAO.save(reclamo);
    }

    @Override
    public void update(int idReclamo, ReclamoModel reclamo) {
        ReclamoModel reclamoExistente = reclamoDAO.findById(idReclamo);

        if(reclamoExistente != null){
            reclamoExistente.setEstado(reclamo.getEstado());
            reclamoExistente.setDescripcion(reclamo.getDescripcion());
            reclamoExistente.setEdificio(reclamo.getEdificio());
            reclamoExistente.setUnidad(reclamo.getUnidad());
            reclamoExistente.setUsuario(reclamo.getUsuario());
            reclamoDAO.save(reclamoExistente);
        }
    }

    @Override
    public void deleteById(int id) {
        reclamoDAO.deleteById(id);
    }
}
