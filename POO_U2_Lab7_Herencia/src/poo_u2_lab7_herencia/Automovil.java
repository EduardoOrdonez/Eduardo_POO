
package poo_u2_lab7_herencia;


public class Automovil extends vehiculo{
    Boolean parabrisas;
    
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
