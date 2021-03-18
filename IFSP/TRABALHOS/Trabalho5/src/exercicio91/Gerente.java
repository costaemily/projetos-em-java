package exercicio91;

public class Gerente {

	double salario;
	
	public Gerente(double sal) {
		this.salario = sal;
	}
	public void aumentoSalarial() {
		this.salario = this.salario * 1.1;
	}
	public void aumentoSalarial(double taxa) {
		this.salario = this.salario * taxa;
	}
}
