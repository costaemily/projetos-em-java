package logicaMedia;

import javax.swing.JOptionPane;

public class InterfaceMedia {
	
	Media objMedia;

	public void recebeDados() {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3"));

		objMedia = new Media(nome, n1, n2, n3);

		objMedia.calculandoMedias();
		objMedia.analisaDados();
		
		imprimeMedia();
	}

	public void imprimeMedia() {
		JOptionPane.showMessageDialog(null, "Aluno " + objMedia.getResultado() 
		+ "\nNome " + objMedia.getNome() + "\n"
		+ "Media " + objMedia.getCalcMedia());
	}

}
