package com.mitocode.dao;

import java.util.List;

import com.mitocode.model.Persona;

public class PersonaDAOImpl implements PersonaDAO{
	
	private IConexion conexion;	

	/*public PersonaDAOImpl(IConexion conexion) {		
		this.conexion = conexion;
	}*/
	
	public void setConexion(IConexion conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<Persona> listarTodos() {
		this.conexion.conectar();
		System.out.println("Listando...");
		return null;
	}

	@Override
	public Persona leerPorId(int id) {
		return null;
	}
	
	@Override
	public void registrar(Persona persona) {
		System.out.println("Persona " + persona.getNombres() + " registrada");
	}

	@Override
	public void actualizar(Persona persona) {
		System.out.println("Persona " + persona.getNombres() + " actualizada");
	}

	@Override
	public void eliminar(int id) {
		System.out.println("id " + id + "eliminado");
	}

	@Override
	public void mostrarNombre() {
		// TODO Auto-generated method stub
		
	}

}
