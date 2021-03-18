package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno alu1 = new Aluno();
		
		System.out.println("Digite a matrícula:");
		alu1.setMatricula(entrada.next());
		
		System.out.println("Digite a primera nota:");
		alu1.setNota1(entrada.nextDouble());
		
		System.out.println("Digite a segunda nota:");
		alu1.setNota2(entrada.nextDouble());
		
		System.out.println(alu1.imprimirDados());
		entrada.close();
	}

}
