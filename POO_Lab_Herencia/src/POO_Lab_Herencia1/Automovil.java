package POO_Lab_Herencia1;

public class Automovil extends Vehiculo{
	boolean parabrisas;
	
	@Override
	public void setNumeroRuedas(int rueda){
	    numRueda=rueda;
	}
	
	public void encendido(){
	    encendido=true;
	    estado="Automovil encendido";
	}
	
	public void apagado(){
	    encendido=false;
	    estado="Automovil apagado";
	}
	}


