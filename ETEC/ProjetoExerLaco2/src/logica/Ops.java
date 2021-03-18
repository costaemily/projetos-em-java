package logica;
import javax.swing.JOptionPane;
public class Ops {
	String nome, nomef;
	float tempo,tempof = 0,tempom,tempoa;
	
	public void dados() {
		for(int i = 0;i < 10;i++) {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			tempo = Float.parseFloat(JOptionPane.showInputDialog("Digite seu tempo de trabalho(ANOS)"));
			tempoa = tempoa + tempo;
			if(tempo > tempof) {
				tempof = tempo;
				nomef = nome;
			}
		}
		tempom = tempoa / 10;
		JOptionPane.showMessageDialog(null, "Tempo medio de trabalho: " + tempom + "anos");
		JOptionPane.showMessageDialog(null, "Professor mais antigo: " + nomef);
	}
}
