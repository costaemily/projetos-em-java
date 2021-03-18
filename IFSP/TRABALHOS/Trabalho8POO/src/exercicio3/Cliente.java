package exercicio3;

public class Cliente extends Pessoa{

	private double valorDivida;
	private int anoNascim;
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public int getAnoNascim() {
		return anoNascim;
	}
	
	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}
	
	public String printDados() {
		return "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() + "\nAno Nascimento: " + getAnoNascim() + "\nValor Dívida: " + getValorDivida();
	}
}
