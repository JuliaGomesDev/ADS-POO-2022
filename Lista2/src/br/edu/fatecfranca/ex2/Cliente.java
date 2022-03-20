package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public final class Cliente {
    
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    public Cliente(){}
    
    public Cliente(String numeroConta, String numeroAgencia,  String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8){
            if(numeroConta.charAt(6) == '-'){
                this.numeroConta = numeroConta;
            } else {
                this.numeroConta = "Inválido";
                System.out.println("Conta deve conter 8 dígitos e um dígito verificador na penúltima casa");
            }
        } else {
            this.numeroConta = "Inválido";
            System.out.println("Conta deve conter 8 dígitos e um dígito verificador na penúltima casa");
        }
    }
    
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6){
            if(numeroAgencia.charAt(4) == '-'){
                this.numeroAgencia = numeroAgencia;
            } else {
                this.numeroAgencia = "Inválido";
                System.out.println("Agência deve conter 6 dígitos e um dígito verificador na penúltima casa");
            }
        } else {
            this.numeroAgencia = "Inválido";
            System.out.println("Agência deve conter 6 dígitos e um dígito verificador na penúltima casa");
        }
    }
    
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    
    public void setNome(String nome) {
        if(nome.length() <= 30){
           this.nome = nome;
        } else {
            this.nome = "Inválido";
            System.out.println("O nome não pode ultrapassar 30 caracteres");
        }
    }
  
    public String getNome(){
        return this.nome;
    }
    
    public void setSaldo(float saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido");
        }
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + x);
    }
    
    public void realizarSaque(float x){
        this.setSaldo(this.saldo - x);
    }
    
    public void mostra(){
        JOptionPane.showMessageDialog(null, 
        "Nr. Conta: " + this.getNumeroConta() + 
        " Nr. Agência: " + this.getNumeroAgencia() +
        " Nome: " + this.getNome() +
        " Saldo: " + this.getSaldo());
    }
    
}
