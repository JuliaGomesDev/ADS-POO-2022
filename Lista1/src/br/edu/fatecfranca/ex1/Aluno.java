package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Aluno {
    // declaração das variáveis
    int nroAluno;
    int idade;
    String nome;
    float p1;
    float p2;
    
    // métodos construtores
    Aluno(){
    }
    Aluno(int nroAluno, int idade, String nome, float p1, float p2){
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // métodos 
    
    //método que calcula e retorna a média da prova
    float notaFinal() {
        return (this.p1 + this.p2) / 2;
    } 
    
    //método de aprovação
    String passou(){
        return (this.notaFinal() >=6 ? "APROVADO" : "REPROVADO");
    }
    
    // método de apresentação de dados
    void dadosAluno() {
        JOptionPane.showInternalMessageDialog(null, "Nome: " + this.nome + " Situação: " + this.passou());
    }
        
}
