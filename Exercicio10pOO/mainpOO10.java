/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10pOO;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class mainpOO10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ponto ponto1 = new ponto();
        ponto ponto2 = new ponto();
        
        System.out.println("Digite as coordenadas do primeiro ponto: ");
        System.out.print("x:");
        ponto1.x = sc.nextInt();
        System.out.print("y:");
        ponto1.y = sc.nextInt();
        
        System.out.println("Digite as coordenadas do segundo ponto: ");
        System.out.print("x:");
        ponto2.x = sc.nextInt();
        System.out.print("y:");
        ponto2.y = sc.nextInt();
        
        //Calcular e exbibir a distancia
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distancia dos pontos é: "+distancia);
        
    }
}
