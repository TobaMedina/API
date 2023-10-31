package com.example.demo.DAO;

import com.example.demo.modelos.EdificioModel;
import java.util.List;

public interface IEdificioDao {
    public List<EdificioModel> findAll();
    public EdificioModel findById(int id);
    public void save(EdificioModel edificio);
    public void deleteById(int id);
}
