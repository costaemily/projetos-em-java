package logica;

import javax.swing.JOptionPane;

public class CalcMedia {
	float n1,n2,n3,n4,media;
	String nome;
	
	public void receber(){
		nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1º nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2º nota"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3º nota"));
		n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 4º nota"));
	}
	public void calculo(){
		media = (n1+n2+n3+n4)/4;
	}
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "A média do aluno "+nome+" é: "+media);
	}

}
