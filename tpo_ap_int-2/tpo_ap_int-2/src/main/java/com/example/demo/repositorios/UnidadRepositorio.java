package com.example.demo.repositorios;

import com.example.demo.modelos.UnidadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadRepositorio extends JpaRepository<UnidadModel, Integer> {

}
