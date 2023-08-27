
package poo_p2_e1;


public class Cuenta {
    String nombre;
    int cedula;
    float money;
    
public void ingresodesaldo(String nombre, int ceula, float money){
    this.nombre=nombre;
    this.cedula=cedula;
    this.money=money;
}
public void salidadesaldo(){
    System.out.println(nombre+ " con C.I." +cedula +" retiro un monto con de " + money);
}
}
