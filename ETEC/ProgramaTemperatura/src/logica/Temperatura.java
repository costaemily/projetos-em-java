package logica;

import java.util.Scanner;

public class Temperatura {
	float t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,result;
	
	public void receber(){
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Digite a 1� Temperatura");
		t1 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 2� Temperatura");
		t2 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 3� Temperatura");
		t3 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 4� Temperatura");
		t4 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 5� Temperatura");
		t5 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 6� Temperatura");
		t6 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 7� Temperatura");
		t7 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 8� Temperatura");
		t8 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 9� Temperatura");
		t9 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 10� Temperatura");
		t10 = Float.parseFloat( lerTeclado.nextLine());
	}
	public void calcular(){
		result = (t1+t2+t3+t4+t5+t6+t7+t8+t9+t10)/10;
	}
	public void imprimir(){
		System.out.println("A m�dia das temperaturas �: "+result);
	}

}
