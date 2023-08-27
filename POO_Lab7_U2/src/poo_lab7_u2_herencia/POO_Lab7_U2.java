
package poo_lab7_u2_herencia;


public class POO_Lab7_U2 {


    public static void main(String[] args) {
        Automovil auto = new Automovil();
        Motocicleta moto = new Motocicleta();
        vehiculo veh = new vehiculo();
        
       veh.apagado();
       auto.encendido();
       moto.encendido();
       
       
       System.out.println("el vehiculo esta:" + veh.estado);
       System.out.println("el vehiculo esta:" + auto.estado);
       System.out.println("el vehiculo esta:" + moto.estado);
       
                
    }
    
}
