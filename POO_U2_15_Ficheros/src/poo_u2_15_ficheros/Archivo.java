
package poo_u2_15_ficheros;

import java.io.*;

public class Archivo {
    public static void crearArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        
        try{
            PrintWriter salida =new PrintWriter(archivo);
            salida.close();
            System.out.println("Archivo creado");
            
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void LeerArchivo(String nombreArchivo, String contenido){
        File archivo=new File(nombreArchivo);
        
        try{
            BufferedReader entrada =new BufferedReader(new FileReader(archivo));
            String lectura=entrada.readLine();
            while(lectura!=null){
                System.out.println(lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
            
            
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void eliminarArchivo(String nombreArchivo, String contenido){
        File archivo=new File(nombreArchivo);
        System.out.println(archivo.exists());
        archivo.delete();
        System.out.println("Archivo eliminado");
    }
}
    
    

