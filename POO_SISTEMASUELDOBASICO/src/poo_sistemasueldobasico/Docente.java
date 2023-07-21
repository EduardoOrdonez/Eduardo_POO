package poo_sistemasueldobasico;

//nuestra clase docente heredara atributos de la clase personal 
//Con esto entendemos que nuestra clase Docente vendria a ser clase hija 
//De nuestra clase Personal la cual seria la clase padre
public class Docente extends Personal{
	//Asignamos el atributo de nuestra clase
	boolean titulo;
	
	//creamos los contructores de nuestro atributos
	public Docente(String nombre,int edad, int cedula, String genero, double sueldo, boolean titulo){
		super(nombre, edad, cedula, genero, sueldo);
		this.titulo=titulo;	
	}
    //creamos el metodo getter and setter
    //los cuales nos ayudaran para el ingreso y salida de datos
	 //en este caso ya que usamos una variable boolean 
	//aplicamos nuestra condiciones en caso de que sea true o false

	public boolean isTitulo() {
		if(titulo) {
		    titulo=true;
		    System.out.println("si presenta titulo");
		}else{
			titulo=false;
			System.out.println("si presenta titulo");
		}
		return titulo;
	}
	
	public void setTitulo(boolean titulo) {

	}


    //en nuestro metodo abstracto el cual es suelto total a ganar
	//nos dice que en caso de que el docente presete un titulo
	//se lo sumara un noto de 150$
	//caso contrario se le pagara el basico establecido
	@Override
	public void sueltototal() {
		if(titulo=true) {
			sueldo +=150;	
			System.out.println("se le ha acreditado un bono " +sueldo);
		}else if(titulo=false) {
			sueldo +=0;
			System.out.println("sueldo " +sueldo);
			
		}
		
	}
	

}
