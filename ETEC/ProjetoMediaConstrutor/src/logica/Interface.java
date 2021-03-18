package logica;

import javax.swing.JOptionPane;

public class Interface {
	
	MediaConstrutor objCon;
	
	public void receberDados() {
		
	String nome = JOptionPane.showInputDialog("Digite seu nome: ");
	float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
	float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
	float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
	
	objCon = new MediaConstrutor(nome, n1, n2, n3);
	objCon.calculandoMedia();
	
	}
	public void exibirMedia() {
		JOptionPane.showMessageDialog(null, "Nome: " +  objCon.getNome() + "\nMédia : " + objCon.getCalcMedia() + "\nEstado: " + objCon.getEstado());
	}
}
