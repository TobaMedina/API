package com.example.demo.servicios;

 
import java.util.List;

import com.example.demo.modelos.EdificioModel;

public interface IEdificioServicio {
    public List<EdificioModel> findAll();
    public EdificioModel findById(int id);
    public void save(EdificioModel edificio);
    public void update(int idEdificio, EdificioModel edificio);
    public void deleteById(int id);

}
