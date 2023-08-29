package Aula02_TiposReferenciais.Aula03;

public class NovoObjeto {
	public String nome;
	
	public NovoObjeto(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
