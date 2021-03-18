import java.util.Scanner;

public class Lista27 {

	public static void main(String[] args) {
		float media, idade = 1, soma = 0;;
		Scanner ent = new Scanner(System.in);
		idade = ent.nextFloat();
		int i = 0;
		while(idade >= 0) {
			soma += idade;
			i++;
			idade = ent.nextFloat();
		}
		media = soma / i;
		System.out.printf("%.2f\n" , media);
		ent.close();
	}

}
