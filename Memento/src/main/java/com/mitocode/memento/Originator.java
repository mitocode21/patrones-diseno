package com.mitocode.memento;

public class Originator {

	private Juego estado;

	public void setEstado(Juego estado) {
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}

	public Memento guardar() {
		return new Memento(estado);
	}

	public void restaurar(Memento m) {
		this.estado = m.getEstado();
	}
}
