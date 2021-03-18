package logica;

import javax.swing.JOptionPane;

public class Tela {
	
	funcionario objfun = new funcionario();
	
	public void cadastraFuncionario(){
		objfun.setNome(JOptionPane.showInputDialog("Digite Seu Nome"));
		objfun.setSetor(JOptionPane.showInputDialog("Digite Seu Setor"));
		objfun.setCargo(JOptionPane.showInputDialog("Digite Seu Cargo"));
		objfun.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Idade")));
		objfun.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite Seu Salario")));	
	}
	
	public void mostrarFuncionario(){
		System.out.println("Resultados");
		System.out.println("Nome - " + objfun.getNome());
		System.out.println("Setor - " + objfun.getSetor());
		System.out.println("Cargo - " + objfun.getCargo());
		System.out.println("Idade - " + objfun.getIdade());
		System.out.println("Salario - " + objfun.getSalario());
		
	}
	
	public void menuPrincipal(){
		int op = Integer.parseInt(JOptionPane.showInputDialog(
										"Bom Dia - Qual Opção Deseja Efetuar"
										+ "\n1- Cadastrar"
										+ "\n2- Mostrar"));
		switch (op) {
		case 1:
			cadastraFuncionario();
			break;
		case 2:
			mostrarFuncionario();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			break;
		}
	}
}
