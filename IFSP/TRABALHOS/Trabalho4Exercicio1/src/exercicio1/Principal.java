package exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Scanner ent = new Scanner(System.in);
		System.out.println("Cadastre um funcionário:\nDigite o nome e o salário em seguida.\nEx:\nNome do funcionário: Emily\nSalário do funcionário:\nR$ 1500,50");
		System.out.printf("\nNome do funcionário: ");
		f.nome = ent.next();
		System.out.printf("\nSalário do funcionário:\nR$ ");
		f.salario = ent.nextDouble();
		f.aumentarSalario();
		System.out.println(f.dadosFunc());
		ent.close();
	}

}
