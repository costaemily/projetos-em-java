package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o lado de um Quadrado para ser calculado a área e perímeto:\nEx:\n"
				+ "Digite a medida do lado: 2,25\n");
		System.out.println("Digite a medida do lado: ");
		q.lado = ent.nextDouble();
		q.calcularArea();
		q.calcularPerimetro();
		System.out.println("\nA área desse Quadrado é igual a: " + q.area);
		System.out.println("O perímeto desse Quadrado é igual a: " + q.perimetro);
		System.out.println("\n" + q.imprimir());
		ent.close();

	}

}
