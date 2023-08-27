package POO_Lab_Herencia1;

public class Vehiculo {
	String Placa;
    int numRueda;
    boolean encendido;
    String estado;
   
public void setNumeroRuedas(int rueda){
    numRueda=rueda;
}

public void encendido(){
    encendido=true;
    estado="Vehiculo encendido";
}

public void apagado(){
    encendido=false;
    estado="Vehiclo apagado";
}

}

