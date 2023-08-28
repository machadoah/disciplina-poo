package T01_Classes.exercicio.producao;

public class Aluno extends Usuario{

    private int matricula;
    private String curso;

    public void matriculeSe(){
        System.out.println("Matricula realizada");
    }

    public void trancarMatricula(){
        System.out.println("Matricula trancada");
    }

}
