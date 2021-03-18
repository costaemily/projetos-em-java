import java.util.Scanner;

public class Lista22 {

	public static void main(String[] args) {
		float soma = 0, n;
		Scanner ent = new Scanner(System.in);
		int i = 0, pos = 0;
		while(i < 6) {
			n = Float.parseFloat(ent.nextLine());
			if(n > 0) {
				soma += n;
				pos++;
			}
			i++;
		}
		soma = soma / pos;
		System.out.printf("%d valores positivos\n", pos);
		System.out.printf("%.1f\n", soma);
		ent.close();
	}

}
