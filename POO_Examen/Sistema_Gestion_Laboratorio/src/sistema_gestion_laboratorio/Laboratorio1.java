
package sistema_gestion_laboratorio;

import java.util.List;

public class Laboratorio1 extends Laboratorio{
    //Atributo
    private String espacios;
    
    //constructor
    public Laboratorio1(String nombre, int capacidad, List<String> equipos, String espacios){
        super(nombre, capacidad, equipos);
        this.espacios=espacios;
    }
    ///metodo get mostrar datos 
    public String getEspacio(){
        return espacios;
    }
	
	public void setEspacios(String espacios) {
		this.espacios = espacios;
	}
    
}
