package com.example.demo.DAO;

import java.util.List;

import com.example.demo.modelos.ReclamoModel;

public interface IReclamoDao {
    public List<ReclamoModel> findAll();
    public ReclamoModel findById(int id);
    public void save(ReclamoModel reclamo);
    public void deleteById(int id);

}
