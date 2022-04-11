package br.edu.fatecfranca.ex2;

public class Carro extends Veiculo {
    
    private float potencia;
    private String combutivel;

    public Carro() {
    }

    public Carro(float potencia, String combutivel, String modelo, String nome, int ano) {
        super(modelo, nome, ano);
        this.potencia = potencia;
        this.combutivel = combutivel;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getCombutivel() {
        return combutivel;
    }

    public void setCombutivel(String combutivel) {
        this.combutivel = combutivel;
    }

   @Override
   public String comoMeLocomovo(){
       return " Eu me locomovo com carro de potência " + this.potencia
       + " de combustível " + this.combutivel;
   }

    @Override
    public String toString() {
        return "Carro{" + " potencia= " + this.potencia + ", combutivel= " + this.combutivel +  
                super.toString() + comoMeLocomovo() + '}';
    } 
}
