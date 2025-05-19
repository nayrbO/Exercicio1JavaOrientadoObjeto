/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6pOO;

/**
 *
 * @author Bryan
 */
public class funcionario {
String nome;
double salario;
String departamento;

double aumentarSalario(double percentual){
    return salario += salario * percentual/100;
}

}
