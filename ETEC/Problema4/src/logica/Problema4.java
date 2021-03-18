package logica;

import javax.swing.JOptionPane;

public class Problema4 {
	int op, a;
	
	
	
	public void verifica(){
		switch (op) {
		case 1:
			JOptionPane.showConfirmDialog(null,"Janeiro com 30 dias");
			break;
		case 2:
			JOptionPane.showConfirmDialog(null,"Fevereiro com 28 dias");
			break;
		case 3:
			JOptionPane.showConfirmDialog(null,"Março com 31 dias ");
			break;
		case 4:
			JOptionPane.showConfirmDialog(null,"Abril com 30 dias");
			break;
		case 5:
			JOptionPane.showConfirmDialog(null,"Maio com 31 dias");
			break;
		case 6:
			JOptionPane.showConfirmDialog(null,"Junho com 30 dias" );
			break;
		case 7:
			JOptionPane.showConfirmDialog(null,"Julho com 31 dias");
			break;
		case 8 :
			JOptionPane.showConfirmDialog(null,"Agosto com 31 dias");
			break;
		case 9 :
			JOptionPane.showConfirmDialog(null,"Setembro com 30 dias");
			break;
		case 10:
			JOptionPane.showConfirmDialog(null,"Outubro com 31 dias");
			break;
		case 11:
			JOptionPane.showConfirmDialog(null,"Novembro com 30 dias");
			break;
		case 12 :
			JOptionPane.showConfirmDialog(null,"Dezembro com 31 dias");
			break;
			

		default:
			JOptionPane.showConfirmDialog(null,"Mês invalido ");
			break;
		}
	}
	public void pedir()
	{
		op = Integer.parseInt(JOptionPane.showInputDialog("Qual mês deseja analisar? \n1- Janeiro\n 2- Fevereiro\n 3-Março\n 4-Abril \n 5- Maio \n 6- Junho\n 7-Julho \n 8- Agosto \n 9-Setembro \n 10-Outubro \n 11-Novembro \n 12-Dezembro"));
	}
	
	public void menu()
	{
		pedir();
		verifica();
		verificaa();
		
		
		
	}
	public void verificaa(){
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Deseja Continuar? \n1-Sim \n 2-Não"));
	if(a == 1 )
	{
		menu();
	}
	else{
		
	}
	}

}
