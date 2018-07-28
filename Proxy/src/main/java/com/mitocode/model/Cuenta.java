package com.mitocode.model;

public class Cuenta {

	private int idCuenta;
	private String usuario;
	private double saldoInicial;

	public Cuenta(int idCuenta, String usuario, double saldoInicial) {
		this.idCuenta = idCuenta;
		this.usuario = usuario;
		this.saldoInicial = saldoInicial;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

}
