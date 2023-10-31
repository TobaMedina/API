package com.example.demo.servicios;

import com.example.demo.modelos.UnidadModel;

import java.util.List;

import com.example.demo.DAO.IUnidadDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadServicio implements IUnidadServicio{
    @Autowired
    private IUnidadDao unidadDAO;
    @Override
    public List<UnidadModel> findAll() {
        List<UnidadModel> unidades = unidadDAO.findAll();
        return unidades;
    }

    @Override
    public UnidadModel findById(int id) {
        UnidadModel unidad = unidadDAO.findById(id);
        return unidad;
    }

    @Override
    public void save(UnidadModel unidad) {
        unidadDAO.save(unidad);
    }

    @Override
    public void update(int idUnidad, UnidadModel unidad) {
        UnidadModel unidadExistente = unidadDAO.findById(idUnidad);

        if(unidadExistente != null){
            unidadExistente.setNumero(unidad.getNumero());
            unidadExistente.setPiso(unidad.getPiso());
            unidadExistente.setDuenio(unidad.getDuenio());
            unidadExistente.setInquilino(unidad.getInquilino());
            unidadExistente.setEdificio(unidad.getEdificio());
            //No existe Getter ni Setter del atributo "habitada".

            unidadDAO.save(unidadExistente);
        }
    }

    @Override
    public void deleteById(int id) {
        unidadDAO.deleteById(id);
    }
}
