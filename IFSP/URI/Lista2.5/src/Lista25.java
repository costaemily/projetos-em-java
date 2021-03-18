import java.util.Scanner;

public class Lista25 {

	public static void main(String[] args) {
		int senha = 1;
		Scanner ent = new Scanner(System.in);
		while(senha != 2002) {
			senha = ent.nextInt();
			if(senha != 2002)
				System.out.printf("Senha Invalida\n");
			else
				System.out.printf("Acesso Permitido\n");
		}
		ent.close();
	}

}
