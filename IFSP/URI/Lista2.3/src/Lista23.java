import java.util.Scanner;

public class Lista23 {

	public static void main(String[] args) {
		int n, i = 0, par = 0, imp = 0, neg = 0, pos = 0;
		Scanner ent = new Scanner(System.in);
		
		while(i < 5) {
			n = ent.nextInt();
			if(n % 2 == 0)
				par++;
			if(n % 2 != 0)
				imp++;
			if(n < 0)
				neg++;
			if(n > 0)
				pos++;
			i++;
		}
		System.out.printf("%d valor(es) par(es)\n", par);
		System.out.printf("%d valor(es) impar(es)\n", imp);
		System.out.printf("%d valor(es) positivo(s)\n", pos);
		System.out.printf("%d valor(es) negativo(s)\n", neg);
		ent.close();
	}
}
