package sistema_gestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Sistema_Gestion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<Laboratorio> laboratorios = new ArrayList<>();
        System.out.print("Ingrese la cantidad de laboratorios a agregar: ");
        int numLaboratorios = leer.nextInt();
        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("Laboratorio #" + (i + 1));
            System.out.print("Ingrese el nombre del laboratorio: ");
            String nombre = leer.next();
            System.out.print("Ingrese la capacidad del laboratorio: ");
            int capacidad = leer.nextInt();
            System.out.print("Ingrese la cantidad de equipos del laboratorio: ");
            int numEquipos = leer.nextInt();
            List<String> equipos = new ArrayList<>();
            for (int j = 0; j < numEquipos; j++) {
                System.out.print("Ingrese el nombre del equipo #" + (j + 1) + ": ");
                String equipo = leer.next();
                equipos.add(equipo);
            }
            System.out.println("Seleccione el tipo de laboratorio:");
            System.out.println("1. Laboratorio1");
            System.out.println("2. Laboratorio2");
            int tipo = leer.nextInt();
            Laboratorio laboratorio;
            if (tipo == 1) {
                System.out.print("Ingrese el espacio del Laboratorio1: ");
                String espacio = leer.next();
                laboratorio = new Laboratorio1(nombre, capacidad, equipos, espacio);
            } else {
                System.out.print("Ingrese el lugar del Laboratorio2: ");
                String lugar = leer.next();
                laboratorio = new Laboratorio2(nombre, capacidad, equipos, lugar);
            }
            laboratorios.add(laboratorio);
        }
        System.out.print("Ingrese la cantidad de asignaturas a agregar: ");
        int numAsignaturas = leer.nextInt();
        List<Asignatura> asignaturas = new ArrayList<>();
        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("Asignatura #" + (i + 1));
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nombre = leer.next();
            System.out.print("Ingrese el horario de la asignatura: ");
            String horario = leer.next();

            System.out.println("Seleccione el laboratorio asignado para la asignatura:");
            for (int j = 0; j < laboratorios.size(); j++) {
                System.out.println((j + 1) + ". " + laboratorios.get(j).getNombre());
            }
            
            int labIndex = leer.nextInt() - 1; 
            Laboratorio laboratorio = laboratorios.get(labIndex); 
            Asignatura asignatura = new Asignatura(nombre, horario, laboratorio);
            asignaturas.add(asignatura);
        }
        System.out.println("Información de los laboratorios:");
        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("Nombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());
            System.out.println("Equipos: " + laboratorio.getEquipos());
            if (laboratorio instanceof Laboratorio1) {
                System.out.println("Espacio: " + ((Laboratorio1) laboratorio).getEspacio());
            } else if (laboratorio instanceof Laboratorio2) {
                System.out.println("Lugar: " + ((Laboratorio2) laboratorio).getLugar());
            }
            System.out.println();
        } 
        leer.close();
    }
}

    
    

