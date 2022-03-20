
package br.edu.fatecfranca.ex2;
import java.util.Date;

public class Testa {
    
    public static void main(String[] args) {
     
        Passageiro pa1 = new Passageiro("Fulano", "123.456.789.12");
        Voo vo1 = new Voo(123, "São Paulo", "Cancun");
        Reserva res1 = new Reserva(123, new Date(), pa1, vo1);
        
        System.out.println(res1.mostra());
        
    }
  
}
