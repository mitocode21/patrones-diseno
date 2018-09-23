package com.mitocode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.mitocode.dao.PersonaDAOImpl;
import com.mitocode.model.Persona;
import com.mitocode.service.PersonaService;
import com.mitocode.service.PersonaServiceImpl;

@Named
@ViewScoped
public class PersonaController implements Serializable {

	private List<Persona> lista;
	private PersonaService service;	
	private String motor;

	public PersonaController() {
		motor = "MYSQL";
		lista = new ArrayList<>();
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public void listar() {
		lista = service.listar();
	}
	
	public void seleccionar(String motor) {
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}	

}
