package com.mitocode.service;

import java.util.List;

import com.mitocode.dao.PersonaDAO;
import com.mitocode.model.Persona;

public class PersonaServiceImpl implements PersonaService{

	private PersonaDAO dao;
	
	public PersonaServiceImpl(PersonaDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Persona> listar() {		
		return dao.listar();
	}

}
