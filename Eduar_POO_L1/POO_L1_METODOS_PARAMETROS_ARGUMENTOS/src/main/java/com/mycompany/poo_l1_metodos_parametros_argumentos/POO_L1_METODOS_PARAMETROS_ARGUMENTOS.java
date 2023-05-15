/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_l1_metodos_parametros_argumentos;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class POO_L1_METODOS_PARAMETROS_ARGUMENTOS {

    public static void main(String[] args) {
       
        Operaciones op1 = new Operaciones();
        
        
        int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
        
        int suma=op1.suma;
        int resta=op1.resta;
        
        
        System.out.println("el resultado de la multiplicaion es"+ op1.suma);
                
    }
}
