
package br.edu.fatecfranca.ex2;

import java.util.Date;

public class Testa {

    
    public static void main(String[] args) {
       Cliente c1 = new Cliente("1234", "Fulano");
       Unidade ud = new Unidade("Franca", "São Paulo");
       Pedido pd1 = new Pedido(123, new Date(), c1, ud);
       
        System.out.println(pd1.mostra());
        
    }
    
}
