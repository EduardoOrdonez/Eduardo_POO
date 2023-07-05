package poo_p13_clase_abstracta;

public abstract class Figura {
//Atributos
	double x;
	double y;
	public Figura() {
		
	}
	
	public Figura(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public abstract double calculArea();
		
	
}
