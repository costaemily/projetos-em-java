import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char turno;
		System.out.printf("Informe o turno no qual estuda:\n\nDigite:\nM - para Matutino;\nV - para Vespertino;\nN - para Noturno;\n");
		Scanner ent = new Scanner(System.in);
		turno = ent.next().charAt(0);
		switch (turno) {
		case 'M':
			System.out.println("Bom dia!");
			break;
		case 'V':
			System.out.println("Boa tarde!");
			break;
		case 'N':
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor Inválido!");
			break;
		}
		ent.close();
	}
}
