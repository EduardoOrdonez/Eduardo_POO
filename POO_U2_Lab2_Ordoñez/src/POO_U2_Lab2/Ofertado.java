package POO_U2_Lab2;

///Heredados datos desde la clase padre la cual es Producto
public class Ofertado extends Producto{
	//declaramos la variable, el cual va a represental la cantidad de dias pasados 
	//del producto
int dias;

//creamos los contructores 
//junto de las variables hereradas de la clases padre
public Ofertado(String nombre, int precio, int dias) {
	super(nombre, precio);
	this.dias=dias;
	
}

//creamos un metodo obtenerPrecioPedido el cual se encargara de 
//aplicar los respectivos descuentos dependiendo 
//la cantidad de dias pasados 
@Override
public double obtenerPrecioPedido(int unidadespedida) {
	double precioFinal = super.obtenerPrecioPedido(unidadespedida);
//usamos un condicional if para presentar los 3 casos
	if(dias==1) {
		precioFinal*=0.2;
		System.out.println("se le a aplicado un descuento del 20%");
	}else if(dias==2) {
		precioFinal*=0.15;
		System.out.println("se le a aplicado un descuento del 15%");
	}else if(dias>3) {
		precioFinal*=0.1;
	    System.out.println("se le a aplicado un descunto del 10%");
	}
	//regresa el precio final sin presentar ningun tipo de descuento
	return precioFinal;
		
}

}
