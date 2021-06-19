package strategy;

import modelo.IEstrategia;

public class AnalisisAvanzado implements IEstrategia{
	//Esto es una clase estrategia
	//En la cual definimos el comportamiento que queremos darle para luego aplicarlo.
	
	@Override
	public void analizar() {
		iniciar();
		analizarMemoria();
		analizarKeyloggers();
		analizarRootKits();
		descomprimirZip();
		detener();
		
	}

	void iniciar() {
		System.out.println("Antivirus Avanzado - Analisis Avanzado iniciado");
	}


	void analizarMemoria() {
		try {
			System.out.println("Analizando memoria RAM...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	void analizarKeyloggers() {
		try {
			System.out.println("Analizando en busca de Keyloggers...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	void analizarRootKits() {
		try {
			System.out.println("Analizando en busca de Rootkits...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	void descomprimirZip() {
		try {
			System.out.println("Analizando archivos zip...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	void detener() {
		System.out.println("Antivirus Avanzado - Analisis Avanzado finalizado");
	}



}
