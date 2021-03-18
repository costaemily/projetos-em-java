package exercicio3;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		Calculadora calc = new Calculadora();
		Scanner ent = new Scanner(System.in);
		int entrada = 0, opc;
		while(entrada != 5) {
			System.out.println("--Calculadora--\n\nDigite:\n\n1- Soma;\n2- Subtração;\n3- Multiplicação;\n"
					+ "4- Divisão;\n5- Sair.\n");
			entrada = ent.nextInt();
			switch (entrada) {
			case 1:
				System.out.println("Digite o primeiro valor:\n");
				calc.v1 = ent.nextFloat();
				System.out.println("Digite o segundo valor:\n");
				calc.v2 = ent.nextFloat();
				System.out.println("Pressione 0 para mostrar o resutado ou 1 para continuar: ");
				opc = ent.nextInt();
				if (opc == 0) {
					System.out.println("Soma: " + calc.soma());
				}
				
				break;
			case 2:
				System.out.println("Digite o primeiro valor:\n");
				calc.v1 = ent.nextFloat();
				System.out.println("Digite o segundo valor:\n");
				calc.v2 = ent.nextFloat();
				System.out.println("Pressione 0 para mostrar o resutado ou 1 para continuar: ");
				opc = ent.nextInt();
				if (opc == 0) {
					System.out.println("Subtração: " + calc.sub());
				}
				break;
			case 3:
				System.out.println("Digite o primeiro valor:\n");
				calc.v1 = ent.nextFloat();
				System.out.println("Digite o segundo valor:\n");
				calc.v2 = ent.nextFloat();
				System.out.println("Pressione 0 para mostrar o resutado ou 1 para continuar: ");
				opc = ent.nextInt();
				if (opc == 0) {
					System.out.println("Multiplicação: " + calc.mult());
				}
				break;
			case 4:
				System.out.println("Digite o primeiro valor:\n");
				calc.v1 = ent.nextFloat();
				System.out.println("Digite o segundo valor:\n");
				calc.v2 = ent.nextFloat();
				System.out.println("Pressione 0 para mostrar o resutado ou 1 para continuar: ");
				opc = ent.nextInt();
				if (opc == 0) {
					System.out.println("Divisão: " + calc.div());
				}
				break;
			case 5: 
				System.out.println("Saindo...");
				break;
			}
			System.out.println("Pressione Enter para continuar...");
			System.in.read();
		}
		ent.close();
	}

}
