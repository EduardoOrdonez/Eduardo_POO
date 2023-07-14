
package poo_t4_u2_polimorfismo;

import java.util.Scanner;


public class POO_T4_u2_Polimorfismo {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre,diciplina,sexo;
        int edad;
        int op1;
        System.out.println("Escoja una opcion"
                + "/n1.Atletismo"
                + "/n2.Natacion");
        switch(op1){
            case 1:
                System.out.println("ingresar los datos");
                System.out.println("nombre ");
                nombre=sc.nextLine();
                System.out.println("edad ");
                edad=sc.nextInt();
                System.out.println("diciplina ");
                diciplina=sc.nextLine();
                System.out.println("sexo ");
                sexo=sc.nextLine();
                System.out.println("prueba ");
                String prueba=sc.nextLine();
                Atletismo atle=new Atletismo(nombre,edad,diciplina,sexo,prueba);
                atle.datos();
                break;
                
            case 2:
                System.out.println("ingresar los datos");
                System.out.println("nombre ");
                nombre=sc.nextLine();
                System.out.println("edad ");
                edad=sc.nextInt();
                System.out.println("diciplina ");
                diciplina=sc.nextLine();
                System.out.println("sexo ");
                sexo=sc.nextLine();
                System.out.println("estilo ");
                String estilo=sc.nextLine();
                Natacion nata=new Natacion(nombre,edad,diciplina,sexo,estilo);
                nata.datos();
                default;
                break;
        }
    }
    
}
