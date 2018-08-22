package com.mitocode.strategy;

public class AntivirusAvanzado extends AnalisisAvanzado{

	@Override
	void iniciar() {
		System.out.println("Antivirus Avanzado - Análisis simple iniciado");
	}

	@Override
	void analizarMemoria() {		
		try {			
			System.out.println("Analizando Memoria RAM...");
			Thread.sleep(1000);						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarKeyloggers() {
		try {			
			System.out.println("Analizando en busca de Keyloggers...");
			Thread.sleep(1000);							
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarRootKits() {
		try {			
			System.out.println("Analizando en busca de RootKits...");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void descomprimirZip() {
		try {			
			System.out.println("Analizando archivos zip...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void detener() {
		System.out.println("Antivirus Avanzado - Análisis simple finalizado");
	}

}
