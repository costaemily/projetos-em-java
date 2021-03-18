import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner ent = new Scanner(System.in);
		nota1 = ent.nextFloat();
		nota2 = ent.nextFloat();
		media = (nota1 + nota2) / 2;
			
		if(media >= 7.0 && media < 10.0)
			System.out.printf("Aprovado\n");
		else if(media < 7.0)
			System.out.printf("Reprovado\n");
		else
			System.out.printf("Aprovado com Distinção\n");
			
		ent.close();
	}
}
