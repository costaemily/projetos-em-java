package logica;

import javax.swing.JOptionPane;

public class Ops {
	String nome;
	float n1,n2,n3,n4,n5,media,frequencia;
	
	public void dados() {
		nome = JOptionPane.showInputDialog("Digite seu nome");
		n1 =Float.parseFloat(JOptionPane.showInputDialog("Digite sua primeira nota"));
		n2 =Float.parseFloat(JOptionPane.showInputDialog("Digite sua segunda nota"));
		n3 =Float.parseFloat(JOptionPane.showInputDialog("Digite sua terceira nota"));
		n4 =Float.parseFloat(JOptionPane.showInputDialog("Digite sua quarta nota"));
		n5 =Float.parseFloat(JOptionPane.showInputDialog("Digite sua quinta nota"));
		frequencia = Float.parseFloat(JOptionPane.showInputDialog("Digite sua frequancia"));
	}
	
	public void imprimir() {
		media = (n1 + n2 + n3 + n4 + n5) / 5;
		if((media < 5) || (frequencia < 75)) {
			JOptionPane.showMessageDialog(null, "Nome: " + nome +
												"\nMedia: " + media +
												"\nFrequencia: " + frequencia +
												"\nAprovado: NÃO");
		}else if((media > 5 || media < 8) && (frequencia >= 75)) {
			JOptionPane.showMessageDialog(null, "Nome: " + nome +
												"\nMedia: " + media +
												"\nFrequencia: " + frequencia +
												"\nAprovado: RECUPERAÇÂO");
		}else if((media > 7 ) && (frequencia > 75)) {
			JOptionPane.showMessageDialog(null, "Nome: " + nome +
												"\nMedia: " + media +
												"\nFrequencia: " + frequencia +
												"\nAprovado: SIM");
		}
	}
}
