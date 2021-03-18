package exercicio94;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String cod, n;
		double nota1, nota2;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o codigo do aluno: ");
		cod = ent.next();
		System.out.println("Digite o nome do aluno: ");
		n = ent.next();
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = ent.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = ent.nextDouble();
		
		Aluno a2 = new Aluno(cod, n, nota1, nota2);
		a2.media();
		
		Aluno a1 = new Aluno();
		a1.cod = "2";
		a1.nome = "Pedro";
		a1.nota1 = 8.7;
		a1.nota2 = 7;
		a1.media();
		
		if(a1.verificar() == "\nAprovado\n") {
			System.out.println(a1.imprimir());
		}
		if(a2.verificar() == "\nAprovado\n") {
			System.out.println(a2.imprimir());
		}
		ent.close();
	}

}
