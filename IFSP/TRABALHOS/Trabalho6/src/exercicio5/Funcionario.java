package exercicio5;

public class Funcionario {

	private int idade, anosServico;
	private double salario;
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getAnosServico() {
		return anosServico;
	}
	
	public void setAnosServico(int anosServico) {
		this.anosServico = anosServico;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int avaliar() {
		if((getAnosServico() >= 35) && (getIdade() > 60)) {
			return 1;
		}else {
			return 0;
		}
	}
}
