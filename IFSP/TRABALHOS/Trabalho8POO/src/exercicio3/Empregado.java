package exercicio3;

public class Empregado extends Pessoa{

	private String matricula;
	private double salario;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double valorInss() {
		return getSalario() * 1.11;
	}
	
}
