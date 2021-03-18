import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] vet = new int[10];
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 10 números inteiros:");
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextInt();
		}
		Arrays.sort(vet);
		System.out.println("Vetor Ordenado: ");
		for (int i : vet) {
			System.out.printf("%d ", i);
		}
		ent.close();
	}

}
