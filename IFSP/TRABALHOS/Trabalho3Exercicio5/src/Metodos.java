import java.util.Scanner;

public class Metodos {

	public static int[] receberDados(int v[], Scanner ent) {
		for (int i = 0; i < v.length; i++) {
			v[i] = ent.nextInt();
		}
		return v;
	}
	
	public static int[] trocarValores(int A[]) {
		for (int i = 0; i < A.length; i++) {
			if(A[i] < 0)
				A[i] = 0;
		}
		return A;
	}
	public static void exibirVetor(int A[]) {
		System.out.println("Vetor Final: ");
		for (int i : A) {
			System.out.printf("%d ", i);
		}
	}
	public static int[] unsBangAqui(int v1[], int v2[]) {
		int[] soma = new int[10];
		for (int i = 0; i < soma.length; i++) {
			soma[i] = v1[i] + v2[i];
		}
		return soma;
	}
}
