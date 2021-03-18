import java.util.Scanner;

public class Lista21 {

	public static void main(String[] args) {
		float salario, soma = 0;
		Scanner ent = new Scanner(System.in);
		salario = Float.parseFloat(ent.nextLine());
		if(salario <= 2000.00) {
			System.out.printf("Isento\n");
		}else if((salario > 2000.00) && (salario <= 3000.00)) {
			salario -= 2000.00;
			salario = (float) (salario * 0.08);
			System.out.printf("R$ %.2f\n", salario);
		}else if((salario > 3000.00) && (salario <= 4500.00)) {
			salario -= 3000.00;
			soma = (float) (1000.00 * 0.08);
			salario = (float) (salario * 0.18);
			System.out.printf("R$ %.2f\n", salario + soma);
		}else {
			salario -= 4500.00;
			soma = (float) (1000.00 * 0.08);
			soma += (float) (1500.00 * 0.18);
			salario = (float) (salario * 0.28);
			System.out.printf("R$ %.2f\n", salario + soma);
		}
		ent.close();
	}

}
