package exercicio4;

public class ContaBancaria {

	private String cliente;
	private int numconta;
	private float saldo;
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNumconta() {
		return numconta;
	}
	
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String sacar(float saque) {
		if(getSaldo() - saque < 0) {
			return "\nValor Indisponível\n";
		}else {
			setSaldo(getSaldo() - saque);
			return "\nValor Sacado\n";
		}
	}
	
	public void depositar(float deposito) {
		setSaldo(getSaldo() + deposito);
	}
}
