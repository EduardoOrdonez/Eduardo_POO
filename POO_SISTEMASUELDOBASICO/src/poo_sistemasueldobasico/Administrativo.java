package poo_sistemasueldobasico;

public class Administrativo extends Personal{
	double promedio;
	double horario;
	
	public Administrativo(String nombre, int edad, int cedula, String genero, double sueldo, double promedio) {
		super(nombre, edad, cedula, genero, sueldo);
		this.promedio=promedio;
		
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	

	public double getHorario() {
		return horario;
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}

	@Override
	public void sueltototal() {
		if(horario==7.00) {
			sueldo +=bono;
			System.out.println("se le ha acreditado un bono por puntualidad" +sueldo);
		}else if(horario>7.00) {
			sueldo +=0;
			System.out.println("sueldo no se le ha acreditado el bono por impuntualidad " +sueldo);
		}
		
	}
	

}
