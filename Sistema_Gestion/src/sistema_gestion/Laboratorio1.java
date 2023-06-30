
package sistema_gestion;

import java.util.List;

public class Laboratorio1 extends Laboratorio{
    private String espacio;
//constructor
    public Laboratorio1(String nombre, int capacidad, List<String> equipos, String espacio) {
        super(nombre, capacidad, equipos);
        this.espacio = espacio;
    }
    //metodos get  para mostrar datos 
    public String getEspacio() {
        return espacio;
    }
}

    

