package logica;

import javax.swing.JOptionPane;

public class Pessoa {
	String nome, idade, sexo;
	
	public void dados() {
		nome = JOptionPane.showInputDialog("Digite seu nome");
		idade = JOptionPane.showInputDialog("Digite sua idade");
		sexo = JOptionPane.showInputDialog("Digite seu sexo");
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
	}

}
