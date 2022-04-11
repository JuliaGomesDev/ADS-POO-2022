package br.edu.fatecfranca.ex3;

public class Testa {
    
    public static void mostra(Imovel x){
        System.out.println(x.toString());
    }

    public static void main(String[] args) {
       Apto ap = new Apto(1000, "Rua sei lá");
       Casa cs = new Casa(12.3f, "Rua outra");
       
       mostra(ap);
       mostra(cs);
    }
    
}
