
package sistema_gestion_laboratorio;

import java.util.List;


public class Laboratorio {
    //Atributos
    private String nombre;
    private int capacidad;
    private List<String> equipos;
    //constructores
    public Laboratorio(String nombre, int capacidad, List<String> equipos){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.equipos=equipos;
    }
    //metodos get para motros datos
    public String getNombre(){
        return nombre;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public List<String> getEquipos(){
        return equipos;
    }
    public boolean verificarDisponibilidad(String horario){
        return true;
    }
    
}
