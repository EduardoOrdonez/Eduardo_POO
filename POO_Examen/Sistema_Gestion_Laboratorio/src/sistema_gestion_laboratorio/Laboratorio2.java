
package sistema_gestion_laboratorio;

import java.util.List;


public class Laboratorio2 extends Laboratorio{ 
    
    ///Atributo
    private String lugar;
    //Construtor
    public Laboratorio2(String nombre, int capacidad, List<String> equipos, String lugar){
        super(nombre, capacidad, equipos);
        this.lugar=lugar;    
    }
    ///metodos get para mostrar datos
    public String getLugar(){
        return lugar;
    }
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
    
    
    
}
