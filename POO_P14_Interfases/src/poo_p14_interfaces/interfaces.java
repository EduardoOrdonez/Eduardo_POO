package poo_p14_interfaces;
import java.util.Scanner;
public class interfaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese el lado;");
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
		
		cuadrado.calcularArea();
		circulo.calcularArea();
		rectangulo.calcularArea();
		

	}

}
