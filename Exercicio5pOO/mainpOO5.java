/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5pOO;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class mainpOO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        circulo circulo1 = new circulo();
        
        System.out.print("Qual o raio do circulo?:");
        circulo1.raio = sc.nextDouble();
        
        System.out.println("Qual a área do circulo?: "+circulo1.calcularArea());
        
        System.out.println("Qual a circuferência do circulo?: "+circulo1.calcularCircuferencia());
    }
 
}
