package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.UsuarioModel;



@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioModel, Long> {

}
