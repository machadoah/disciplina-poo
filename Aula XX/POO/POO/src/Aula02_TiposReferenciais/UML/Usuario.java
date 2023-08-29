package Aula02_TiposReferenciais.UML;

public class Usuario {

	private String login;
	private String senha;

	public Usuario() {
	
	};

	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public boolean logar(String login, String senha) {
		return ((this.login == login && this.senha == senha) ? true : false);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "\n<Dados do usuário>\ne-mail: " + getLogin() + "\nsenha: " + getSenha();
	}

}
