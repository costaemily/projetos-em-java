package logica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Media {
	
	String nome, endereco, cidade, estado;
	int idade;
	float salario;
	double altura;
	
	public void cadastro() {
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		nome = lerTeclado.nextLine();
		
		System.out.println("Digite o seu emdere�o");
		endereco = lerTeclado.nextLine();
		
		System.out.println("Digite a sua cidade");
		cidade = lerTeclado.nextLine();
		
		System.out.println("Digite o seu estado");
		estado = lerTeclado.nextLine();
		
		System.out.println("Digite  sua idade");
		idade = Integer.parseInt( lerTeclado.nextLine());
		
		System.out.println("Digite  seu salario");
		salario = Float.parseFloat( lerTeclado.nextLine());
		
		System.out.println("Digite  sua altura");
		altura = Double.parseDouble( lerTeclado.nextLine());
	}
	public void cadastroComMensagem() {
		nome = JOptionPane.showInputDialog("Digite seu nome");
		endereco = JOptionPane.showInputDialog("Digite seu endere�o");
		cidade = JOptionPane.showInputDialog("Digite sua cidade");
		estado = JOptionPane.showInputDialog("Digite seu estado");
		idade = Integer.parseInt( JOptionPane.showInputDialog("Digite sua idade"));
		salario = Float.parseFloat( JOptionPane.showInputDialog("Digite seu salario"));
		
		
	}
	
	public void imprimir() {
		System.out.println("O nome digitado � " + nome);
		System.out.println("O endere�o digitado � " + endereco);
		System.out.println("A cidade digitada � " + cidade);
		System.out.println("O estado digitado � " + estado);
	}
	
	public void imprimirMensagem() {
//		JOptionPane.showMessageDialog(null, "Nome:" + nome);
//		JOptionPane.showMessageDialog(null, "Edere�o:" + endereco);
//		JOptionPane.showMessageDialog(null, "Cidade:" + cidade);
//		JOptionPane.showMessageDialog(null, "Estado" + estado);
		
		JOptionPane.showMessageDialog(null, "Nome" + nome +
											"\nEndere�o" + endereco + 
											"\nCidade" + cidade + 
											"\nEstado" + estado + 
											"\nIdade" + idade + 
											"\nSalario" + salario);
	}
		
	

}
