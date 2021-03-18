package tela;

import java.awt.Color;

import javax.swing.JLabel;

public class TelaSemana extends TelaInicial {
	
	JLabel lSegunda, lTerca, lQuarta, lQuinta, lSexta;
	
	public TelaSemana() {
		
		setTitle("Tela dois.");
		
		lSegunda = new JLabel("Segunda: Desenvolvimento de softwares e Programação de Computadores");
		lSegunda.setSize(500, 20);
		lSegunda.setLocation(10, 50);
		lSegunda.setForeground(Color.black);
	
		lTerca = new JLabel();
		lTerca.setText("Terça: Técnicas de Programação para Internet(II) e Programação de Computadores");
		lTerca.setSize(500, 20);
		lTerca.setLocation(10, 70);
		lTerca.setForeground(Color.black);
		
		lQuarta = new JLabel();
		lQuarta.setText("Quarta: Empreendedorismo e inovação e Gestão de sistemas");
		lQuarta.setSize(500, 20);
		lQuarta.setLocation(10, 90);
		lQuarta.setForeground(Color.black);
		
		lQuinta = new JLabel();
		lQuinta.setText("Quinta: Planejamento de Trabalho de Conclusão de Curso e Desenvolvimento de Softwares");
		lQuinta.setSize(500, 20);
		lQuinta.setLocation(10, 110);
		lQuinta.setForeground(Color.black);
		
		lSexta = new JLabel();
		lSexta.setText("Sexta: Banco de Dados e Técnicas de Orientação a Objetos");
		lSexta.setSize(500, 20);
		lSexta.setLocation(10, 130);
		lSexta.setForeground(Color.black);
		
		getContentPane().setLayout(null);
		
		getContentPane().add(lSegunda);
		getContentPane().add(lTerca);
		getContentPane().add(lQuarta);
		getContentPane().add(lQuinta);
		getContentPane().add(lSexta);
		
		//Cor formada pelo RGB liberdade total
		getContentPane().setBackground(new Color(10, 250, 157));
	}

}
