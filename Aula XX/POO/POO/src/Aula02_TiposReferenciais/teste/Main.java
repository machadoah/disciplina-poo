package Aula02_TiposReferenciais.teste;

import Aula02_TiposReferenciais.UML.Usuario;

public class Main {

	public static void main(String[] args) {

		Usuario u = new Usuario();
		u.setLogin("admin");
		u.setSenha("1234");
		
		if(u.logar("admin", "1234")) {
			System.out.println("Usuario autenticado!");
		} else {
			System.out.println("Dados invalidos!");
		}
		
		System.out.println("Teste");
		
		System.out.println(u);
	}

}