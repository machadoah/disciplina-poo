package T01_Classes.exercicio.producao;

import java.util.Date;

public class Funcionario extends Usuario{

    private int numeroFuncional;

    public void registraHorario(Date hora){
        System.out.println("Registro na hora: " + hora);
    }
}
