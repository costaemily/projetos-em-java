import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nI = 1, qtd;
		double precoI, valorToral = 0;
		Scanner ent = new Scanner(System.in);
		do {
			System.out.println("Insira um item de venda:\n\nDigite:\n O N�mero do item;\n Pre�o Unit�rio do Item;\n E Quantidade.\n\nOu Digite 0 para Sair.\n");
			System.out.println("Digite o N�mero do Item:");
			nI = ent.nextInt();
			if(nI == 0)
				break;
			System.out.println("Digite o Pre�o Unit�rio do Item:");
			precoI = ent.nextDouble();
			System.out.println("Digite a Quantidade de Itens:");
			qtd = ent.nextInt();
			valorToral += precoI * qtd;
			System.out.println("\n");
		} while (nI != 0);
		System.out.printf("Valor Total da Venda: R$ %.2f." , valorToral);
		ent.close();
	}
}
