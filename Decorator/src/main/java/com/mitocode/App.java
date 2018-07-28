package com.mitocode;

import com.mitocode.decorador.BlindajeDecorador;
import com.mitocode.interf.ICuentaBancaria;
import com.mitocode.interf.impl.CuentaAhorro;
import com.mitocode.model.Cuenta;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "MitoCode");	
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
