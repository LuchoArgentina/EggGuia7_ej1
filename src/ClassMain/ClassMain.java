/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMain;

import Entidades.Libro;

/**
 *
 * @author lucho
 */
public class ClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libros = new Libro();
        
        Libro L1 =libros.ingresarLibro();
        Libro L2 =libros.ingresarLibro();
        
        System.out.println(L1.toString());        
        System.out.println(L2.toString());
        
    }
    
}
