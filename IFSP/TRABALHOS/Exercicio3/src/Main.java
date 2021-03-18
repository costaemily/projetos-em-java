import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float soma = 0, peso, altura;
		int alturaEPeso = 0, idade;
		Scanner ent =  new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite a idade, peso e altura da " + i + "º pessoa:\nIdade:");
			idade = ent.nextInt();
			soma += idade;
			System.out.println("Peso:");
			peso = ent.nextFloat();
			System.out.println("Altura:");
			altura = ent.nextFloat();
			if((peso > 90.0) && (altura < 1.50)) {
				alturaEPeso++;
			}
			System.out.printf("\n");
		}
		soma = soma / 10;
		System.out.printf("Media das Idades: %.1f\n", soma);
		System.out.println("Quantidade de Pessoas com o Peso Superior a 90.0 Kg e Altura Inferior a 1.50 m: " + alturaEPeso);
		ent.close();
	}
}
