package exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite os dados de um Ret�ngulo para ser calculado a �rea e per�meto:\nEx:\n"
				+ "Digite a medida da base: 2,25\nDigite a medida da altura: 3,5\n");
		System.out.println("Digite a medida da base: ");
		r.base = ent.nextDouble();
		System.out.println("Digite a medida da altura: ");
		r.altura = ent.nextDouble();
		System.out.println("\nA �rea desse Ret�ngulo � igual a: " + r.calculoArea());
		System.out.println("O per�meto desse Ret�ngulo � igual a: " + r.calculoPerimetro());
		System.out.println("\n" + r.valores());
		ent.close();
	}

}
