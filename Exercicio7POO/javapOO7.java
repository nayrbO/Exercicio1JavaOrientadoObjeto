package Exercicio7POO;

import java.util.Scanner;

public class javapOO7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        livro livro = new livro();
        
        System.out.print("Digite o titulo do livro: ");
        livro.titulo = sc.nextLine();
        
        System.out.print("Digite o nome do autor: ");
        livro.autor = sc.nextLine();
        
        System.out.print("Digite o ano de publicação: ");
        livro.anoPublicacao = sc.nextInt();
        
        livro.disponivel = true;
        
        System.out.println(" ## Informações do livro cadastrado ## ");
        System.out.println("Titulo: "+livro.titulo);
        System.out.println("Autor: "+livro.autor);
        System.out.println("Ano de Publicação: "+livro.anoPublicacao);
        
        System.out.println("\n Deseja emprestar o livro? (s/n) ");
        sc.nextLine(); //Consumir nova linha
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")) {
         livro.emprestar();
        }
        
        System.out.println("\nDeseja devolver o livro? (s/n) ");
        opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")) {
            livro.devolver();
        }
        
        sc.close();
        
    }
}
