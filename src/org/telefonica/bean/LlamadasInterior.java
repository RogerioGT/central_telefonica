package org.telefonica.bean;

public class LlamadasInterior extends Llamadas{
	//PROPERTIES
	private double precioUno;
	private double precioDos;
	private double precioTres;
	private int franja;
	
		//METHODS
	void llamadaInterior() {
		
	}
	
	void calcularPrecio(){
		
		}
	
	void toAString () { //Aqui debo aprender y corregir los metodos
		
	}

		// SETTERS & GETTERS
	public double getPrecioUno() {
		return precioUno;
	}

	public void setPrecioUno(double precioUno) {
		this.precioUno = precioUno;
	}

	public double getPrecioDos() {
		return precioDos;
	}

	public void setPrecioDos(double precioDos) {
		this.precioDos = precioDos;
	}

	public double getPrecioTres() {
		return precioTres;
	}

	public void setPrecioTres(double precioTres) {
		this.precioTres = precioTres;
	}

	public int getFranja() {
		return franja;
	}

	public void setFranja(int franja) {
		this.franja = franja;
	}
}
