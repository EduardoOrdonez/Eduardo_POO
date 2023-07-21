package poo_sistemasueldobasico;

// hacemos a nuestra clase abstracta
public abstract class Personal {
	//asignamos atributos a nuestra clase	
    private String nombre;
    private int edad;
    private int cedula;
    private String genero;
    //el valor del sueldo en este caso lo dejamos predefinido
    //ya que se usara el sueldo basico general
    protected double sueldo;
    
    //creamos los constructores de nuestros atributos
    public Personal(String nombre, int edad, int cedula, String genero, double sueldo) {
    	this.nombre=nombre;
    	this.edad=edad;
    	this.cedula=cedula;
    	this.genero=genero;
    	this.sueldo=sueldo;
    	
    	//creamos metodos getters and setters
    	//los cuales nos ayudaran para el ingreso y salida de datos
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	// creamos un metodo es abstracto vacio el lo vamos a llamar en nuestra clases hija
    public abstract void sueltototal();
    double bono=(sueldo*0.10);
    

}
