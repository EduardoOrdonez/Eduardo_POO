
package sistema_gestion;


public class Asignatura {
    private String nombre;
    private String horario;
    private Laboratorio laboratorio;
//aplicamos constructores
    public Asignatura(String nombre, String horario, Laboratorio laboratorio) {
        this.nombre = nombre;
        this.horario = horario;
        this.laboratorio = laboratorio;
    }
        //metodos get el cual nos sirve para mostrar datos
    public String getNombre() {
        return nombre;
    } 
    public String getHorario() {
        return horario;
    } 
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
}

    

