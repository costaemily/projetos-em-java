import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] v1 = new int[10];
		int[] v2 = new int[10];
		int[] soma = new int[10];
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 10 Valores Inteiros Para O Primeiro Vetor: ");
		v1 = Metodos.receberDados(v1, ent);
		System.out.println("Digite 10 Valores Inteiros Para O Segundo Vetor: ");
		v2 = Metodos.receberDados(v2, ent);
		soma = Metodos.unsBangAqui(v1, v2);
		System.out.println("Vetor soma dos vetores: ");
		for (int i = 0; i < soma.length; i++) {
			System.out.printf("%d ", soma[i]);
		}
		ent.close();
	}
	
}
