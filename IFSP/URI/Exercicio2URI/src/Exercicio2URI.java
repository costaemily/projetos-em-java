import java.util.*;

public class Exercicio2URI {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int A, B, C, D;
		A = ent.nextInt();
		B = ent.nextInt();
		C = ent.nextInt();
		D = ent.nextInt();
		D = (A*B) - (C*D);
		System.out.println("DIFERENCA = " + D);
		ent.close();
	}
}
