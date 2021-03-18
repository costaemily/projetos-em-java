package logica;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class Carro {
	float velocidadem, tempo, distancia, litros;
	
	public void receber(){
		velocidadem = Float.parseFloat( JOptionPane.showInputDialog("Informe a Velocidade Média"));
		tempo = Float.parseFloat( JOptionPane.showInputDialog("Informe o Tempo da Viajem"));
	}
	public void calcular(){
		distancia = tempo * velocidadem;
		litros = distancia/12;
	}
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Distancia percorrida: "+distancia+"\nLitros gastos: "+litros);
		
	}
}
