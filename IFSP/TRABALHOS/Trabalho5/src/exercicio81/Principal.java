package exercicio81;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int v1, v2;
		Scanner ent = new Scanner(System.in);
		Potencia p = new Potencia();
		System.out.println("Digite dois valores para calculo das potências:");
		v1 = ent.nextInt();
		v2 = ent.nextInt();
		System.out.println(v1 + "^2 = " + p.potenc(v1));
		System.out.println(v2 + "^2 = " + p.potenc(v2));
		System.out.println(v1 + "^" + v2 + " = " + p.potenc(v1, v2));
		ent.close();
	}

}
