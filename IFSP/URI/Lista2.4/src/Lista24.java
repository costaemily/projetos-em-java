import java.util.Scanner;

public class Lista24 {

	public static void main(String[] args) {
		int N, res;
		Scanner ent = new Scanner(System.in);
		N = ent.nextInt();
		for(int i = 1; i <= 10; i++) {
			res = N * i;
			System.out.printf("%d x %d = %d\n", i, N, res);
		}
		ent.close();
	}

}
