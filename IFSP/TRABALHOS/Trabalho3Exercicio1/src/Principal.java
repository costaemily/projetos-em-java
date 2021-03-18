import java.util.Scanner;

public class Principal {

	public static float calcularIMC(float peso, float alt) {
		return (peso / (alt * alt));
	}
	
	public static String status(float imc) {
		String s = "";
		if(imc < 20)
			s = "Magro";
		else if((imc >= 20) && (imc < 25))
			s = "Normal";
		else if((imc >= 25) && (imc < 30))
			s = "Acima do peso";
		else if((imc >= 30) && (imc < 35))
			s = "Obeso";
		else
			s = "Muito Obeso";
		
		return s;
	}
	public static void main(String[] args) {
		String status;
		float peso, altura, imc;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		peso = ent.nextFloat();
		System.out.println("Agora digite sua altura:");
		altura = ent.nextFloat();
		
		imc = calcularIMC(peso, altura);
		System.out.printf("\nIMC: %.2f\n", imc);
		status = status(imc);
		System.out.println(status);
		ent.close();

	}

}
