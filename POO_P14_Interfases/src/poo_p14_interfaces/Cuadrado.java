package poo_p14_interfaces;

public class Cuadrado implements Figura, Dibujar {
	
	double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}

	@Override
	public double calcularArea() {
		double resultado=lado*lado;
		return resultado;
	}

	@Override
	public void dibujar() {
		System.out.println("");
		
	}

}
