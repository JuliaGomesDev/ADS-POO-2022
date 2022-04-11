package br.edu.fatecfranca.ex4;

public class Testa {

   
    public static void main(String[] args) {
        Post post1 = new Post(10, "A faculdade é legal", "Fulano");
        
        Comment comm1 = new Comment(1, "É ...", "Julia");
        Comment comm2 = new Comment(2, "Eu sou uma farsa, faz a chamada", "Marilia");
        Comment comm3 = new Comment(3, "Quero desistir", "Melissa");
        
        post1.addComment(comm1);
        post1.addComment(comm2);
        post1.addComment(comm3);
        
        post1.darLike(); post1.darLike();
        System.out.println(post1.toString());
        post1.removeComment(comm1);
        post1.tirarLike();
        System.out.println(post1.toString());
        post1.removeComment(comm1);
    }
}
