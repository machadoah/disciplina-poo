package T01_Classes.exercicio.producao;

import java.util.Objects;

public abstract class Usuario {

    /**
     * <h2> Abstract </h2>
     *
     * <p>
     *     <ul>
     *         <li>Em uma classe define uma classe que não pode ser instanciada</li>
     *         <li>Em uma métodos é um metodo sem implementação</li>
     *     </ul>
     *
     * </p>
     */

    private String login;
    private String senha;

    public boolean logar(String login, String senha){
        return (Objects.equals(this.login, login)) && (Objects.equals(this.senha, senha));
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
