package exercicio4;

public class ContaEspecial extends ContaBancaria{

	private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public String sacar(float saque) {
		if(getSaldo() - saque < limite) {
			return "\nValor Indisponível\n";
		}else {
			setSaldo(getSaldo() - saque);
			return "\nValor Sacado\n";
		}
	}
}
