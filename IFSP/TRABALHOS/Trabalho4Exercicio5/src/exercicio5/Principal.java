package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double imc;
		Paciente p = new Paciente();
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite seu nome, peso e altura para calcular o IMC (Índice de Massa Corporal):\nEx:\n"
				+ "Digite seu nome: Emily\n"
				+ "Digite seu peso: 65,5\n"
				+ "Digite sua altura: 1,75\n");
		System.out.println("Digite seu nome: ");
		p.nome = ent.next();
		System.out.println("Digite seu peso: ");
		p.peso = ent.nextDouble();
		System.out.println("Digite sua altura: ");
		p.altura = ent.nextDouble();
		imc = p.calcularIMC();
		System.out.printf("\nSeu IMC é: %.2f", imc);
		System.out.println("\n" + p.classificarIMC(imc));
		System.out.println("\n" + p.imprimirDados());
		ent.close();
	}

}
