import java.util.*;

public class Exercicio3URI {
	public static void main(String[] args) {
		String nome;
		double sF, tV;
		
		Scanner ent = new Scanner(System.in);
		nome = ent.nextLine();
		sF = Double.parseDouble(ent.nextLine());
		tV = Double.parseDouble(ent.nextLine());
		
		sF = sF + (0.15 * tV); 
		System.out.printf("TOTAL = R$ %.2f\n" , sF);
		ent.close();
	}
}
