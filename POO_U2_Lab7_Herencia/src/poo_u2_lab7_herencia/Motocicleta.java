
package poo_u2_lab7_herencia;



public class Motocicleta extends vehiculo{
    Boolean patada;
    
    @Override
    public void encendido(){
    encendido=true;
    estado="vehiculo encendido";
    
}
public void apagado(){
    encendido=false;
    estado="vehiculo apagado";
}
    
}
