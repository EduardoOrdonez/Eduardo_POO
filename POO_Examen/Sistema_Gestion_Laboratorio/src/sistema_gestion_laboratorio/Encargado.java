package sistema_gestion_laboratorio;

public class Encargado extends Personal{
	String area;
	
	public Encargado(String nombre, int id, String area) {
		super(nombre, id);
		this.area=area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	

}
