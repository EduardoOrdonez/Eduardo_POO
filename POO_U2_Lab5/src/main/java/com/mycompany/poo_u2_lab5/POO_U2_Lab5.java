
package com.mycompany.poo_u2_lab5;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
  


public class POO_U2_Lab5 {

    public static void main(String[] args) throws FileNotFoundException, IOException { 
    try(BufferedReader br=new BufferedReader(new FileReader("C:\\\\Practica 5\\\\Practica5"));
    BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\\\Practica 5\\\\Practica5"));){

    bw.write("esto es una prueba usando Bufered");
    bw.newLine();
    bw.write("Seguimos usando Beffered");
    bw.newLine();
    bw.write("hola a todos");
    
    bw.flush();
    
    String linea=br.readLine();
    while(linea!= null){
    System.out.println(linea);
    }
    }catch(IOException e){
        System.out.println("Error E/S:"+e);
    }    
    
    

    }
}
