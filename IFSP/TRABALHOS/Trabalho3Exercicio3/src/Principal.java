import java.util.Scanner;

public class Principal {
	
	public static float somaValores(float vet[]) {
		float soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}
	public static void main(String[] args) {
		float soma;
		float[] vet = new float[20];
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite 20 Valores reais: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextFloat();
		}
		soma = somaValores(vet);
		System.out.println("Soma Dos Valores: " + soma);
		ent.close();
	}

}
