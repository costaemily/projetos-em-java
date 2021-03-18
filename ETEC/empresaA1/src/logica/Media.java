package logica;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class Media {

	String nome;
	float salario,liquido1,liquido,bruto;
	int hora,dia;
	public void cadastroComMensagem() {
		nome = JOptionPane.showInputDialog("Digite seu nome");
		hora = Integer.parseInt( JOptionPane.showInputDialog("Digite Quantas Horas Voce Trabalha Por Dia"));
		salario = Float.parseFloat( JOptionPane.showInputDialog("Digite Seu Salario Por Hora"));
		dia = Integer.parseInt( JOptionPane.showInputDialog("Digite Ate que dia Vai o Mes"));
	}
		public void imprimirResultado() {
			JOptionPane.showMessageDialog(null, "Nome:" + nome);
			JOptionPane.showMessageDialog(null, "Seu Salario Diario Bruto E:R$" + salario * hora );
			bruto = (float) (salario * hora * dia );
			JOptionPane.showMessageDialog(null, "Seu Salario Mensal Bruto E:R$" + bruto);
			JOptionPane.showMessageDialog(null, "Seu Inss E De:R$" + bruto * 0.11);
			liquido1 = (float) (bruto * 0.11);
			liquido = (float) (bruto - liquido1);
			JOptionPane.showMessageDialog(null, "Seu Salario Mensal Liquido E:R$" + liquido);
	}
}
