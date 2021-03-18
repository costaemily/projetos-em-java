package exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome;
		double sF, grat;
		int opc;
		Scanner ent = new  Scanner(System.in);
		
		System.out.println("Escolha:\n1- Empregado;\n2- Gerente.\n");
		opc = ent.nextInt();
		switch (opc) {
		case 1:
			ent.nextLine();
			System.out.println("Digite o Nome e Salário Fixo do Empregado: \nObs: Pressione ENTER após digitar cada item.\n");
			nome = ent.nextLine();
			sF = ent.nextDouble();
			Empregado emp = new Empregado(nome, sF);
			emp.calculaSalario();
			System.out.println("\nEmpregado: \n" + emp.imprimeDados());
			break;
		case 2:
			ent.nextLine();
			System.out.println("Digite o Nome, Salário Fixo e Gratificação do Gerente: \nObs: Pressione ENTER após digitar cada item.\n");
			nome = ent.nextLine();
			sF = ent.nextDouble();
			grat = ent.nextDouble();
			Gerente ger = new Gerente(nome, sF, grat);
			ger.calculaSalario();
			System.out.println("\nGerente: \n" + ger.imprimeDados());
			break;
		default:
			break;
		}
		ent.close();

	}

}
