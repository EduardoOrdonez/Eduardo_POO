package Examen_Practico1;

import java.util.Scanner;

public class POO_Examenpractico1 {
	
	public static void main(String[] args) {
		
		//llamamos a la clase profersor
		//llamamos a la clase alumno
		alumno alumno1 =new  alumno();
		profesor profesor1=new profesor();
		//asignamos variables
		int op;
		Scanner sc=new Scanner(System.in);
		String nombre;
		double notas;
		
		// creacion del menu
		do {
		System.out.println("1. Agregar Profesores:  ");
		System.out.println("2. Agregar Alumnos:  ");	
		System.out.println("3. Materias:  ");	
		System.out.println("4. Gestión Matriculas ");
		System.out.println("5. Total Matriculados");
		System.out.println("6. Salir  ");	
		op=Integer.parseInt(sc.next());
		switch (op) {
		//Creamos caso 1 agregar nombres profesor
		case 1:
			System.out.println("Agregar Profesores:");
		    nombre=(sc.next());
		    profesor1.guardasdatos(nombre);
		    
			break;
		//Creamos caso 2 agregar nombre alumno 
		case 2:
			System.out.println ("Agregar Alumnos:");
			nombre=(sc.next());
			alumno1.guardardatos(nombre);
			break;
		//creamos caso 3 agregar materias
		case 3:
			System.out.println(" Materias :");
			break;
			
		case 4:
			System.out.println("Gestión Matriculas:");
			break;
		case 5:
			System.out.println("Total de matriculados:");
			 							
			
		case 6:
			System.out.println("Salir");
			break;
			default:
			System.out.println("opcion invalida.");
		}
		}while(op!=6);

		}
			
		}