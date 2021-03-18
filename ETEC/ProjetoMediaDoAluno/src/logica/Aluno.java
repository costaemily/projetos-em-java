package logica;

import javax.swing.JOptionPane;

public class Aluno {
	
	String nome;
	int n1, n2, n3, n4, media;
	
	public void dados() {
		nome = JOptionPane.showInputDialog("Digite seu nome");
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 1° nota"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 2° nota"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 3° nota"));
		n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 4° nota"));
	}
	
	public void conta() {
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("Nome: " + nome + 
							"\nMedia: " + media);
	}

}
