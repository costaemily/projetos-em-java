package exercicio4;

import java.util.Scanner;

public class ContasJava {

	public static void main(String[] args) {
		int opc, i = 0;
		float saque, taxa, desposito;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Escolha:\n1- Cadastro de conta Popança;\n2- Cadastro de Conta Especial.\n");
		opc = ent.nextInt();
		switch (opc) {
		case 1:
			i = 0;
			ContaPoupanca contP = new ContaPoupanca();
			ent.nextLine();
			System.out.println("Digite o nome do cliente:");
			contP.setCliente(ent.nextLine());
			System.out.println("Digite o número da conta:");
			contP.setNumconta(ent.nextInt());
			System.out.println("Digite o dia de rendimento:");
			contP.setDiaDeRendimento(ent.nextInt());
			contP.setSaldo(0);
			while(i != 5) {
				System.out.println("Digite:\n1- Sacar;\n2- Depositar;\n3- Mostar novo saldo com a taxa de rendimento;\n4- Mostar os dados;\n5- Sair.");
				i = ent.nextInt();
				switch (i) {
				case 1:
					System.out.println("Digite o valor que deseja sacar:");
					saque = ent.nextFloat();
					System.out.println(contP.sacar(saque));
					break;
				case 2:
					System.out.println("Digite o valor que deseja depositar:");
					desposito = ent.nextFloat();
					contP.depositar(desposito);
					break;
				case 3:
					System.out.println("Digite o valor da taxa de rendimento:");
					taxa = ent.nextFloat();
					contP.calcularNovoSaldo(taxa);
					System.out.println("\nSaldo: " + contP.getSaldo());
					break;
				case 4:
					System.out.println("\nNome: " + contP.getCliente() + "\nNúmero conta: " + contP.getNumconta() +
							"\nSaldo: " + contP.getSaldo() + "\nDia de Rendimento: " + contP.getDiaDeRendimento());
					break;
				default:
					break;
				}
			}
			break;
		case 2:
			i = 0;
			ContaEspecial contE = new ContaEspecial();
			ent.nextLine();
			System.out.println("Digite o nome do cliente:");
			contE.setCliente(ent.nextLine());
			System.out.println("Digite o número da conta:");
			contE.setNumconta(ent.nextInt());
			System.out.println("Digite o limite de saldo:");
			contE.setLimite(ent.nextFloat());
			contE.setSaldo(0);
			while(i != 4) {
				System.out.println("Digite:\n1- Sacar;\n2- Depositar;\n3- Mostar os dados;\n4- Sair.");
				i = ent.nextInt();
				switch (i) {
				case 1:
					System.out.println("Digite o valor que deseja sacar:");
					saque = ent.nextFloat();
					System.out.println(contE.sacar(saque));
					break;
				case 2:
					System.out.println("Digite o valor que deseja depositar:");
					desposito = ent.nextFloat();
					contE.depositar(desposito);
					break;
				case 3:
					System.out.println("\nNome: " + contE.getCliente() + "\nNúmero conta: " + contE.getNumconta() +
							"\nSaldo: " + contE.getSaldo());
					break;
				default:
					break;
				}
			}
			break;
		}
		ent.close();
	}
}
