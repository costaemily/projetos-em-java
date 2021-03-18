package logica;

import javax.swing.JOptionPane;

public class Ops {

	public void entrada() {
		String usuario = JOptionPane.showInputDialog("Digite o usuario");
		String senha = JOptionPane.showInputDialog("Insira a senha");
		
		if(verificarUsuario(usuario, senha) == true) {
			JOptionPane.showMessageDialog(null, "Bem vindo");
		}else {
			JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto");
		}
	}

	public boolean verificarUsuario(String usuario, String senha) {
		Boolean i = false;
		if ((usuario.equals("emily.costa") && (senha.equals("07865200")))) {
			i = true;
		} 
		return i;
	}
}
