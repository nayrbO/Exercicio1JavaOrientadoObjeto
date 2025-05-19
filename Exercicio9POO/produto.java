package Exercicio9POO;

public class produto {
String nome;
double preco;
int quantidadeEmEstoque;

int vender(int quantidade) {
    
    return quantidadeEmEstoque - quantidade;
    
}

int reporEstoque(int quantidade) {
    
    int repor = quantidadeEmEstoque + quantidade;
    return repor;
    
    }

 }