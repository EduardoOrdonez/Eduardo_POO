
package poo_t4_u2_polimorfismo;


public class Deportista {
    private String nombre;
    private int edad;
    private String diciplina;
    private String sexo;
    
    public Deportista(String nombre, int edad, String diciplina, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.diciplina=diciplina;
        this.sexo=sexo;
             
    }
    
    public abstract void Entrenamiento(){
        
    }
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
