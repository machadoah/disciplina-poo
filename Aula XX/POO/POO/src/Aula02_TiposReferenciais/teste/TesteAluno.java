package Aula02_TiposReferenciais.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Aula02_TiposReferenciais.UML.Aluno;

class TesteAluno {

	Aluno aluno;

	@BeforeEach
	void instaciandoAluno() {
		aluno = new Aluno(123456, "ADS");
		aluno.setLogin("aluno@email.com");
		aluno.setSenha("123456");
	}

	@Test
	void testLogarSenha() {
		assertEquals("123456", aluno.getSenha());
	}

	@Test
	void testLogarUsuario() {
		assertEquals("aluno@email.com", aluno.getLogin());
	}

	@Test
	void testLogar() {
		assertEquals(true, aluno.logar(aluno.getLogin(), aluno.getSenha()));
	}

	@Test
	void testMatricula() {
		assertEquals(123456, aluno.getMatricula());
	}
	
	@Test
	void testCurso() {
		assertEquals("ads", aluno.getCurso().toLowerCase());
	}
	
	

}