package logica;

public class Gerente extends Funcionario {
	
	int senha;
	int numeroDefuncionariosGerenciados;
	
	public Gerente(String nome, String cpf, double salario, int senha, int numFun){
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDefuncionariosGerenciados = numFun;
	}
	
	public double getBonificacao(){
		return this.salario * 0.15;
	}
	
	public boolean autentica(int senha){
		if (this.senha == senha) {
			System.out.println("Aceso Permitido!");
			return true;
		}else{
			System.out.print("Acesso Negado!");
			return false;
		}
	}

}
