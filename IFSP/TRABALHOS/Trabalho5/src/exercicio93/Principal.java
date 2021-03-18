package exercicio93;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, endereco, cidade, estado;
		double valorP;
		int qtdFun;
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o nome da empresa: ");
		nome = ent.nextLine();
		System.out.println("Digite o endereco da empresa: ");
		endereco= ent.nextLine();
		System.out.println("Digite a cidade da empresa: ");
		cidade = ent.nextLine();
		System.out.println("Digite o estado da empresa: ");
		estado = ent.nextLine();
		System.out.println("Digite o valor patrimonial da empresa: ");
		valorP = ent.nextDouble();
		System.out.println("Digite a quantidade de funcionários da empresa: ");
		qtdFun = ent.nextInt();
		
		Empresa e2 = new Empresa(nome, endereco, cidade, estado, valorP, qtdFun);
		
		Empresa e1 = new Empresa();
		e1.nome = "Gomas LTDA";
		e1.endereco = "Av. Central nº01";
		e1.cidade = "Centro";
		e1.estado = "SP";
		e1.valorP = 123000;
		e1.qtdFun = 50;
		
		if(e1.valorP > e2.valorP) {
			System.out.println(e1.print());
		}else {
			System.out.println(e2.print());
		}
		ent.close();
	}

}
