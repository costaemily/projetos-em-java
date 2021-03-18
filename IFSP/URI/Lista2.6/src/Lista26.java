import java.util.Scanner;

public class Lista26 {

	public static void main(String[] args) {
		int N;
		Scanner ent = new Scanner(System.in);
		N = ent.nextInt();
		int ter = 3, seg = ter - 1, prim = ter - 2; 
		for(int i = 0; i < N; i++) {
			System.out.printf("%d %d %d PUM\n", prim, seg, ter);
			ter += 4;
			seg = ter - 1;
			prim = ter - 2;
		}
		ent.close();
	}

}
