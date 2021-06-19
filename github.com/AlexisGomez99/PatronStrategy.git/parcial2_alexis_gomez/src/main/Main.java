package main;

import modelo.Antivirus;
import strategy.AnalisisAvanzado;
import strategy.AnalisisSimple;


public class Main {

	public static void main(String[] args) {
		//Elijo con que estrategia implementar mi contexto
		Antivirus antivirus= new Antivirus(new AnalisisSimple());
		antivirus.ejecutar();
		
		System.out.println("--------------------------------");
		antivirus.cambiarEstrategia(new AnalisisAvanzado());
		antivirus.ejecutar();
	}

}
