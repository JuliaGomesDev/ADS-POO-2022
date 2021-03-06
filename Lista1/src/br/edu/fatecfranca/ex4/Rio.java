package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class Rio {
    String nome;
    float nivel;
    boolean poluido;
    
    Rio(){
    }
    Rio(String nome, float nivel,boolean poluid0){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    void chover(float x){
        this.nivel += x;
    } 
    
    void ensolarar(float x){
        this.nivel -= x;
    }
    
    void limpar(){
        this.poluido = false;
    }
    
    void sujar(){
        this.poluido = true;
    }
    
    public void mostra(){
      JOptionPane.showMessageDialog(null, 
      "Nome: " + this.nome + 
      " Nível: " + this.nivel +
      " Poluído: " + (this.poluido ? "Sim" : "Não"));
    } 
}
