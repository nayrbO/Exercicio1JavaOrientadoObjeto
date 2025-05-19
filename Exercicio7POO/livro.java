package Exercicio7POO;

public class livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel;
    
    void emprestar() {
       if(disponivel){
        disponivel = false;
           System.out.println("Livre "+titulo+" emprestado com sucesso");
       }else{
           System.out.println("Livro "+titulo+" não esta disponivel para emprestimo.");    
       } 
    }
    
    void devolver() {
        if(!disponivel) {
         disponivel = true;
            System.out.println("Livro "+titulo+" devolvido com sucesso.");
        }else{
            System.out.println("Livro "+titulo+" já esta disponivel");
        }
    }
    
}
