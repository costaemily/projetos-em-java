package tela;

import java.awt.Color;

import javax.swing.JFrame;

public class TelaInicial extends JFrame {
	
	public TelaInicial() {
		//Titulo da Janela
		setTitle("Primeira Tela Java");
		
		//Tamanho do Formulário
		setSize(600, 450);
		
		//Posicionar no meio da tela
		setLocationRelativeTo(this);
		
		//Controla o maximizar da tela
		setResizable(false);
		
		//Colocar ou tira a barra de titulo
		setUndecorated(false);
		
		//Cores padrão
		getContentPane().setBackground(Color.gray);
		
		//Cor formada pelo RGB liberdade total
		getContentPane().setBackground(new Color(23, 123, 18));
	}
}
