package POO_U2;

import java.util.Scanner;

public class POO_u2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("ingrese el valos de lado");
		double lado= sc.nextDouble();
		
		
		Cuadrado cuadrado = new Cuadrado();
		
		double area= cuadrado.calculararea();
		double perimetro= cuadrado.calcularPerimetro();
		
		System.out.println("el area del cuadrado es" + area);
		System.out.println("el perimetro del cuadrado es" + perimetro);

	}
	
	

}
