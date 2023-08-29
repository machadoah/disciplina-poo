package Aula02_TiposReferenciais.Exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Fahrenheit {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Insira a temperatura em Celsius: ");
		double c = Double.parseDouble(nome);
		double fah = c * 1.8 + 32;
		
		DecimalFormat df = new DecimalFormat("###.00");
		String valorF = df.format(fah);
		
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("A temperatura ").append(nome).append("°C").append(" corresponde a: ").append(valorF).append("°F!");
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}