
package sistema_gestion;

import java.util.List;


public class Laboratorio2 extends Laboratorio{
private String lugar;
    //constructor
    public Laboratorio2(String nombre, int capacidad, List<String> equipos, String lugar) {
        super(nombre, capacidad, equipos);
        this.lugar = lugar;
    }
    //metodos get  para mostrar datos 
    public String getLugar() {
        return lugar;
    }    
}
    

