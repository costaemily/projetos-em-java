package logica;

import javax.swing.JOptionPane;

public class Vetor {
	//vetores em C#
	// string[] nome = new string[10];
	String[] nome = new String[10];
	String nomedois[] = new String[10];
	String cidade [] = {"Franco", "Caieiras", "Morato", "Mairiporã"};
	int[] idade = {10,20,30};
	int[] pessoas = new int[10];
	
	public void cad(){
		pessoas[0] = 10;
		pessoas[1] = 2;
		pessoas[2] = 3;
		pessoas[9] = 40;
	}
	public void cadVictor(){
		for (int i = 0; i < idade.length; i++) {
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Idade"));
		}
	}
	
	public void imprime(){
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i]);
		}
	}
}
