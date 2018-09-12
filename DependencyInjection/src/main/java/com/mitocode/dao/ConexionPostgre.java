package com.mitocode.dao;

public class ConexionPostgre implements IConexion{

	private String usuario;
	private String clave;
	private String host;

	public ConexionPostgre(String usuario, String clave, String host) {
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
	}

	@Override
	public void conectar() {
		System.out.println("Conectando a PostgreSQL");
	}

}
