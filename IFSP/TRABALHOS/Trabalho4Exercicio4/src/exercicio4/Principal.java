package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o lado de um Quadrado para ser calculado a �rea e per�meto:\nEx:\n"
				+ "Digite a medida do lado: 2,25\n");
		System.out.println("Digite a medida do lado: ");
		q.lado = ent.nextDouble();
		q.calcularArea();
		q.calcularPerimetro();
		System.out.println("\nA �rea desse Quadrado � igual a: " + q.area);
		System.out.println("O per�meto desse Quadrado � igual a: " + q.perimetro);
		System.out.println("\n" + q.imprimir());
		ent.close();

	}

}
