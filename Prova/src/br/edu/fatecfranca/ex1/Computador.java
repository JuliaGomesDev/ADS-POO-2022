package br.edu.fatecfranca.ex1;

public final class Computador {

    private String modo;
    private int memoria;

    public Computador() {
    }

    public Computador(String modo, int memoria) {
        this.setModo(modo);
        this.setMemoria(memoria);
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        if ((modo.equals("desligado")) || (modo.equals("ligado"))) {
            this.modo = modo;
            System.out.println("O computador está: " + this.modo);
        } else {
            this.modo = "Inválido";
            System.out.println("Modo inválido, o computador pode estar apenas ligado ou desligado");
        }
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        if (memoria == 4 || memoria == 8 || memoria == 16 || memoria == 32) {
            this.memoria = memoria;
            System.out.println("Memória de : " + this.memoria + " adicionada com sucesso");
        } else {
            System.out.println("Capacidade inválida. Tipos aceitos: 4, 8, 16 e 32");
        }
    }

    public void upgradeMemoria(int x) {
        this.setMemoria(this.memoria + x);
    }

    @Override
    public String toString() {
        return "Computador{" + "modo= " + this.modo + ", memoria= " + this.memoria + '}';
    }

}
