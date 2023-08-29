package Aula02_TiposReferenciais.Aula03;

public class Teste {
	private String texto;
	private Object obj;
	
	public Teste() {
		
	}
	
	public Teste(String texto) {
		this.texto = texto;
		
	}
	
	public Teste(NovoObjeto obj) {
		this.obj = obj;
		System.out.println(obj);
		obj.nome = "cetaf";
		
	}
	
	public Teste (int num) {
		System.out.println(num);
		num++;
	}
	
	
	public int quadrado (int intValue) {
		System.out.println("Quadrado chamado com " + "valor inteiro: "+ intValue);
		
		return intValue * intValue;
	}
	
	public double quadrado (double doubleValue) {
		System.out.println("Quadrado chamado com " + "valor inteiro: "+ doubleValue);
		
		return doubleValue * doubleValue;
	}
	
	public int quadrado (int intValue, boolean flag) {
		
		if(flag) return quadrado(intValue);
		
		return 0;
	}
}
