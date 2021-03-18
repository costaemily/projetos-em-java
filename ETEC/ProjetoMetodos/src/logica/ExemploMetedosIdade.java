package logica;

import javax.swing.JOptionPane;

public class ExemploMetedosIdade {
	
	public void receberIdade() {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		System.out.println("Resultado = " + verfiIdade(idade));
	}
	public String verfiIdade(int idade) {
		String mensagem = "Liberado";
		
		if(idade < 18) {
			mensagem = "Proibido";
		}
		return mensagem;
	}
}