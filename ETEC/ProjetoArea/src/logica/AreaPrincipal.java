package logica;

import javax.swing.JOptionPane;

public class AreaPrincipal {

	public static void main(String[] args) {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja executar o programa?\n 1 - Sim\n 2 - Não"));
		Area objArea = new Area(escolha);
	}

}
