import java.util.Scanner;

public class Exercicio4URI {

	public static void main(String[] args) {
		String n1, n2;
		int v1, v2;
		double valor1, valor2;
		
		Scanner ent = new Scanner(System.in);
		n1 = ent.next();
		v1 = ent.nextInt();
		valor1 = Double.parseDouble(ent.nextLine());
		n2 = ent.next();
		v2 = ent.nextInt();
		valor2 = Double.parseDouble(ent.nextLine());
		
		valor1 = v1 * valor1;
		valor2 = v2 * valor2;
		
		valor2 = valor2 + valor1;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor2);
		ent.close();
	}

}
