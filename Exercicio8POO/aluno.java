package Exercicio8POO;

public class aluno {
    String nome;
    int matricula;
    
    double [] notas = {10, 7.5, 9};
    
    double calcularMedia() {
        double soma = 0;
        
        for (double nota : notas) {
            soma += nota;
        }
        return soma/ notas.length;
    }
    
}
