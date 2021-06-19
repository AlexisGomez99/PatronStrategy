package strategy;

import modelo.IEstrategia;

public class AnalisisSimple implements IEstrategia{
	//Esto es una clase estrategia
	//En la cual definimos el comportamiento que queremos darle para luego aplicarlo.
	
	@Override
	public void analizar() {
		iniciar();
		saltarZip();
		detener();
	}

	void iniciar() {
		System.out.println("Antivirus Simple - Analisis Simple iniciado");
	}

	void saltarZip() {
		try {
			System.out.println("Analizando");
			Thread.sleep(2500);
			System.out.println("No se pudo analizar archivos con extension '.zip' ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void detener() {
		System.out.println("Antivirus Simple - Analisis Simple finalizado");
	}

}
