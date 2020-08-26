/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.imagen;

/**
 *
 * @author Notebook
 */
public class Archivo {
    String nombre,extension,ubicacion;
    boolean color;
    
    public Archivo(){
        this.nombre = "";
        this.extension = "JPG";
        this.ubicacion = "C:\\fotos";
        this.color = true;
        System.out.println("Creando Archivo...");
        
    }
    
    public Archivo(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public Archivo(String nombre, boolean color){
        this(nombre);
        this.color = color;
    }
    
    public Archivo(String nombre, boolean color, String extension){
        this(nombre,color);
        this.extension = extension.toUpperCase();
    
    }
    
    
    public void mostrarInfo(){
        
        System.out.println("Nombre: " + nombre + " Extension: " + extension);
        System.out.println("Ubicacion: " + ubicacion + " Color: " + color);

    }
    
   
}
