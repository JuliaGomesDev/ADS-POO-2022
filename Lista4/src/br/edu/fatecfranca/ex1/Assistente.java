package br.edu.fatecfranca.ex1;

public class Assistente extends Funcionario {

    private float bonus;

    public Assistente(float bonus, int nro, String nome, float salario) {
        super(nro, nome, salario);
        this.bonus = bonus;
    }

    public Assistente() {
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calculaSalario() {
        return this.salario + this.bonus;
    }
    
    @Override
    public String toString() {
        return "Assistente{" + " bonus= " + bonus + super.toString() + " Salario Final: " + calculaSalario() + '}';
    }
}
