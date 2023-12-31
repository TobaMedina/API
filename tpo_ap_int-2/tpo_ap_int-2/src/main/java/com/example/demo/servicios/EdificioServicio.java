package com.example.demo.servicios;

import com.example.demo.DAO.IEdificioDao;
import com.example.demo.modelos.EdificioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioServicio implements IEdificioServicio{

    @Autowired
    private IEdificioDao edificioDAO;

    @Override
    public List<EdificioModel> findAll() {
        List<EdificioModel> edificios = edificioDAO.findAll();
        return edificios;
    }

    @Override
    public EdificioModel findById(int id) {
        EdificioModel edificio = edificioDAO.findById(id);
        return edificio;
    }

    @Override
    public void save(EdificioModel edificio) {
        edificioDAO.save(edificio);
    }

    @Override
    public void update(int idEdificio, EdificioModel edificio) {
        EdificioModel edificioExistente = edificioDAO.findById(idEdificio);

        if(edificioExistente != null){
            edificioExistente.setDireccion(edificio.getDireccion());
            edificioExistente.setUnidades(edificio.getUnidades());
            edificioExistente.setEspaciosComunes(edificio.getEspaciosComunes());
            edificioDAO.save(edificioExistente);
        }
    }

    @Override
    public void deleteById(int id) {
        edificioDAO.deleteById(id);
    }
}
