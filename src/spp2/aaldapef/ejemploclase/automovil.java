/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.ejemploclase;

/**
 *
 * @author Alumno
 */
public class automovil {
    //Atributos
    String color,marca;
    int ocupantes,modelo;
    
    //Funciones
    //Constructor
    public automovil(){
        color="rojo";
        ocupantes=5;
        marca="ford";
        modelo=2016;
    }
    
    public automovil(String color, int ocupantes, String marca, int modelo){
        this.color=color;
        this.ocupantes=ocupantes;
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public void avanzar(){
        System.out.println("El carro avanza");
    }
    
    public void detenerse(){
        System.out.println("El carro se detiene");
    }
    
    public void retroceder(){
        System.out.println("El carro retrocede");
    }
}
