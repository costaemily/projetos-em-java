import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		boolean encontrado = false;
		int numQ;
		int[] vet = new int[15];
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 15 números inteiros:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextInt();
		}
		Arrays.sort(vet);
		System.out.println("Vetor Ordenado: ");
		for (int i : vet) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n\nAgora Digite O Elemento Que Gostaria de Buscar: ");
		numQ = ent.nextInt();
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] == numQ) {
				encontrado = true;
				System.out.println("Elemento Encontrado Na Posição: " + i);
			}	
		}
		if(encontrado == false)
			System.out.println("Elemento não encontrado." );
		
		ent.close();
	}

}
