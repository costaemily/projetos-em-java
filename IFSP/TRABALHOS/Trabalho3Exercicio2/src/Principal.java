import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] v = new int[3];
		int res;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite 3 Valores E Eu Lhe Mostrarei O Dobro Deles: ");
		for (int i = 0; i < v.length; i++) {
			v[i] = ent.nextInt();
			res = Dobro.vezezDois(v[i]);
			System.out.println("O dobro de "+ v[i] + " = " + res);
		}
		ent.close();
	}

}
