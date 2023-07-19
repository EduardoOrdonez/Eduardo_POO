
package sistema_gestion_laboratorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sistema_Gestion_Laboratorio {

   
    public static void main(String[] args) {
        //ingresamos el scnner para el ingreso de consola
        Scanner leer = new Scanner(System.in);
        int opc; 
        do{
        System.out.println("Bienvenidos Solicitar Laboratorio");
        System.out.println("1.Profesor");
        System.out.println("2.Estudiante");
        System.out.println("3.Encargado");
        System.out.println("4.salir");
        opc=leer.nextInt();
        switch(opc) {
        case 1:
        	System.out.println("ingrese el nombre del personal que solicita el Lab");
            String nombre1=leer.next();
            System.out.println("ingrese la id del personal que solicita el Lab");
            int id=leer.nextInt();
            System.out.println("Especialidad del docente");
            String titulo=leer.next();
            
            Profesor pro = new Profesor(nombre1, id, titulo);
            
            System.out.println("el nombre del docente" +nombre1);
            System.out.println("con id: " +id );
            System.out.println("Se especializa en " +titulo);
            break;
        case 2:
        	System.out.println("ingrese el nombre del personal que solicita el Lab");
            String nombre2=leer.next();
            System.out.println("ingrese la id del personal que solicita el Lab");
            int id2=leer.nextInt();
            System.out.println("numero de matriculas tenidas");
            int nmatriculas=leer.nextInt();
            
            Estudiante est= new Estudiante(nombre2, id2, nmatriculas);
            
            System.out.println("el nombre del docente" +nombre2);
            System.out.println("con id: " +id2 );
            System.out.println("Se especializa en " +nmatriculas);
            break;
        case 3:
        	
        	System.out.println("ingrese el nombre del personal que solicita el Lab");
            String nombre3=leer.next();
            System.out.println("ingrese la id del personal que solicita el Lab");
            int id3=leer.nextInt();
            System.out.println("numero de matriculas tenidas");
            String area=leer.next();
            
            Encargado enc= new Encargado(nombre3, id3, area);
            
            System.out.println("el nombre del docente" +nombre3);
            System.out.println("con id: " +id3 );
            System.out.println("Se especializa en " +area);
        	break;
        } 
        }while(opc !=4); 
        
        
        
        System.out.println("identificarse:");
        String cargo=leer.next();
        
        System.out.println("numero de matriculas repetidas del estudiante");
        int numero=leer.nextInt();
        System.out.println("Encargado de que area");
        String area=leer.next();
        
        
        
        
        
        
        //creamos el list para mostrar lista de los arreglos 
        List<Laboratorio> laboratorios = new ArrayList<>();
        System.out.println("Ingresar la cantidad de laboratorios:");
        int nLaboratorios=leer.nextInt();
        //for(inicializamos, condicion, aumento o decrecimiento)
        for (int i =0; i <nLaboratorios; i++){
            System.out.println("N° LAboratorios: " + (i + 1));
            System.out.println("Ingrese el nombre del Laboratorio");
            String nombre=leer.next();
            System.out.println("ingrese la cantidad de laboratorios");
            int capacidad=leer.nextInt();
            System.out.println("ingrese la cantidad de equipos: ");
            int nEquipos=leer.nextInt();
            
            List<String> equipos=new ArrayList<>();
            //for(inicializamos, condicion, aumento o decrecimiento)
            for(int j = 0; j <nEquipos ; j++){
                System.out.println("ingrese el nombre del equipo: " + (j + 1) + ":");
                String equipo=leer.next();
                //nos permite añadir un elemento al final del array
                equipos.add(equipo);
            }
            System.out.println("Selecciones el laboratorio:");
            System.out.println("1. laboratorio1");
            System.out.println("2. laboratorio2");
            int tipo=leer.nextInt();
            // llamamos el nombre de la clase principal laboratorio
            Laboratorio laboratorio;
            //creamos un condicional if para comprar el tipo de numero que se igual a 1
            if(tipo ==1){
                System.out.println("ingrese el espacio del labortorio1:");
                String espacio=leer.next();
                //llamamos al objeto laboratorio y llamamos al la clase hija laboratori1 con sus atributos de la clase principal laboratorio
                // y la clase laboratorio1
                laboratorio = new Laboratorio1(nombre, capacidad, equipos, espacio);
            }else{
                System.out.println("ingrese el espacio del labortorio2:");
                String lugar=leer.next();
                // llamamos al objeto laboratorio y llamamos a la clase hija laboratorio1 cons sus atributos de la clase principal laboratorio
                //y la clase secundaria laboratorio2
                laboratorio = new Laboratorio2(nombre, capacidad, equipos, lugar);
            }
            //nos permite añadir un elemento al final del ArrayList
            laboratorios.add(laboratorio);
            
        }
        System.out.print("Ingrese la cantidad de asignaturas a agregar: ");
        int numAsignaturas = leer.nextInt();
        //Llamamos el arreglo List de Asignatura del arreglo ArrayList
        List<Asignatura> asignaturas = new ArrayList<>();
        //for (inicializamos, dondicion, aumento o decremento)
        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("Asignatura #" + (i + 1));
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nombre = leer.next();
            System.out.print("Ingrese el horario de la asignatura: ");
            String horario = leer.next();
            
            
            System.out.println("seleccione el laboratorio asignado para la asignatura");
            for( int j = 0; j < laboratorios.size();j++){
                System.out.println((j+1) + ". " + laboratorios.get(j).getNombre());
            }
            int labIndex=leer.nextInt() - 1;
            Laboratorio laboratorio=laboratorios.get(labIndex);
            Asignatura asignatura=new Asignatura(nombre, horario, laboratorio);
            asignaturas.add(asignatura);     
        }
        System.out.println("informacion de los laboratorios");
        for(Laboratorio laboratorio : laboratorios){
            System.out.println("nombre" + laboratorio.getNombre());
            System.out.println("capacidad" + laboratorio.getCapacidad());
            System.out.println("equipos" +laboratorio.getEquipos());
            if (laboratorio instanceof Laboratorio1){
                System.out.println("espacios" + ((Laboratorio1) laboratorio).getEspacio());
            }else if ( laboratorio instanceof Laboratorio2){
                System.out.println("lugar; " +((Laboratorio2) laboratorio).getLugar());
            }
            System.out.println();
        }
    leer.close();
    }
}
