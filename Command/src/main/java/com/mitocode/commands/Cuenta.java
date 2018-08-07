package com.mitocode.commands;

//Receiver/Request 
public class Cuenta {

	private int id;
	private double saldo;

	public Cuenta(int id, double saldo) {	
		this.id = id;
		this.saldo = saldo;
	}

	public void retirar(double monto) {
		this.saldo = this.saldo - monto;
		System.out.println("[COMANDO RETIRAR] Cuenta: " + id + " Saldo: " + this.saldo);
	}

	public void depositar(double monto) {
		this.saldo = this.saldo + monto;
		System.out.println("[COMANDO DEPOSITAR] Cuenta: " + id + " Saldo: " + this.saldo);
	}

}
