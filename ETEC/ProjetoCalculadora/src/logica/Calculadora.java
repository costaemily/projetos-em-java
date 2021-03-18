package logica;

import javax.swing.JOptionPane;

public class Calculadora {
	float n1,n2, mult, div, sub, adc;
	
	public void receber(){
		n1 = Float.parseFloat( JOptionPane.showInputDialog("Digite o 1º valor"));
		n2 = Float.parseFloat( JOptionPane.showInputDialog("Digite o 2º valor"));
		
	}
	public void calculos(){
		adc = n1+n2;
		sub = n1-n2;
		div = n1/n2;
		mult = n1*n2;
		
	}
	public void imprimir(){
		JOptionPane.showMessageDialog(null, 
				"Resualtado da adição: "+adc
				+"\nResultado da subtração: "+sub+
				"\nResultado da divisão: "+div+
				"\nResultado da multiplicação: "+mult);
	}

}
