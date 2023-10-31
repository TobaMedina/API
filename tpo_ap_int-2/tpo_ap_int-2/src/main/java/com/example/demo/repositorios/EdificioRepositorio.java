package com.example.demo.repositorios;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.EdificioModel;

@Repository
public interface EdificioRepositorio extends JpaRepository<EdificioModel, Integer> {

 
}