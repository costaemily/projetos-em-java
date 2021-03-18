package exercicio2;

public class Gerente extends Empregado{

	private double gratificacao;
	
	public Gerente(String nome, double sal, double grat) {
		super(nome, sal);
		this.gratificacao = grat;
	}
	
	public String imprimeDados() {
		return super.imprimeDados() + "\nGratificação: " + this.gratificacao;
	}
	
	public double calculaSalario() {
		setSalarioFixo(getSalarioFixo() + getGratificacao());
		return getSalarioFixo();
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
}
