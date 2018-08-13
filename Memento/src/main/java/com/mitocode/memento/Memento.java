package com.mitocode.memento;

public class Memento {

	private Juego estado;

	public Memento(Juego estado) {
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}

}
