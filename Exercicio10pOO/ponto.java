/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10pOO;

/**
 *
 * @author Bryan
 */
public class ponto {
    int x,y;
    
    double calcularDistancia(ponto outroponto){
        int deltaX = x - outroponto.x;
        int deltaY = y - outroponto.y;
        return Math.sqrt(deltaX * deltaX + deltaY + deltaY);
        
    }
    
}
