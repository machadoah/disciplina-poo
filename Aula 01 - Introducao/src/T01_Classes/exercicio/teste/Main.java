package T01_Classes.exercicio.teste;

import T01_Classes.exercicio.producao.Aluno;
import T01_Classes.exercicio.producao.Professor;
import T01_Classes.exercicio.producao.Usuario;

public class Main {

    public static void main(String[] args) {

        var usuario = new Professor();
        usuario.digitarNotas(4);

        var aluno = new Aluno();
        aluno.matriculeSe();
    }
}
