package poo_sistemasueldobasico;

//nuestra clase Tecnico heredara atributos de la clase Personal 
//Con esto entendemos que nuestra clase Tecnico vendria a ser clase hija 
//De nuestra clase Personal la cual seria la clase padre
public class Tecnico extends Personal{
	//Asignamos el atributo de nuestra clase
	int hijos;
	//creamos los contructores de nuestro atributos
	public Tecnico(String nombre, int edad, int cedula, String genero, double sueldo, int hijos) {
		super(nombre, edad, cedula, genero, sueldo);
		this.hijos=hijos;
	}
	//creamos el metodo getter and setter
	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	//en nuestro metodo abstracto el cual es suelto total a ganar
	//en este claso el tecnico se dara un bono por carga familiar
	// en el caso de que el tecnico tenga mas de 1 se le sumara un bono
	//de 150$ caso contrario se le pagara el basico 
	@Override
	public void sueltototal() {
		if(hijos>1) {
			sueldo +=150;
			System.out.println("se le ha acreditado un bono de 150 " +sueldo);
		}else if(hijos<=1) {
			sueldo +=0;
			System.out.println("sueldo " +sueldo);
		}
		
	}
	

}
