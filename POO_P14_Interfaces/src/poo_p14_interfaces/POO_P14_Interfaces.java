
package poo_p14_interfaces;

import java.util.Scanner;


public class POO_P14_Interfaces {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese el lado:");
		double lado=sc.nextDouble(); 
		System.out.println("ingrese la base:");
		double base=sc.nextDouble();
		System.out.println("ingrese el radio:");
		double radio=sc.nextDouble();
		System.out.println("ingrese la altura");
		double altura=sc.nextDouble();
		
		Cuadrado cuadrado = new Cuadrado(lado);
		Circulo circulo=new Circulo(radio);
		Rectangulo rectangulo=new Rectangulo(altura, base);
		
		double areacuadrado=cuadrado.calcularArea();
		double areaCirculo=circulo.calcularArea();
		double areaRectangulo=rectangulo.calcularArea();
                
                System.out.println("A continuacion se mostraran los resultados para las areas de las figuras");
		System.out.println("El calculo del area para el cuadrado es: " + areacuadrado);
		System.out.println("El calculo del area para el circulo es: " + areaCirculo);
		System.out.println("El calculo del area para el rectangulo es: " + areaRectangulo);

		

	}

}
    
    

