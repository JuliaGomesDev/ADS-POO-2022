package br.edu.fatecfranca.ex2;

import java.util.Date;

public final class Pedido {
    private int codigo;
    private Date data;
    private Cliente cliente;
    private Unidade unidade;

    public Pedido() {
    }

    public Pedido(int codigo, Date data, Cliente cliente, Unidade unidade) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.unidade = unidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    public String mostra() {
        return "Pedido{" + "codigo=" + codigo + ", data=" + data + this.cliente.mostra() + this.unidade.mostra() + '}';
    } 
}
