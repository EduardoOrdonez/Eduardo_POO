
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Control implements ActionListener {
    
    private Vista view;
    private Modelo modelo;

    public Control(Vista view, Modelo modelo) {
        this.view = view;
        this.modelo = modelo;
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
        this.view.btnSalir.addActionListener(this);
        
    }
    public void iniciar(){
        view.setTitle("USTED VA A SUMAR POR MEDELO DE VISTA CONTROLADOR");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(modelo.getValor1()));
        view.txtN2.setText(String.valueOf(modelo.getValor2()));
        view.txtResul.setText(String.valueOf(modelo.getTotal()));
        
    }
  @Override
    public void actionPerformed(ActionEvent e) {

        int v1 = Integer.parseInt(view.txtN1.getText());
        int v2 = Integer.parseInt(view.txtN2.getText());
        modelo.setValor1(v1);
        modelo.setValor2(v2);
        
        if(e.getSource()==view.btnSumar){
            modelo.sumar();
        }
        if(e.getSource()==view.btnRestar){
            modelo.restar();
        }
        if(e.getSource()==view.btnMultiplicar){
            modelo.multiplicar();
        }
        if(e.getSource()==view.btnDividir){
            modelo.dividir();
        }
        
        view.txtResul.setText(String.valueOf(modelo.getTotal()));

        
        
    }
}



