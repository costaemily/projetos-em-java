package logica;

import javax.swing.JOptionPane;

public class AleatoriaPrincipal {

	public static void main(String[] args) {
		
		int opc = Integer.parseInt(JOptionPane.showInputDialog("1- Mostrar\n2- Sair"));
		Aleatoria  objAleatoria = new Aleatoria(opc);
		
	}

}
