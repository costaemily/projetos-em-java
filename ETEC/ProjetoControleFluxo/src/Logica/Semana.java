package Logica;

import javax.swing.JOptionPane;

public class Semana {
	
	String diaE, diaA;
	int op;
	
	public void dias() {
		 op = Integer.parseInt(JOptionPane.showInputDialog("" + "Digite um numero desejado"));
		
		if (op == 1) {
			diaE = ("Segunda - Feira");
		}else if (op == 2) {
			diaE = ("Terça - Feira");
		}else if (op == 3) {
			diaE = ("Quarta - Feira");
		}else if (op == 4) {
			diaE = ("Quinta - Feira");
		}else if (op == 5) {
			diaE = ("Sexta - Feira");
		}else if (op == 6) {
			diaE = ("Sabado");
		}else if (op == 7){
			diaE = ("Domingo");
		}else {
			diaE = ("Dia Invalido");
		}
	}
	
	public void imprime() {
		System.out.println("dia da semana: " + diaE);
		System.out.println("aulas do dia: " + diaA);
	}
	
	public void aulas(){
		switch (op) {
		case 1:
			diaA = "DWI e Java";
			break;
		case 2:
			diaA = "PHP e Java";
			break;
		case 3:
			diaA = "EPI e GSII";
			break;
		case 4:
			diaA = "PTCC e DWI ";
			break;
		case 5:
			diaA = "BDII e TOO";
			break;
		case 6:
			diaA = "Dia não letivo";
			break;
		case 7:
			diaA = "Dia não valido";
			break;
		default:
			diaA = "Dia invalido";
			break;
		}

		
	}
	public void animais() {
		String ani = JOptionPane.showInputDialog("Digite a espéci do seu animal");
		if (ani.equals("Cachorro")) {
			System.out.println("True");
		}else if (ani.equals("Gato")){
			System.out.println("Miau");
		}
	}
}
