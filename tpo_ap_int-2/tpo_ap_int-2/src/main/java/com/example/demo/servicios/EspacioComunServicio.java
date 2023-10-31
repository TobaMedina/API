package com.example.demo.servicios;

import java.util.List;


import com.example.demo.DAO.IEspacioComunDao;
import com.example.demo.modelos.EspacioComun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspacioComunServicio implements IEspacioComunServicio{

    @Autowired
    private IEspacioComunDao espacioComunDAO;

    @Override
    public List<EspacioComun> findAll() {
        List<EspacioComun> espaciosComunes = espacioComunDAO.findAll();
        return espaciosComunes;
    }

    @Override
    public EspacioComun findById(int id) {
        EspacioComun espacioComun = espacioComunDAO.findById(id);
        return espacioComun;
    }

    @Override
    public void save(EspacioComun espacioComun) {
        espacioComunDAO.save(espacioComun);
    }

    @Override
    public void update(int idEspacioComun, EspacioComun espacioComun) {
        EspacioComun espacioComunExistente = espacioComunDAO.findById(idEspacioComun);

        if(espacioComunExistente != null){
            espacioComunExistente.setPiso(espacioComunExistente.getPiso());
            espacioComunExistente.setDescripcion(espacioComun.getDescripcion());
            espacioComunExistente.setEdificio(espacioComun.getEdificio());
            espacioComunDAO.save(espacioComunExistente);
        }

    }

    @Override
    public void deleteById(int id) {
        espacioComunDAO.deleteById(id);
    }
}
