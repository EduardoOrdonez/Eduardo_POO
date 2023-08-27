
package poo_p2_e1;

import java.util.Scanner;


public class POO_P2_E1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
      System.out.println("ingreser el nombre");
      String nombre=sc.nextLine();
      System.out.println("ingrese el numero cedula");
      int cedula=sc.nextInt();
      System.out.println("ingrese el monto");
      float monto=sc.nextFloat();
      
      if(monto > 1000){
          System.out.println("exedes los limites dados");   
      }else(monto <= 100){
        System.out.println("exedes los limites dados");
    }
      
      
      
      
      
      
       
    }
    
}
