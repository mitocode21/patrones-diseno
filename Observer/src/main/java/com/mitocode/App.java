package com.mitocode;

import com.mitocode.observer.PesoARGObservador;
import com.mitocode.observer.PesoMXObservador;
import com.mitocode.observer.SolObservador;
import com.mitocode.observer.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setEstado(100);
	}
}
