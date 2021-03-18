package logica;

import javax.swing.JOptionPane;

public class Ops {
		int limite;
		
		public void quantos() {
			limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limitador"));
		}
		
		public void mostrar() {
			for(int i = 1;i <= limite;i++) {
				JOptionPane.showMessageDialog(null, i);
			}
		}
}
