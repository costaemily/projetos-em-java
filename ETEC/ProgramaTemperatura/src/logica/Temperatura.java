package logica;

import java.util.Scanner;

public class Temperatura {
	float t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,result;
	
	public void receber(){
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Digite a 1º Temperatura");
		t1 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 2º Temperatura");
		t2 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 3º Temperatura");
		t3 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 4º Temperatura");
		t4 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 5º Temperatura");
		t5 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 6º Temperatura");
		t6 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 7º Temperatura");
		t7 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 8º Temperatura");
		t8 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 9º Temperatura");
		t9 = Float.parseFloat( lerTeclado.nextLine());
		System.out.println("Digite a 10º Temperatura");
		t10 = Float.parseFloat( lerTeclado.nextLine());
	}
	public void calcular(){
		result = (t1+t2+t3+t4+t5+t6+t7+t8+t9+t10)/10;
	}
	public void imprimir(){
		System.out.println("A média das temperaturas é: "+result);
	}

}
