package br.edu.fatecfranca.ex2;

public class Testa {
    
    public static void mostra(Veiculo x){
        System.out.println(x.toString());
    }

    public static void main(String[] args) {
      Carro cr1 = new Carro(300, "Gasolina", "Palio", "Marquinhos", 2010);
      Bicicleta bi1  = new Bicicleta(100, 18, "Mountain Bike", "Bike", 2010);
      
      mostra(cr1);
      mostra(bi1);
        
    }
    
}
