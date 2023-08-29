package Aula02_TiposReferenciais.UML;

public class Aluno extends Usuario {

	private int matricula;
	private String curso;

	public Aluno(int matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
	}

	public void martricularSe() {
		System.out.println("Matriculado!");
	}

	public void trancarMatricula() {
		System.out.println("Matricula trancada!");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
}
