/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.ejemploclase;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2AAldapeFEjemploClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb= new Scanner(System.in);
        String color;
        
        System.out.println("Cual es el color de tu coche:");
        color= kb.next();
        
        automovil carro1= new automovil(color, 2, "Mazda", 2017);
            carro1.avanzar();
            System.out.println("El carro es un "+carro1.marca+ " color "+carro1.color+".");
            
        carro1.ocupantes=5;
        System.out.println("El carro es para "+ carro1.ocupantes + " personas.");
        
        
        
        
    }
    
}
