package logicaAleatorio;

import javax.swing.JOptionPane;

public class AleaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nu = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes"));
		
		Aleato objAleat = new Aleato(nu);

	}

}
