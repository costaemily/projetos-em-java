package logica;

import javax.swing.JOptionPane;

public class Vetores {
	//Vetores em C#
	// string[] nome = new string[10];
	
	//Vetor em Java
	String[] nome = new String[10];
	String nomeDois[] = new String[10];
	String cidade[] = {"Frnco da Rocha",  "Caieiras", "Morato", "Mairiporâ"};
	int[] idade = {10, 20, 30};
	int [] pessoas = new int[10];
	
	public void cad() {
		pessoas[0] = 10;
		pessoas[1] = 2;
		pessoas[2] = 3;
		pessoas[9] = 40;
	}
	public void cadVictor() {
		for (int i = 0; i < cidade.length; i++) {
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua cidade: "));
		}
	}
	public void imprime() {
		for (int i = 0; i < cidade.length; i++) {
			System.out.println(pessoas[i]);
		}
	}
	

}
