package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Funcionario fun1 = new Funcionario();
		
		System.out.println("1º Funcionário:\n");
		
		System.out.println("Digite a idade: ");
		fun1.setIdade(entrada.nextInt());
		System.out.println("Digite a quantidade de anos em serviço: ");
		fun1.setAnosServico(entrada.nextInt());
		System.out.println("Digite o salário: ");
		fun1.setSalario(entrada.nextDouble());
		
		Funcionario fun2 = new Funcionario();
		
		System.out.println("\n2º Funcionário:\n");
		
		System.out.println("Digite a idade: ");
		fun2.setIdade(entrada.nextInt());
		System.out.println("Digite a quantidade de anos de serviço: ");
		fun2.setAnosServico(entrada.nextInt());
		System.out.println("Digite o salário: ");
		fun2.setSalario(entrada.nextDouble());
		
		System.out.println("1º Funcionário: ");
		System.out.println("\nIdade: " + fun1.getIdade() + "\nAnos em Serviço: " + fun1.getAnosServico() +
		"\nSalário: " + fun1.getSalario());
		
		if((fun1.avaliar()) == 1) {
			System.out.println("Pode se aposentar.");
		}else {
			System.out.println("Não pode se aposentar.");
		}
			
		System.out.println("\n2º Funcionário: ");
		System.out.println("\nIdade: " + fun2.getIdade() + "\nAnos em Serviço: " + fun2.getAnosServico() +
				"\nSalário: " + fun2.getSalario());
		
		if((fun2.avaliar()) == 1) {
			System.out.println("Pode se aposentar.");
		}else {
			System.out.println("Não pode se aposentar");
		}
		entrada.close();
	}

}
