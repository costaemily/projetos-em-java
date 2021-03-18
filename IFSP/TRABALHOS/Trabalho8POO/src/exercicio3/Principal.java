package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opc;
		Scanner ent = new  Scanner(System.in);
		
		System.out.println("Esolha:\n1- Gerente;\n2- Vendedor;\n3- Cliente.\n");
		opc = ent.nextInt();
		switch (opc) {
		case 1:
			ent.nextLine();
			Gerente ger = new Gerente();
			System.out.println("Digite o Nome, Idade, Sexo, Salário, Matrícula e Nome da Gerência: \nObs: Pressione ENTER após digitar cada item.\\n");
			ger.setNome(ent.nextLine());
			ger.setIdade(ent.nextInt());
			ent.nextLine();
			ger.setSexo(ent.nextLine());
			ger.setSalario(ent.nextDouble());
			ent.nextLine();
			ger.setMatricula(ent.nextLine());
			ger.setNomeGerencia(ent.nextLine());
			System.out.println("Gerente:\n" + ger.printDados());
			break;
		case 2:
			ent.nextLine();
			Vendedor ven = new Vendedor();
			System.out.println("Digite o Nome, Idade, Sexo, Salário, Matrícula, Valor das Vendas e Quantidade de Vendas: \nObs: Pressione ENTER após digitar cada item.\n");
			ven.setNome(ent.nextLine());
			ven.setIdade(ent.nextInt());
			ent.nextLine();
			ven.setSexo(ent.nextLine());
			ven.setSalario(ent.nextDouble());
			ven.setMatricula(ent.nextLine());
			ent.nextLine();
			ven.setValorVendas(ent.nextDouble());
			ven.setQntVendas(ent.nextInt());
			System.out.println("Vendedor:\n" + ven.printDados());
			break;
		case 3:
			ent.nextLine();
			Cliente cli = new Cliente();
			System.out.println("Digite o Nome, Idade, Sexo, Valor da Dívida e Ano do Nascimento: \nObs: Pressione ENTER após digitar cada item.\n");
			cli.setNome(ent.nextLine());
			cli.setIdade(ent.nextInt());
			ent.nextLine();
			cli.setSexo(ent.nextLine());
			cli.setValorDivida(ent.nextDouble());
			cli.setAnoNascim(ent.nextInt());
			System.out.println("Cliente:\n" + cli.printDados());
			break;
		default:
			break;
		}
		ent.close();

	}

}
