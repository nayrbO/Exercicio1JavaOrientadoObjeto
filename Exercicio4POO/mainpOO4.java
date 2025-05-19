package Exercicio4POO;

import java.util.Scanner;

public class mainpOO4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        retangulo  retangulo1 = new retangulo();
  
        System.out.print("Qual o valor da base do retangulo?: ");
        retangulo1.base = sc.nextDouble();
        
        System.out.print("Qual o valor da altura do retangulo?: ");
        retangulo1.altura = sc.nextDouble();
        
        System.out.println("Qual o valor da area do retangulo?: " +retangulo1.calcularArea());
        
        System.out.println("Qual o valor do perimetro do retangulo?: "+retangulo1.calcularPerimetro());
        
    }
    
  
    
}
