package sistema_gestion_laboratorio;

public class Personal {
	
	String nombre;
	int id;
	String cargo;
	
    public Personal(String nombre, int id) {
    	this.nombre=nombre;
    	this.id=id;
    	
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    

}
