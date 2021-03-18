package exercicio4;

public class ContaPoupanca extends ContaBancaria{

	private int diaDeRendimento;

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public void calcularNovoSaldo(float taxaR) {
		setSaldo(getSaldo() + taxaR);
	}
	
}
