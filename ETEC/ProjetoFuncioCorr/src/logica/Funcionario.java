package logica;

import javax.swing.JOptionPane;

public class Funcionario {
	
	String nome;
	float ht, slh, des, sb, sli, slb;
	
	public void recebendoDados() {
	
		nome = JOptionPane.showInputDialog("Digite seu nome");
	
		ht = Float.parseFloat(JOptionPane.showInputDialog("Digite as horas trabalhandas"));
		
		slh = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salario hora"));
		
	}
	
	public void calculos() {
		
		sb = ht * slh;
		
		des = sb * 0.11f;
		
		sli = sb - des;
	}
	
	public void bonus() {
		
		if ( ht < 100) {
			slb = sli * 1.02f;
			System.out.println("FAixa Bonus menor 100");
		}else if ( ht < 200) {
			slb = sli * 1.1f;
			System.out.println("FAixa Bonus 100");
		}else if ( ht < 300) {
			slb = sli * 1.2f;
			System.out.println("FAixa Bonus 200");
		}else {
			slb = sli * 1.3f;
			System.out.println("FAixa Bonus 300");
		}
	}
	
	public void imprime() {
		System.out.println("O Salário Bruto é " + sb);
		System.out.println(" O Salário Liquido é " + sli);
		System.out.println("O salario com Bonus " + slb);
		
	}


}
