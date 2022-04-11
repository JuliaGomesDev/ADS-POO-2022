package br.edu.fatecfranca.ex3;

import java.util.Date;

public class Testa {
    
    public static void main(String[] args) {
        Carrinho car1 = new Carrinho(100, new Date());
        ItemCarrinho item1 = new ItemCarrinho(9, 2, 12, "Chocolate");
        ItemCarrinho item2 = new ItemCarrinho(8, 3, 3, "Bolacha");
        ItemCarrinho item3 = new ItemCarrinho(7, 24, 9, "Cerveja");
        car1.addItem(item1);
        car1.addItem(item2);
        car1.addItem(item3);
        car1.mostra();
        System.out.println(car1.mostra());
        car1.removeItem(item2);
        System.out.println(car1.mostra());
    }
    
}
