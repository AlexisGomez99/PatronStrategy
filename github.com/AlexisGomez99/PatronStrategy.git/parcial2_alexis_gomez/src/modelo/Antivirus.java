package modelo;

public class Antivirus {
	private IEstrategia estrategia;
	//Recibe por parametros una implementacion de la estrategia.
	public Antivirus(IEstrategia estrategia) {
		cambiarEstrategia(estrategia);
	}
	public void cambiarEstrategia(IEstrategia estrategia) {
		this.estrategia=estrategia;
	}
	//ejecuta el metodo de la interfaz
	public void ejecutar() {
		estrategia.analizar();
	}

}
