package poo_p14_interfaces;

public class Circulo implements Figura, Dibujar, Rotar {
	
	double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	public double calcularArea() {
		double pi=3.1416;
		double resultado=pi*radio*radio;
		return resultado;
	}
	@Override
	public void rodar() {
		System.out.println("vas a rotar");
		
	}
	@Override
	public void dibujar() {
		System.out.println("vas a dibujar");
		
	}
	

}
