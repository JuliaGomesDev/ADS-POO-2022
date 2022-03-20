
package br.edu.fatecfranca.ex4;

public class TestaRio {

    
    public static void main(String[] args) {
       Rio obj1 = new Rio();
       obj1.nome = "Amazonas";
       obj1.nivel = 1000;
       obj1.poluido = false;
       obj1.mostra();
       
       Rio obj2 = new Rio("Tietê", 2, true);
       obj2.chover(1);
       obj2.limpar();
       obj2.ensolarar(0.5f);
       obj2.mostra();
    }
    
}
