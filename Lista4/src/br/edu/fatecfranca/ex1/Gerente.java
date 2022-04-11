package br.edu.fatecfranca.ex1;

public class Gerente extends Funcionario {

    private float comissaao;

    public Gerente(float comissaao, int nro, String nome, float salario) {
        super(nro, nome, salario);
        this.comissaao = comissaao;
    }

    public Gerente() {
    }

    public float getComissaao() {
        return comissaao;
    }

    public void setComissaao(float comissaao) {
        this.comissaao = comissaao;
    }

    @Override
    public float calculaSalario() {
        return this.salario + (this.salario * this.comissaao / 100);
    }

    @Override
    public String toString() {
        return "Gerente{" + "comissaao=" + comissaao + super.toString() + " Salario Final: "
                + calculaSalario() + '}';
    }
}
