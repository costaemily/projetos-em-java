package logica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelasPrinci extends JFrame implements ActionListener, ItemListener{
	
	JRadioButton rdbSim, rdbNao;
	JButton btnClique;
	ButtonGroup radio;
	JRadioButton txtDados;
	
	public TelasPrinci() {
		
		txtDados = new JRadioButton("SIM");
		txtDados.setSize(70,20);
		txtDados.setLocation(50,20);
		
		
		rdbSim = new JRadioButton("SIM");
		rdbSim.setSize(70, 20);
		rdbSim.setLocation(50, 40);
		rdbSim.setBackground(new Color(217, 203, 150));
		//rdbSim.addItemListener(this);
		
		rdbNao = new JRadioButton("NAO");
		rdbNao.setSize(70, 20);
		rdbNao.setLocation(140, 40);
		rdbNao.setBackground(new Color(217, 203, 150));
		//rdbNao.addItemListener(this);
		
		radio = new ButtonGroup();
		radio.add(rdbSim);
		radio.add(rdbNao);
		
		btnClique = new JButton("Cadastrar");
		btnClique.setSize(100, 20);
		btnClique.setLocation(50, 70);
		btnClique.addActionListener(this);
		
		getContentPane().setLayout(null);
		
		getContentPane().add(rdbSim);
		getContentPane().add(rdbNao);
		getContentPane().add(btnClique);
		getContentPane().add(txtDados);
		
		//Titulo da janela
		setTitle("Teste de Telas");
		
		//Tamanho do formulario
		setSize(600, 450);
		
		//posicionar no meio da tela
		setLocationRelativeTo(this);
		
		//controlar e maximizar a tela
		setResizable(false);
		
		//colocar ou tirar a barra de titulo
		setUndecorated(false);
		
		//cores padrao
		
		//Cor Formada pelo RGB liberdade total
		getContentPane().setBackground(new Color(123, 100, 2));
	}
	
	public void itemStateChanged(ItemEvent radio) {
		
		if(radio.getSource() == rdbSim) {
			JOptionPane.showMessageDialog(null, "Sim");
		}else if(radio.getSource() == rdbNao) {
			JOptionPane.showMessageDialog(null, "Não");
		}
	}
	
	public void actionPerformed(ActionEvent btn) {
		
		if(btn.getSource() == btnClique) {
			JOptionPane.showMessageDialog(null, "Você Clicou no Botão");
			if(rdbSim.isSelected()) {
				JOptionPane.showMessageDialog(null, "sim");
			}else if(rdbNao.isSelected()) {
				JOptionPane.showMessageDialog(null, "não");
			}
		}
	}

}
