package T01_Classes.exercicio.producao;

public class Professor extends Funcionario{

    private String titulacao;

    public void digitarNotas(int turma){
        System.out.printf("Notas da turma %d foram digitadas\n", turma);
    }

}
