
package logica;

import javax.swing.JOptionPane;
	
public class Semana {
	String diaE, diaA;
	int op;
	public void dias(){
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
		if (op == 2){
			diaE = ("Segunda - Feira");
		}
		else if (op == 3){
			diaE = ("Terça - Feira");
		}
		else if (op == 4){
			diaE = ("Quarta - Feira");
		}
		else if (op == 5){
			diaE = ("Quinta - Feira");
		}
		else if (op == 6){
			diaE = ("Sexta - Feira");
		}
		else if (op == 7){
			diaE = ("Sabado");
		}
		else if (op == 1){
			diaE = ("Domingo");
		}
		else{
			diaE = ("Dia inválido");
		}
	}
	public void aulas(){
		switch (op) {
		case 2:
			diaA = "DWI e JAVA";
			break;
		case 3:
			diaA = "PHP e JAVA";
			break;
		case 4:
			diaA = "EPI e GSII";
			break;
		case 5:
			diaA = "PTCC e DWI";
			break;
		case 6:
			diaA = "BDII e TOO";
			break;
		case 7:
			diaA = "Dia não letivo";
			break;
		case 1:
			diaA = "Dia não letivo";
			break;
		default:
			diaA = "Dia invalido";
			break;
		}
	}
	public void animais(){
		String ani = JOptionPane.showInputDialog("Digite a espécie do animal");
		if (ani.equals("cachorro")){
				System.out.println("Au! au!");}
	else if (ani.equals("gato")){
		System.out.println("Miau!");
	}
	}
	public void imprimi(){
		System.out.println("Dia da semana: " + diaE);
		System.out.println("Aulas do dia: " + diaA);
	}
}
