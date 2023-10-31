package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelos.EspacioComun;

public interface IEspacioComunServicio {
    public List<EspacioComun> findAll();
    public EspacioComun findById(int id);
    public void save(EspacioComun espacioComun);
    public void update(int idEspacioComun, EspacioComun espacioComun);
    public void deleteById(int id);
}
