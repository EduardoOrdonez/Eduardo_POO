
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Control implements ActionListener {
    
    private Vista Vista;
    private Modelo modelo;
    
    public Control(Vista view, Modelo modelo){
        this.Vista=Vista;
        this.modelo=modelo;
        this.Vista.btnSumar.addActionListener(this);
        
                
    }
    public void iniciar(){
        Vista.setTitle("Usted va a sumar por medio de mvc");
        Vista.setLocationRelativeTo(null);
        Vista.txtN1.setText(String.valueOf(modelo.getV1()));
        Vista.txtN2.setText(String.valueOf(modelo.getV2()));
        Vista.txtResul.setText(String.valueOf(modelo.getTotal()));
        
    }
    
    @Override
    public void  actionPerformed(ActionEvent e){
        modelo.setV1(Integer.valueOf(Vista.txtN1.getX()));
        modelo.setV2(Integer.valueOf(Vista.txtN2.getX()));
        
        modelo.sumar();
        Vista.txtResul.setText(String.valueOf(modelo.getTotal()));
        
    }


}
