package br.edu.fatecfranca.ex2;

public final class Cliente {
    
    private String rg, nome;

    public Cliente() {
    }

    public Cliente(String rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String mostra() {
        return " Cliente{" + "rg= " + rg + ", nome= " + nome + '}';
    } 
}
