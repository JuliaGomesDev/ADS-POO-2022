package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
  int nrmConta, nrmAgencia;
  String nome;
  float saldo;
  
  Cliente(){
  }
  
  Cliente(int nrmConta,int nrmAgencia, String nome,float saldo){
      this.nrmConta = nrmConta;
      this.nrmAgencia = nrmAgencia;
      this.nome = nome;
      this.saldo = saldo;
  }
  void sacar(float x){
      this.saldo -= x;
  }
  
  void depositar(float x){
      this.saldo += x;
  }
  
  void mostra(){
      JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "Saldo: " + this.saldo);
  }
   
}
