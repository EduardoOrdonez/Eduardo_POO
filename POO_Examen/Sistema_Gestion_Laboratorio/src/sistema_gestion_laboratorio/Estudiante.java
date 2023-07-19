package sistema_gestion_laboratorio;

public class Estudiante extends Personal{
	int nmatricula;
	
	public Estudiante(String nombre, int id,  int nmatricula) {
		super(nombre, id);
		this.nmatricula=nmatricula;
	}

	public int getNmatricula() {
		return nmatricula;
	}

	public void setNmatricula(int nmatricula) {
		this.nmatricula = nmatricula;
	}
	
	

}
