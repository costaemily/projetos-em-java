import java.util.Scanner;

public class Principal {

	public static int[] ondeAMagicaAcontece(int A[]) {
		A = Metodos.trocarValores(A);
		return A;
	}
	public static void main(String[] args) {
		int[] vet = new int[5];
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 5 Valores Inteiros: ");
		vet = Metodos.receberDados(vet, ent);
		vet = ondeAMagicaAcontece(vet);
		Metodos.exibirVetor(vet);
	}

}
