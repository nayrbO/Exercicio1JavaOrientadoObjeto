/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6pOO;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class mainpOO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        funcionario funcionario1 = new funcionario();
        
        System.out.print("Qual o nome do funcionario?: ");
        funcionario1.nome = sc.nextLine();
        
        System.out.println("Qual o salário de "+funcionario1.nome+"?: ");
        funcionario1.salario = sc2.nextDouble();
        
        System.out.println("Qual o departamento de "+funcionario1.nome+" ?: ");
        funcionario1.departamento = sc.nextLine();
        
        System.out.println("Quanto o salário de "+funcionario1.nome+" ira aumentar percentualmente: "+funcionario1.aumentarSalario(10.0));
    }
   
}
