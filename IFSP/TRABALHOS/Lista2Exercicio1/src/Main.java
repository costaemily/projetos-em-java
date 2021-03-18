import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int qtdNegativos = 0;
		float somaPositivos = 0; 
		float[] vet = new float[10];
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 10 números reais:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextFloat();
		}
		for (float f : vet) {
			if(f >= 0) {
				somaPositivos += f;
			}else {
				qtdNegativos++;
			}
		}
		System.out.println("\nQuantidade de Negativos: " + qtdNegativos);
		System.out.println("Soma dos Positivos: " + somaPositivos);
		ent.close();
	}

}
