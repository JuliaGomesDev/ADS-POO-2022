package br.edu.fatecfranca.ex3;

public class ItemCarrinho {
    private int codigo, qtd;
    private float valor;
    private String descricao;

    public ItemCarrinho() {
    }

    public ItemCarrinho(int codigo, int qtd, float valor, String descricao) {
        this.codigo = codigo;
        this.qtd = qtd;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String mostra() {
        return "ItemCarrinho{" + "codigo=" + codigo + ", qtd=" + qtd + ", valor=" + valor + ", descricao=" + descricao + '}';
    }
    
}
