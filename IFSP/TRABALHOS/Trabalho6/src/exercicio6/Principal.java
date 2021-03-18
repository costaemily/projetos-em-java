package exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Circulo cir = new Circulo();
		
		System.out.println("Digite o valor do raio:");
		cir.setRaio(entrada.nextDouble());
		
		cir.calcularArea();
		cir.calcularPerimetro();
		
		System.out.println(cir.imprimir());;
		entrada.close();
	}

}
