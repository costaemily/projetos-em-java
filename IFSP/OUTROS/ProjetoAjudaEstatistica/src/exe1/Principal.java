package exe1;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:");
		int tam = ent.nextInt();
		int[] vet = new int[tam];
		int soma = 0;
		float media;
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextInt();
			soma += vet[i];
		}
		media = (float) soma / vet.length;
		Arrays.sort(vet);
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%d ", vet[i]);
		}
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nMedia: %.2f ", media);
		ent.close();
	}

}
