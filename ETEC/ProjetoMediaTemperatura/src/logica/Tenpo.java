package logica;

import javax.swing.JOptionPane;

public class Tenpo {
	
	float n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, media;
	
	public void dados() {
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n5 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n6 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n7 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n8 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n9 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
		n10 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma temperatura"));
	}
	
	public void conta() {
		media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
		
		System.out.println("A media é:" + media);
	}

}
