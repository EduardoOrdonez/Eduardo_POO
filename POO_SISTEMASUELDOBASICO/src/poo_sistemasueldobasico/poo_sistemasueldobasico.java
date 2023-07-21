package poo_sistemasueldobasico;
import java.util.Scanner;
public class poo_sistemasueldobasico {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int opc;
		do {
	        System.out.println("Bienvenidos al Sistema de sueldo basico");
	        System.out.println("1.Docente");
	        System.out.println("2.Tecnico");
	        System.out.println("3.Administrativo");
	        System.out.println("4.Limpieza");
	        System.out.println("5.Salir");
	        opc=sc.nextInt();
	        switch(opc) {
	        case 1:
	        	System.out.println("Ingrese el nombre");
	        	String nombre=sc.next();
	        	System.out.println("Ingrese el edad");
	        	int edad=sc.nextInt();
	        	System.out.println("Ingrese el cedula");
	        	int cedula=sc.nextInt();
	        	System.out.println("Ingrese el genero");
	        	String genero=sc.next();
	        	System.out.println("ingrese el sueldo");
	        	double sueldo=sc.nextDouble();
	        	System.out.println("ingrese titulo");
	        	boolean titulo=sc.nextBoolean();
	        	

	        	Docente docente=new Docente(nombre, edad, cedula, genero, sueldo, titulo);
	        	
	        	System.out.println("nombre: " +nombre);
	        	System.out.println("edad: " +edad);
	        	System.out.println("cedula: " +cedula);
	        	System.out.println("genero: " +genero);
	        	System.out.println("sueldo: " +sueldo);
	        	System.out.println("titulo: " +titulo);
	            docente.sueltototal();
	            
	            break;
	            
	        case 2:
	        	System.out.println("Ingrese el nombre");
	        	String nombre1=sc.next();
	        	System.out.println("Ingrese el edad");
	        	int edad1=sc.nextInt();
	        	System.out.println("Ingrese el cedula");
	        	int cedula1=sc.nextInt();
	        	System.out.println("Ingrese el genero");
	        	String genero1=sc.next();
	        	System.out.println("ingrese el sueldo");
	        	double sueldo1=sc.nextDouble();
	        	System.out.println("ingrese numero de hijos");
	        	int hijos=sc.nextInt();

	        	Tecnico tecnico=new Tecnico(nombre1, edad1, cedula1, genero1, sueldo1, hijos);
	        	
	        	System.out.println("nombre: " +nombre1);
	        	System.out.println("edad: " +edad1);
	        	System.out.println("cedula: " +cedula1);
	        	System.out.println("genero: " +genero1);
	        	System.out.println("sueldo: " +sueldo1);
	        	System.out.println("numero de hijos: " +hijos);
	            tecnico.sueltototal();
	            
	            break;
	            
	        case 3:
	        	
	        	System.out.println("Ingrese el nombre");
	        	String nombre2=sc.next();
	        	System.out.println("Ingrese el edad");
	        	int edad2=sc.nextInt();
	        	System.out.println("Ingrese el cedula");
	        	int cedula2=sc.nextInt();
	        	System.out.println("Ingrese el genero");
	        	String genero2=sc.next();
	        	System.out.println("ingrese el sueldo");
	        	double sueldo2=sc.nextDouble();
	        	System.out.println("ingrese promedio");
	        	double promedio=sc.nextDouble();
	        	System.out.println("ingrese hora de ingreso");
	        	double horario=sc.nextDouble();
	        	

	        	Administrativo administrativo=new Administrativo(nombre2, edad2, cedula2, genero2, sueldo2, promedio);
	        	
	        	System.out.println("nombre: " +nombre2);
	        	System.out.println("edad: " +edad2);
	        	System.out.println("cedula: " +cedula2);
	        	System.out.println("genero: " +genero2);
	        	System.out.println("sueldo: " +sueldo2);
	        	System.out.println("promedio obtenido en la U: " +promedio);
	        	System.out.println("hora de ingreso" +horario);
	            administrativo.sueltototal();
	            
	            break;
	            
	        case 4:
	        	
	        	System.out.println("Ingrese el nombre");
	        	String nombre3=sc.next();
	        	System.out.println("Ingrese el edad");
	        	int edad3=sc.nextInt();
	        	System.out.println("Ingrese el cedula");
	        	int cedula3=sc.nextInt();
	        	System.out.println("Ingrese el genero");
	        	String genero3=sc.next();
	        	System.out.println("ingrese el sueldo");
	        	double sueldo3=sc.nextDouble();
	        	System.out.println("ingrese discapacidad");
	        	boolean discapacidad=sc.nextBoolean();

	        	Limpieza limpieza=new Limpieza(nombre3, edad3, cedula3, genero3, sueldo3, discapacidad);
	        	
	        	System.out.println("nombre: " +nombre3);
	        	System.out.println("edad: " +edad3);
	        	System.out.println("cedula: " +cedula3);
	        	System.out.println("genero: " +genero3);
	        	System.out.println("sueldo: " +sueldo3);
	        	System.out.println("discapacidad: " +discapacidad);
	            limpieza.sueltototal();
	        	
	            break;
	            
	            default:
	            
	        }
	               
	        }while(opc !=5);
		}

	}


