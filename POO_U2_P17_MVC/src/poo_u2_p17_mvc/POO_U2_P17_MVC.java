
package poo_u2_p17_mvc;

import Controlador.Control;
import Modelo.Modelo;
import Vista.Vista;


public class POO_U2_P17_MVC {

    public static void main(String[] args) {
       
        Modelo mod=new Modelo();
        Vista vis=new Vista();
        Control cont=new Control(vis, mod);
        
        cont.iniciar();
        vis.setVisible(true);
    }
    
}
