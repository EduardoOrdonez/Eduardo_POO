package POO_U2_Lab2;

import java.util.Scanner;
public class POO_U2_Lab2 {

	public static void main(String[] args) {
		
	//usamos la libreria Scanner para el ingreso de datos 	
	Scanner sc=new Scanner(System.in);
	
	//ingresamos los datos de los atributos

	System.out.println("ingrese el nombre del producto");
	String nombre=sc.next();
	System.out.println("ingrese el nombre del precio");
	int precio=sc.nextInt();
	System.out.println("ingrese el nombre del seccion");
	String seccion=sc.next();
	System.out.println("ingrese el nombre del dias");
	int dias=sc.nextInt();
	
	///llamamos la clase Estandar y creamos un objeto el cual sera estandar
	Estandar estandar= new Estandar(nombre, precio, seccion);
	
	//mediante el objeto llamamos los metodos de las clases
	System.out.println("producto:" + estandar.getNombre());
	System.out.println("precio:" + estandar.getPrecio());
	System.out.println("seccion:" + estandar.obtenerPrecioPedido(precio));
	//llamamos la clase Ofertado y creamos un objeto el cual sera ofertado
	Ofertado ofertado=new Ofertado(nombre, precio, dias);
	//mediante el objeto creado llamamos los metodos de la respectiva clase
	System.out.println("producto:" + ofertado.getNombre());
	System.out.println("precio:" + ofertado.getPrecio());
	System.out.println("oferta:" + ofertado.obtenerPrecioPedido(dias));


	}

}
