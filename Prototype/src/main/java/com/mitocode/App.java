package com.mitocode;

import com.mitocode.model.CuentaAHImpl;

public class App {

	public static void main(String[] args) {

		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		cuentaAhorro.setMonto(200);
		
		CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();
		
		CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

		System.out.println(cuentaAhorro);
		System.out.println(cuentaAhorro2);
		System.out.println(cuentaClonada);
		
		/*if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}

		System.out.println(cuentaClonada == cuentaAhorro);*/

	}

}
