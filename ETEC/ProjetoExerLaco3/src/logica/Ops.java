package logica;
import javax.swing.JOptionPane;
public class Ops {
		String mes;
		int dias, i = 0;
		float chuva,chuvaa = 0 , chuvam,chuvaf;
		
		public void dados() {
			mes = JOptionPane.showInputDialog("Digite o mes");
			dias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias tem"));
			do{
				chuva = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de chuva do dia"));
			chuvaa = chuvaa + chuva;
			i++;
			}while(i < dias);
			chuvam = chuvaa / dias;
			JOptionPane.showMessageDialog(null, "Chuva media do mes: " + chuvam);
		}
}
