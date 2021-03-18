package logica;

import javax.swing.JOptionPane;

public class CadastraCidade {
	String[] cidade = new String[2];
	
	public void cadastro() {
		for (int i = 0; i < cidade.length; i++) {
			cidade[i] = JOptionPane.showInputDialog("Informe a Cidade: ");
		}
	}
	
	public void exibir() {
		for (int i = 0; i < cidade.length; i++) {
			JOptionPane.showMessageDialog(null, cidade[i]);
		}
	}
	public void exibirUmaVez() {
		String cidadeUma = " ";
		for (int i = 0; i < cidade.length; i++) {
			cidadeUma = cidadeUma + cidade[i] + " , ";
		}
		JOptionPane.showMessageDialog(null, cidadeUma);
	}
	
	public void menu() {
		cadastro();
		exibir();
		exibirUmaVez();
	}

}
