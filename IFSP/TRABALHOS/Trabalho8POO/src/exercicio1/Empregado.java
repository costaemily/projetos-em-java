package exercicio1;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private double salarioBase, imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularImposto() {
		return getSalarioBase() - getImposto();
	}
}
