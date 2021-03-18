package exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opc;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Escolha:\n1- Fornecedor;\n2- Empregado.\n");
		opc = ent.nextInt();
		switch (opc) {
		case 1:
			ent.nextLine();
			Fornecedor forn = new Fornecedor();
			System.out.println("Digite o Nome, Endere�o e Telefone do Fornecedor: \nObs: Pressione ENTER ap�s digitar cada item.\n");
			forn.setNome(ent.nextLine());
			forn.setEndereco(ent.nextLine());
			forn.setTelefone(ent.nextLine());
			System.out.println("Digite o valor de cr�diro:");
			forn.setValorCredito(ent.nextDouble());
			System.out.println("Digite o valor da d�vida:");
			forn.setValorDivida(ent.nextDouble());
			System.out.println("\nSaldo: R$" + forn.obterSaldo());
			break;
		case 2:
			ent.nextLine();
			Empregado emp = new Empregado();
			System.out.println("Digite o Nome, Endere�o e Telefone do Fornecedor: \nObs: Pressione ENTER ap�s digitar cada item.\n");
			emp.setNome(ent.nextLine());
			emp.setEndereco(ent.nextLine());
			emp.setTelefone(ent.nextLine());
			System.out.println("Digite o c�digo do setor:");
			emp.setCodigoSetor(ent.nextInt());
			System.out.println("Digite o sal�rio base:");
			emp.setSalarioBase(ent.nextDouble());
			System.out.println("Digite o imposto:");
			emp.setImposto(ent.nextDouble());
			System.out.println("\nSal�rio: R$" + emp.calcularImposto());
			break;
		default:
			break;
		}
		ent.close();
		  
	}
		
}
