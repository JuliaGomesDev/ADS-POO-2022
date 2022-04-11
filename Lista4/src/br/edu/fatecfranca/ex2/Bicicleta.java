package br.edu.fatecfranca.ex2;

public class Bicicleta extends Veiculo {

    private int quadro, aro;

    public Bicicleta() {
    }

    public Bicicleta(int quadro, int aro, String modelo, String nome, int ano) {
        super(modelo, nome, ano);
        this.quadro = quadro;
        this.aro = aro;
    }

    public int getQuadro() {
        return quadro;
    }

    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }

    public int getAro() {
        return aro;
    }

    public void setaro(int aro) {
        this.aro = aro;
    }

    @Override
    public String comoMeLocomovo() {
        return " Eu me locomovo de bicicleta quadro " + this.quadro
                + " com aro " + this.aro;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "quadro=" + quadro + ", aro=" + aro + 
                super.toString() + comoMeLocomovo() +'}';
    }
}
