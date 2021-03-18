package logica;

import javax.swing.JOptionPane;

public class Graus {
	float grausF, grausC;
	
	public void dados() {
		grausF = Float.parseFloat(JOptionPane.showInputDialog("Digite os graus em Fahrenheit"));
		
		grausC = 5 * ( (grausF - 32) / 9 );
		
		JOptionPane.showMessageDialog(null, "Os graus em °C é: " + grausC);
	}

}
