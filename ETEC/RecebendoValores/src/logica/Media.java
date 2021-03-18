package logica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Media {
	String nome, endereco, cidade, estado;
	int idade;
	float salario;
	double altura;
	
	public void cadastro(){
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		nome = lerTeclado.nextLine();
		System.out.println("Digite o seu endereço");
	    endereco = lerTeclado.nextLine();
	    System.out.println("Digite sua cidade");
		cidade = lerTeclado.nextLine();
		System.out.println("Digite o seu estado");
		estado = lerTeclado.nextLine();
		System.out.println("Digite o sua idade");
		idade = Integer.parseInt(lerTeclado.nextLine());
		System.out.println("Digite o seu salario");
		salario = Float.parseFloat(lerTeclado.nextLine());
		System.out.println("Digite o sua altura");
		altura = Double.parseDouble(lerTeclado.nextLine());
	}
	public void cadastroComMensagem(){
		nome = JOptionPane.showInputDialog("Digite seu nome");
		endereco = JOptionPane.showInputDialog("Digite seu endereço");
		cidade = JOptionPane.showInputDialog("Digite sua cidade");
		estado = JOptionPane.showInputDialog("Digite seu estado");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
	}
	public void imprimir(){
		System.out.println("\n");
		System.out.println("--Confirme seus Dados--");
		System.out.println("Nome:" + nome);
		System.out.println("Endereço:" + endereco);
		System.out.println("Cidade:" + cidade);
		System.out.println("Estado:" + estado);
	}
	public void imprimirComMensagem(){
		JOptionPane.showMessageDialog(null, "--Confirme seus Dados--"+"\nNome: "+nome+
				"\nEndereço: "+endereco+
				"\nCidade: "+cidade+
				"\nEstado: "+estado+
				"\nIdade: "+idade+
				"\nSalário: "+salario+
				"\nAltura: "+altura);
		/*JOptionPane.showMessageDialog(null, "Nome: "+nome);
		JOptionPane.showMessageDialog(null, "Endereço: "+endereco);
		JOptionPane.showMessageDialog(null, "Cidade: "+cidade);
		JOptionPane.showMessageDialog(null, "Estado: "+estado);*/
	}
	
}
