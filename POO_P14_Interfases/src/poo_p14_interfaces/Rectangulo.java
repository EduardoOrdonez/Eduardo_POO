package poo_p14_interfaces;

public class Rectangulo implements Figura, Dibujar{
	
	double base;
	double altura;
	
	public Rectangulo(double base, double altura) {
		this.altura=altura;
		this.base=base;
	}
	
	@Override
	public void dibujar() {
		System.out.println("vas a dibujar");
		
	}

	@Override
	public double calcularArea() {
		double resultado=base*altura;
		return resultado;
	}

}
