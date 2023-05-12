/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_creaciondeclases;

/**
 *
 * Creamos objetos
 */
public class POO_creaciondeclases {

    public static void main(String[] args) {
      Casa casa1= new Casa();
      Casa casa2= new Casa();
      Madre madre1 = new Madre();
      Madre madre2 = new Madre();
      Carro carro1 = new Carro();
      Carro carro2 = new Carro();
      
      
      casa1.Color="Rojo";
      casa1.Ubicacion="Av. Los Rosales";
      casa1.cuartos=2;
      casa1.baños=1;
      casa1.Pisos=1;
      
      System.out.println("Clase Casa");
      System.out.println(casa1.Color);
      System.out.println(casa1.Ubicacion);
      System.out.println(casa1.cuartos);
      System.out.println(casa1.baños);
      System.out.println(casa1.Pisos);
      
      casa2.Color="celeste";
      casa2.Ubicacion="calle los girasoles";
      casa2.cuartos=4;
      casa2.baños=2;
      casa2.Pisos=2; 
      
      System.out.println("Clase Casa");
      System.out.println(casa2.Color);
      System.out.println(casa2.Ubicacion);
      System.out.println(casa2.cuartos);
      System.out.println(casa2.baños);
      System.out.println(casa2.Pisos);
      
      madre1.Nombre="Maria";
      madre1.altura=1;
      madre1.Contextura="delgada";
      madre1.colorojos="verdes";
      madre1.colorpelo="negro";
      
      System.out.println(madre1.Nombre);
      System.out.println(madre1.altura);
      System.out.println(madre1.Contextura);
      System.out.println(madre1.colorojos);
      System.out.println(madre1.colorpelo);
      
      
      madre2.Nombre="Marthe";
      madre2.altura=2;
      madre2.Contextura="delgada";
      madre2.colorojos="cafe";
      madre2.colorpelo="negro";
      
      System.out.println(madre2.Nombre);
      System.out.println(madre2.altura);
      System.out.println(madre2.Contextura);
      System.out.println(madre2.colorojos);
      System.out.println(madre2.colorpelo);
      
      carro1.color="rojo";
      carro1.Cilindraje=1600;
      carro1.Marca="chevrolet";
      carro1.motor="wankel";
      carro1.chasis="LCJS100122";
      
      System.out.println(carro1.color);
      System.out.println(carro1.Cilindraje);
      System.out.println(carro1.Marca);
      System.out.println(carro1.motor);
      System.out.println(carro1.chasis);
      
      
      carro2.color="blanco";
      carro2.Cilindraje=1600;
      carro2.Marca="kia";
      carro2.motor="wankel";
      carro2.chasis="LCJS10012202022";
      
      System.out.println(carro2.color);
      System.out.println(carro2.Cilindraje);
      System.out.println(carro2.Marca);
      System.out.println(carro2.motor);
      System.out.println(carro2.chasis);
      
      
      
    }
}
