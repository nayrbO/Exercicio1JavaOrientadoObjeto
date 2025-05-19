/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5pOO;

/**
 *
 * @author Bryan
 */
public class circulo {
    double raio;
    
    double calcularArea(){
        return Math.PI * raio * raio;
    }
    
    double calcularCircuferencia(){
        return 2 * Math.PI * raio;
    }
}
