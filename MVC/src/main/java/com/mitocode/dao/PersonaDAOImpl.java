package com.mitocode.dao;

import java.util.ArrayList;
import java.util.List;

import com.mitocode.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	private Conexion conexion;
	private String motor;

	public PersonaDAOImpl(String motor) {
		this.motor = motor;
		
		if (motor.equals("MYSQL")) {
			conexion = new MySQL();
		} else if (motor.equals("POSTGRESQL")) {
			conexion = new PostgreSQL();
		}
		conexion.conectar();
	}

	@Override
	public List<Persona> listar() {
		
		List<Persona> lista = new ArrayList<>();
		
		if (motor.equals("MYSQL")) {
			Persona per = new Persona();
			per.setId(1);
			per.setNombres("Mito MYSQL");
			per.setEdad(27);
			lista.add(per);

			per = new Persona();
			per.setId(2);
			per.setNombres("Code");
			per.setEdad(27);
			lista.add(per);

		} else if (motor.equals("POSTGRESQL")) {
			Persona per = new Persona();
			per.setId(1);
			per.setNombres("Code POSTGRESQL");
			per.setEdad(27);
			lista.add(per);

			per = new Persona();
			per.setId(2);
			per.setNombres("Mito");
			per.setEdad(27);
			lista.add(per);

		}
		//conexion.listar()....
				
		return lista;
	}
}
