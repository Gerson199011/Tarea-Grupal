/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subclasesproyecto;

/**
 *
 * @author Gerson
 */
public class Herencia {
    //Atributos
    private String edificio;
    private String pisos;
    
    public Herencia (){
        //Constructor sin parametros
    }
    
    //Establecer y Obtener
    public void establecerEdificio(String edificio){
        this.edificio = edificio;
        
    }
    public String obtenerEdificio(){
      return this.edificio;
      
    }
    //Establecer y Obtener
    public void establecerPisos(String pisos){
        this.pisos = pisos;
        
    }
    public String obtenerPisos(){
      return this.pisos;
      
    }
    
    public void imprimirInformacion(){
        System.out.println("Dimension: " + edificio);
        System.out.println("Niveles: " + pisos);
    }
}
