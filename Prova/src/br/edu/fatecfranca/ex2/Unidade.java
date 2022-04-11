
package br.edu.fatecfranca.ex2;

public final class Unidade {
    private String cidade, estado;

    public Unidade() {
    }

    public Unidade(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String mostra() {
        return " Unidade{" + "cidade= " + cidade + ", estado= " + estado + '}';
    }
    
    
}
