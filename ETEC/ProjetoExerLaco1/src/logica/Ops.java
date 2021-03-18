package logica;
import javax.swing.JOptionPane;
public class Ops {

	String nome;
	float des,sall,salli = 0, salb ;
	
	public void dados() {
		for(int i = 0;i < 10;i++) {
	  nome = JOptionPane.showInputDialog("Digite o seu nome");
	  salb = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario bruto"));
	  		if(salb <= 1500) {
	  		
	  			des = salb * 0.06f;
	  			sall = salb - des;
	  			JOptionPane.showMessageDialog(null, "Nome: " + nome +
	  												"\nSalario bruto: " + salb + 
	  												"\nSalario liquido: " + sall);
	  			salli = salli + sall;
	  		}else {
	  			
	  			des = salb * 0.095f;
	  			sall = salb - des;
	  			JOptionPane.showMessageDialog(null, "Nome: " + nome +
	  												"\nSalario bruto: " + salb + 
	  												"\nSalario liquido: " + sall);
	  			salli = salli + sall;
	  		}
	  	
		}
  		JOptionPane.showMessageDialog(null, "Salario liquido que a empresa gasta: " + salli);
	}

}
