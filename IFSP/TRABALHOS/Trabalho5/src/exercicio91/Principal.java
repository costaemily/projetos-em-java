package exercicio91;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o salario para o Gerente: ");
		Gerente g1 = new Gerente(ent.nextDouble());
		g1.aumentoSalarial();
		
		System.out.printf("\nSalario com taxa: %.2f\n", g1.salario);
		
		System.out.println("Digite a taxa desejada: ");
		g1.aumentoSalarial(ent.nextDouble());
		
		System.out.printf("\nSalario com taxa: %.2f\n", g1.salario);
		ent.close();
	}

}
