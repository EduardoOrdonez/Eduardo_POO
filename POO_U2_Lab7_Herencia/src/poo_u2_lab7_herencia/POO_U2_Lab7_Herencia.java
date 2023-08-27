
package poo_u2_lab7_herencia;


public class POO_U2_Lab7_Herencia {

    
    public static void main(String[] args) {
                Automovil auto1 = new Automovil();
        Motocicleta moto = new Motocicleta();
        vehiculo veh = new vehiculo();
        
       veh.apagado();
      
       moto.encendido();
       
       
       System.out.println("el vehiculo esta:" + veh.estado);
       System.out.println("el vehiculo esta:" + auto.estado);
       System.out.println("el vehiculo esta:" + moto.estado);
       
                
    }
    
}

    }
    
}
