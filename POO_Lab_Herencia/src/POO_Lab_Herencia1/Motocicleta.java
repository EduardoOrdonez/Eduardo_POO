package POO_Lab_Herencia1;

public class Motocicleta extends Vehiculo{
	boolean patada;
    
@Override
 
public void setNumeroRuedas(int rueda){
    numRueda=rueda;
}

public void encendido(){
    encendido=true;
    estado="Motocicleta encendido";
}

public void apagado(){
    encendido=false;
    estado="Motocicleta apagado";
}
}


