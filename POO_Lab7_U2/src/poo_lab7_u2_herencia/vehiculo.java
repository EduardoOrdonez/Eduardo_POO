
package poo_lab7_u2_herencia;
public class vehiculo {
    String placa;
    int numruedas;
    Boolean encendido;
    String estado;
 
public void setNumRuedas(int ruedas){
    numruedas = ruedas;
}
public void encendido(){
    encendido=true;
    estado="vehiculo encendido";
    
}
public void apagado(){
    encendido=false;
    estado="vehiculo apagado";
}    
    
}