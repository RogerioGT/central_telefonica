package org.telefonica.bean;

public abstract class Llamadas {
	//PROPERTIES or OBJECTS? - instances and memory reserve
	private String numeroOrigen;
	private String numeroDestino;
	double duracion;
	
	//METHODS
	void llamada(String numeroOrigen, String numeroDestino, double duracion, int franja) {
		
	}

	void calcularPrecio() {

	}
	
	//SETTER & GETTERS
	public String getNumeroOrigen() {
		return numeroOrigen;
	}

	public void setNumeroOrigen(String numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

}
