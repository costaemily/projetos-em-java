package logica;

import javax.swing.JOptionPane;

public class Inform {
	int idade;
	String nome, sexo;
	
	public void receber(){
		nome = JOptionPane.showInputDialog("Digite seu nome");
		idade = Integer.parseInt( JOptionPane.showInputDialog("Digite sua idade"));
		sexo = JOptionPane.showInputDialog("Digite seu sexo");
	}
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo);
	}
}
