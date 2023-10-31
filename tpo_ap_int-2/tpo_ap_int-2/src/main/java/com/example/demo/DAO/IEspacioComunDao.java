package com.example.demo.DAO;

import java.util.List;

import com.example.demo.modelos.EspacioComun;

public interface IEspacioComunDao {
    public List<EspacioComun> findAll();
    public EspacioComun findById(int id);
    public void save(EspacioComun espacioComun);
    public void deleteById(int id);
}
