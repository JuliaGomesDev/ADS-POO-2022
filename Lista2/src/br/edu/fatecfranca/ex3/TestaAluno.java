package br.edu.fatecfranca.ex3;

public class TestaAluno {

    public static void main(String[] args) {
        
        Aluno obj = new Aluno(123456, "Fulano", 20, 7.5f, 8);
        obj.notaFinal();
        obj.dadosAluno();
        
        Aluno obj1 = new Aluno();
         /* 
          Não é possível acessar as variáveis de forma direta, porque elas
          estão privadas. Assim o único meio de acessar elas são pelos métodos
          set e get.
        */
    }
    
}
