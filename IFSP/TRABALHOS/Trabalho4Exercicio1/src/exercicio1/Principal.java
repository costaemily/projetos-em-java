package exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Scanner ent = new Scanner(System.in);
		System.out.println("Cadastre um funcion�rio:\nDigite o nome e o sal�rio em seguida.\nEx:\nNome do funcion�rio: Emily\nSal�rio do funcion�rio:\nR$ 1500,50");
		System.out.printf("\nNome do funcion�rio: ");
		f.nome = ent.next();
		System.out.printf("\nSal�rio do funcion�rio:\nR$ ");
		f.salario = ent.nextDouble();
		f.aumentarSalario();
		System.out.println(f.dadosFunc());
		ent.close();
	}

}
