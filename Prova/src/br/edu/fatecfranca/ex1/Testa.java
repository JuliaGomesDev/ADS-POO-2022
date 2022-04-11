package br.edu.fatecfranca.ex1;

public class Testa {

 
    public static void main(String[] args) {
        
        Computador pc = new Computador("ligado", 4);
        
        pc.upgradeMemoria(4);
        System.out.println(pc.toString());
    }
    
}
