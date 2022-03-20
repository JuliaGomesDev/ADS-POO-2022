package br.edu.fatecfranca.ex3;

public final class Aluno {
    
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    
    // Métodos construtores
    
    public Aluno(){
    }
    
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    // Métodos setters

    public void setNumeroAluno(int numeroAluno){
       if(Integer.toString(numeroAluno).length() != 6){
           this.numeroAluno = 0;
           System.out.println("O Nr. do Aluno precisa conter 6 dígitos!");
       } else {
           this.numeroAluno = numeroAluno;
       }
    }
    
    public void setNome (String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        } else {
            this.nome = "Inválido";
            System.out.println("O nome não pode ultrapassar 30 caracteres");
        }
    }
    
    public void setIdade (int idade){
        if(idade < 0){
            this.idade = 0;
            System.out.println("A idade do aluno não pode ser negativa!");
        } else {
            this.idade = idade;
        }
    }
    
    public void setP1 (float p1){
        if(p1 < 0){
            this.p1 = 0;
            System.out.println("A nota da prova 1 não pode ser negativa!");
        } else {
            this.p1 = p1;
        }
    }
    
    public void setP2 (float p2){
        if(p2 < 0){
            this.p2 = 0;
            System.out.println("A nota da prova 2 não pode ser negativa!");
        } else {
            this.p2 = p2;
        }
    }
    
    // Métodos getters
    
    public int getNumeroAluno(){
        return this.numeroAluno;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public float getP1(){
        return this.p1;
    }
    
    public float getP2(){
        return this.p2;
    }
    
    // Métodos
    
    public void notaFinal(){      
        System.out.println("Nota final: " + (this.p1 + this.p2) / 2);
    }
    
    public void dadosAluno(){
        System.out.println("Nro. do Aluno: " + getNumeroAluno() +
        " Nome: " + getNome() +
        " Idade: " + getIdade());
    }
}
