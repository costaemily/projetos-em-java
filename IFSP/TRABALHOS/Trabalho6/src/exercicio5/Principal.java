package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Funcionario fun1 = new Funcionario();
		
		System.out.println("1� Funcion�rio:\n");
		
		System.out.println("Digite a idade: ");
		fun1.setIdade(entrada.nextInt());
		System.out.println("Digite a quantidade de anos em servi�o: ");
		fun1.setAnosServico(entrada.nextInt());
		System.out.println("Digite o sal�rio: ");
		fun1.setSalario(entrada.nextDouble());
		
		Funcionario fun2 = new Funcionario();
		
		System.out.println("\n2� Funcion�rio:\n");
		
		System.out.println("Digite a idade: ");
		fun2.setIdade(entrada.nextInt());
		System.out.println("Digite a quantidade de anos de servi�o: ");
		fun2.setAnosServico(entrada.nextInt());
		System.out.println("Digite o sal�rio: ");
		fun2.setSalario(entrada.nextDouble());
		
		System.out.println("1� Funcion�rio: ");
		System.out.println("\nIdade: " + fun1.getIdade() + "\nAnos em Servi�o: " + fun1.getAnosServico() +
		"\nSal�rio: " + fun1.getSalario());
		
		if((fun1.avaliar()) == 1) {
			System.out.println("Pode se aposentar.");
		}else {
			System.out.println("N�o pode se aposentar.");
		}
			
		System.out.println("\n2� Funcion�rio: ");
		System.out.println("\nIdade: " + fun2.getIdade() + "\nAnos em Servi�o: " + fun2.getAnosServico() +
				"\nSal�rio: " + fun2.getSalario());
		
		if((fun2.avaliar()) == 1) {
			System.out.println("Pode se aposentar.");
		}else {
			System.out.println("N�o pode se aposentar");
		}
		entrada.close();
	}

}
