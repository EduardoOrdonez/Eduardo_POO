package POO_U2_Lab2;

///Heredados datos desde la clase padre la cual es Producto
public class Estandar extends Producto{
	///declaramos atributo, el cual nos indicara la seccion en el 
	//se podra encontrar a el producto
	String seccion;
	
	//creamos los constructores
	//junto de las variables hereradas de la clases padre
	public Estandar(String nombre, int precio, String seccion) {
		super(nombre, precio);
		this.seccion=seccion;
	}
	//hacemos un metodo obtenerPrecioPedido para aplicar el descuento por cantidad de unidades 
	
	public double obtenerPrecioPedido(int unidadespedida) {
		double precioFinal = super.obtenerPrecioPedido(unidadespedida);
		if(this.precio>=5){
			precioFinal*=0.1;
			System.out.println("se le a aplicado un descuento del 10%");
		}
		return precioFinal;
		}
	}


