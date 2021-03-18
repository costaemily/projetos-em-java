package logica;
import javax.swing.JOptionPane;

	public class Ops {
		int contac = 0,conter = 0;
		String usuario, senha;
		boolean l;

		public void entrada() {
			for(int i = 0; i <5;i++){
			usuario = JOptionPane.showInputDialog("Digite o usuario");
			senha = JOptionPane.showInputDialog("Insira a senha");
		
			if ((usuario.equals("rramos.professor") && (senha.equals("seilaprofessor")))) {
				
				JOptionPane.showMessageDialog(null, "Bem vindo");
				contac = contac + 1;
			}else {
				JOptionPane.showMessageDialog(null, "Cai fora!");
				conter = conter + 1;
			}
	
			}
	}
				public void conta() {
					JOptionPane.showMessageDialog(null, "Acessos permitidos: " + contac + "\nAcessos negados: " + conter);
				}
}
