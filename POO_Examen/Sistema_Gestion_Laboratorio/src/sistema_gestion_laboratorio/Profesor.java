package sistema_gestion_laboratorio;

public class Profesor extends Personal {
	String titulo;

	public Profesor(String nombre, int id, String titulo) {
		super(nombre, id);
		this.titulo=titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
