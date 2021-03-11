/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectogrupal;

import Subclasesproyecto.Farmacia;
import Subclasesproyecto.Laboratorio;

/**
 *
 * @author Gerson
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Laboratorio laboratorio = new Laboratorio();
       Farmacia farmacia = new Farmacia ();
        
        
        System.out.println("Herencia1");
        
        laboratorio.imprimirInformacion();
        System.out.println(farmacia.getColor());
        System.out.println(farmacia.getDirector());
    }
    
}
