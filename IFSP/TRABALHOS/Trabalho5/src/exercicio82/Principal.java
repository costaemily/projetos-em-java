package exercicio82;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double v1, v2;
		int p1, p2;
		Scanner ent = new Scanner(System.in);
		Media m = new Media();
		
		System.out.println("Digite dois valores para calculo da média:");
		v1 = ent.nextDouble();
		v2 = ent.nextDouble();
		
		System.out.println("Digite os pesos para calculo da média:");
		p1 = ent.nextInt();
		p2 = ent.nextInt();
		
		System.out.printf("\nMedia Aritimética: %.2f",  m.calcularMedia(v1, v2));
		System.out.printf("\n\nMedia Ponderada: %.2f", m.calcularMedia(v1, v2, p1, p2));
		ent.close();
	}

}
