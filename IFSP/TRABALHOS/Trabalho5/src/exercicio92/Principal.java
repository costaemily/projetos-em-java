package exercicio92;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double alt, base;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite a base e altura de um triângulo qualquer: ");
		base = ent.nextDouble();
		alt = ent.nextDouble();
		
		Triangulo t = new Triangulo(base, alt);
		
		System.out.println("Área do triângulo: " + t.area());
		ent.close();
	}

}
