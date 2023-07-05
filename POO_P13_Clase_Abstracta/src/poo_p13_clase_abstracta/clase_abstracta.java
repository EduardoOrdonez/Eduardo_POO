package poo_p13_clase_abstracta;

import java.util.Scanner;



public class clase_abstracta {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese el lado;");
		double lado=sc.nextDouble(); 
		System.out.println("ingrese el lado x;");
		double x=sc.nextDouble(); 
		System.out.println("ingrese el lado y;");
		double y=sc.nextDouble(); 
		System.out.println("ingrese el radio:");
		double radio=sc.nextDouble();

		Cuadrado cuadrado = new Cuadrado(lado, x, y);  
		Circulo circulo=new Circulo(radio, x, y);
		
		cuadrado.calculArea();
		circulo.calculArea();

	}

}
