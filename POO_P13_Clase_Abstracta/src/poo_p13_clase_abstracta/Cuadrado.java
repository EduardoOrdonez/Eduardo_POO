package poo_p13_clase_abstracta;

public class Cuadrado extends Figura {

	double lado;
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(double lado, double x, double y) {
		super(x, y);
		this.lado=lado;
		
	}

	@Override
	public double calculArea() {
		double resultado=lado*lado;
		return resultado;
	}

}
