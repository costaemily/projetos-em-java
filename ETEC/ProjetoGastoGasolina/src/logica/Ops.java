package logica;

import javax.swing.JOptionPane;

public class Ops {
	int dia;
	float tempo, distancia, litros, velocidade, preco, precoF;

	public void dados() {
		tempo = Float.parseFloat(
				JOptionPane.showInputDialog("Digite quanto tempo voc� demora para chegar ao seu destino (em horas) "));
		velocidade = Float.parseFloat(JOptionPane.showInputDialog("Em qual velocidade?"));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Quantos dia por mes voc� vai a este local"));
	}

	public void contas() {
		distancia = tempo * velocidade;
		litros = distancia / 12;
		preco = litros * 3.60f;
		precoF = dia * preco * 2;
		JOptionPane.showMessageDialog(null,
				"Voc� gastara " + litros + " litros de gasolina ate seu destino e gastara em torno de " + preco + "R$");
		JOptionPane.showMessageDialog(null, "Voc� gasta por mes: " + precoF + "R$");
	}

} 