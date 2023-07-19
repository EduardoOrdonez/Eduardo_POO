
package sistema_gestion_laboratorio;


public class Asignatura {

    private String nombre;
    private String horario;
    private Laboratorio laboratorio;
    
    //constructores
    public Asignatura(String nombre, String horario, Laboratorio laboratorio){
        this.nombre=nombre;
        this.horario=horario;
        this.laboratorio=laboratorio;
    }
        public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    //Atributos
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
}
