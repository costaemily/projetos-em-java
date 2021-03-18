package tela;

import java.awt.Color;

import javax.swing.JLabel;

public class TelaDois extends TelaInicial{
	
	JLabel lValor2, lValor3;
	
	public TelaDois() {
		setTitle("Tela dois.");
		
		lValor2 = new JLabel("Começando a Brincar com a tela - Uma Tela com Label - Oba!");
		lValor2.setSize(500, 20);
		lValor2.setLocation(10, 50);
		lValor2.setForeground(Color.white);
	
		lValor3 = new JLabel();
		lValor3.setText("Programação de Computadores");
		lValor3.setSize(200, 20);
		lValor3.setLocation(10, 70);
		lValor3.setForeground(Color.black);
		
		getContentPane().setLayout(null);
		
		getContentPane().add(lValor2);
		getContentPane().add(lValor3);
		
		//Cor formada pelo RGB liberdade total
		getContentPane().setBackground(new Color(10, 250, 157));
	}
}
