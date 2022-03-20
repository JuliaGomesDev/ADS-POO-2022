package br.edu.fatecfranca.ex2;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente obj = new Cliente("123456-7", "1234-5", "Fulano", 2000);
        obj.realizarDeposito(1000);
        obj.realizarSaque(500);
        obj.mostra();
        
        Cliente obj1 = new Cliente();
        /* 
          Não é possível acessar as variáveis de forma direta, porque elas
          estão privadas. Assim o único meio de acessar elas são pelos métodos
          set e get.
        */
      
    }  
}
