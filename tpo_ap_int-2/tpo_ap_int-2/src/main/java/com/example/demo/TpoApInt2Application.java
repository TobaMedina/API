package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelos.EdificioModel;
import com.example.demo.servicios.EdificioServicio;
//import com.example.demo.repositorios.EdificioRepositorio;
import com.example.demo.repositorios.UnidadRepositorio;
import com.example.demo.repositorios.UsuarioRepositorio;

@SpringBootApplication
public class TpoApInt2Application  implements CommandLineRunner{
	@Autowired
	UsuarioRepositorio userr;
	@Autowired
	EdificioServicio er;
	@Autowired
	UnidadRepositorio unidadr;
	
	public static void main(String[] args) {
		SpringApplication.run(TpoApInt2Application.class, args);
	}
	
	public void run(String... args) throws Exception {
		EdificioModel e1=new EdificioModel(0, null);
		e1.setDireccion("castro 1138");
		System.out.println(e1.getDireccion());
		er.save(e1);
	
	}

}
