import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float soma = 0, media;;
		float[] vet = new float[10];
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a altura de 10 atletas:");
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ent.nextFloat();
			soma += vet[i];
		}
		media = soma / vet.length;
		System.out.printf("\nMédia de Altura dos Atletas: %.2f.\n\n", media);
		System.out.println("Atletas que tem altura maior que a média: ");
		for (float f : vet) {
			if(f > media)
				System.out.printf("%.2f - ", f);
		}
		ent.close();
	}

}
