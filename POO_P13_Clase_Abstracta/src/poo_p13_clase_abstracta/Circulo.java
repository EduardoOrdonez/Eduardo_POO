package poo_p13_clase_abstracta;

public class Circulo extends Figura {
	
	double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio, double x, double y) {
		super(x, y);
		this.radio=radio;
	}

	@Override
	public double calculArea() {
		double pi=3.1416;
		double resultado=pi*radio*radio;
		return resultado;
	}

}
