package Exercicio8POO;

import java.util.Scanner;

public class mainpOO8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        aluno aluno1 = new aluno();
        
        System.out.print("Qual o nome do aluno?: ");
        aluno1.nome = sc.nextLine();
        
        System.out.println("Qual sua matricula?: " );
       aluno1.matricula = sc.nextInt();
       
        System.out.println("Qual a média do aluno?: "+aluno1.calcularMedia());
    }
}
