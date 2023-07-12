package POO_U2_Lab2;

public class Producto {
//declaramos atributo
	String nombre;
	int precio;
//creamos los contructores	
	public Producto(String nombre, int precio) {
		this.nombre =nombre;
		this.precio=precio;
//creamos los metodos get y ser		
	}
	//nos muestro el dato pedido
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//nos muestro el dato pedido
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//se crea un metodo para hacer una multiplicacion del pedido
	public double obtenerPrecioPedido(int unidadespedida) {
		return unidadespedida*precio;
		
	}
}
