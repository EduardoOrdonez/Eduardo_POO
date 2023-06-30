
package sistema_gestion;

import java.util.List;


public class Laboratorio {
    private String nombre;
    private int capacidad;
    private List<String> equipos;
    //constructores
    public Laboratorio(String nombre, int capacidad, List<String> equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
    }
        //metodos get  para mostrar datos 
    public String getNombre() {
        return nombre;
    }
        //metodos get  para mostrar datos 
    public int getCapacidad() {
        return capacidad;
    }
        //metodos get  para mostrar datos  
    public List<String> getEquipos() {
        return equipos;
    }
    public boolean verificarDisponibilidad(String horario) {
        // Implementa aquí la lógica para verificar la disponibilidad de un horario específico en el laboratorio
        // Devuelve true si está disponible y false si está ocupado
        return true;
    }
}

    

