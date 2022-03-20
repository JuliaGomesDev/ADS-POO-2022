package br.edu.fatecfranca.ex2;
import javax.swing.JOptionPane;

public class TestaCliente {

    public static void main(String[] args) {
       int auxNrmConta = Integer.parseInt(JOptionPane.showInputDialog("NrmConta"));
       int auxNrmAgencia = Integer.parseInt(JOptionPane.showInputDialog("nrmAgencia"));
       String auxNome = JOptionPane.showInputDialog("Nome");
       float auxSaldo =  Float.parseFloat(JOptionPane.showInputDialog("Saldo"));
       Cliente obj1 = new Cliente(auxNrmConta, auxNrmAgencia, auxNome, auxSaldo);
       
       obj1.depositar(1000);
       obj1.depositar(5000);
       obj1.sacar(2000);
       obj1.mostra();
    }
    
}
