package exercicio2;

public class Empregado {

	private String nome;
	private double salarioFixo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salarioFixo = salario;
	}
	
	public String imprimeDados() {
		return "\nNome: " + this.nome + "\nSalario: " + this.salarioFixo;
	}
	
	public double calculaSalario() {
		return salarioFixo;
	}
}
