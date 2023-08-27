
package poo_lab7_u2_herencia;

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
