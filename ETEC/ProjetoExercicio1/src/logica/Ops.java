package logica;

import javax.swing.JOptionPane;

public class Ops {
	
	int n1, n2, res;
	
	public void dados() {
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
	}
	
	public void conta() {
		res = n1 + n2;
		System.out.println("A soma � = " + res);
		
		res = n1 - n2;
		System.out.println("A subtra��o � = " + res);
		
		res = n1 * n2;
		System.out.println("A multiplica��o � = " + res);
		
		res = n1 / n2;
		System.out.println("A divis�o � = " + res);
	}

}
