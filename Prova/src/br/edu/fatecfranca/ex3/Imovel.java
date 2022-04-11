package br.edu.fatecfranca.ex3;

public abstract class Imovel {
    protected String endereco;

    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    public Imovel() {
    }

    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imovel{" + "endereço=" + endereco + '}';
    }
}
