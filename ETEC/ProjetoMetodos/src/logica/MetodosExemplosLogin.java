package logica;

import javax.swing.JOptionPane;

public class MetodosExemplosLogin {
	
	public void receberDados() {
		String usuario = JOptionPane.showInputDialog("Digite seu usuário");
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		
		if(verificarSenha(usuario, senha) == true) {
			JOptionPane.showMessageDialog(null, "Login Correto");
		}else {
			JOptionPane.showMessageDialog(null, "Login Incorreto");
		}
	}
	
	public boolean verificarSenha(String usu, String sen) {
		boolean verLogin = false;
		if(usu.equals("info") && sen.equals("tarde")) {
			verLogin = true;
		}
		return verLogin;
	}

}
