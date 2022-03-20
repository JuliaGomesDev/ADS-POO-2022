package br.edu.fatecfranca.ex3;

public class TestaProduto {

    public static void main(String[] args) {
      Produto obj1 = new Produto(123, 50, "Máscara", 5); 
      obj1.comprar(30);
      obj1.subir(1);
      obj1.vender(8);
      obj1.descer(1.5f);
      obj1.mostra();
    }
    
}
