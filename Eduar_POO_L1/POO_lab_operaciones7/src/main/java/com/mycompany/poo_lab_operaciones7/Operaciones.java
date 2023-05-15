
package com.mycompany.poo_lab_operaciones7;

import javax.swing.JOptionPane;


public class Operaciones {
    //declaramos variables 
    int num1;
    int num2;
    int suma; int resta; int multiplicacion; int division;
    
   //generamos metodos
    //pedimos numeros 
    //muestro el metodo publico
    
    public void capturarnumeros(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
    }
        //creamos metodos para sumar
        public void suma(){
        suma=num1+num2;
    }
                 
        
        public void resultados(){
            System.out.println("el resultados de la suma es:"+suma);
        }
        public void resta(){
            resta=num1-num2;
             System.out.println("el resultados de la resta es:"+resta);
        }
        public void multiplicacion(){
            multiplicacion=num1*num2;
            System.out.println("el resultados de la multiplicacion es:"+multiplicacion);
        }
        public void division(){
            division=num1/num2;
            System.out.println("el resultados de la division es:"+division);
        }
        
    }

    

