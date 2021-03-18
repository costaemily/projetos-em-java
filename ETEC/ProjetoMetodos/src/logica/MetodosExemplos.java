package logica;

import javax.swing.JOptionPane;

public class MetodosExemplos {
	
	public int num1, num2;
	
	public void recebeValores() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
	}
	
	public int soma(){
		return num1 + num2;
	}
	
	public int subtracao(){
		return num1 - num2;
	}
	
	public int multiplicacao(){
		return num1 * num2;
	}
	
	public int divisao(){
		return num1 / num2;
	}
	
	public void usaMetodo() {
		System.out.println("O resultado da soma é" + soma());
		System.out.println("O resultado da divisão é" + subtracao());
		System.out.println("O resultado da multiplicação é" + multiplicacao());
		System.out.println("O resultado da divisão é" + divisao());
	}

}
