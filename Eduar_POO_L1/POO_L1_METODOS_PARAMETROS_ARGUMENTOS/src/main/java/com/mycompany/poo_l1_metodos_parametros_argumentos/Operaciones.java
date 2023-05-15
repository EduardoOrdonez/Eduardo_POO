
package com.mycompany.poo_l1_metodos_parametros_argumentos;


public class Operaciones {
    
    int suma;     int resta; int multiplicacion; int division;
    
    
    
    
    
    public void sumar(int nu1, int nu2){
    suma=nu1+nu2;
}
    public void resultados(){
        System.out.println("el resultado de la suma es:"+suma);
    }
    public void restar(int nu1, int nu2){
    resta=nu1-nu2;    
    }
    public void resultados1(){
        System.out.println("el resultado de la suma es:"+resta);
    }
    public void multiplicacion(int nu1, int nu2){
    multiplicacion=nu1*nu2;    
    }
    public void resultados2(){
        System.out.println("el resultado de la suma es:"+multiplicacion);
    }
    
    public void division(int nu1, int nu2){
    division=nu1-nu2;    
    }
    public void resultados3(){
        System.out.println("el resultado de la suma es:"+division);
    }
}
