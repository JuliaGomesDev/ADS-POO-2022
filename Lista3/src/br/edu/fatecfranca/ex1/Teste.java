package br.edu.fatecfranca.ex1;
import java.util.Date;
import java.util.Calendar;

public class Teste {

    public static void main(String[] args) {
        Conta c1 = new Conta("0102341-1", "3259", "Fulano", 1000);
        
        // criando um data
        Calendar val = Calendar.getInstance();
        val.set(Calendar.YEAR, 2023);
        val.set(Calendar.MONTH, 2);
        val.set(Calendar.DAY_OF_MONTH, 18);
        // val é um Calendar, devemos converter para Date 
        
        Cartao ca1 = new Cartao(1234, 189, val.getTime(), "Visa", 9876, c1);
        
        ca1.mostra();
        ca1.sacar(600, 9876);
        ca1.mostra();
    }
    
}
