package poo_sistemasueldobasico;

public class Limpieza extends Personal{
	boolean discapacidad;
	
	public Limpieza(String nombre, int edad, int cedula, String genero, double sueldo, boolean discapacidad) {
		super(nombre, edad, cedula, genero, sueldo);
		this.discapacidad=discapacidad;
		
	}

	public boolean isDiscapacidad() {
		return discapacidad;
	}

	public void setDiscapacidad(boolean discapacidad) {
		if(discapacidad) {
			discapacidad=true;
		}else {
			discapacidad=false;
		}
	}

	@Override
	public void sueltototal() {
		if(discapacidad=true) {
			sueldo +=150;
			System.out.println("se le ha acreditado un bono " +sueldo);
		}else if(discapacidad=false) {
			sueldo +=0;
			System.out.println("sueldo " +sueldo);
		}
		
	}
	

}
