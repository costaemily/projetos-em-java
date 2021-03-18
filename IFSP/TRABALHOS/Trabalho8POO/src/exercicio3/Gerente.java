package exercicio3;

public class Gerente extends Empregado{

	private String nomeGerencia;

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public String printDados() {
		return "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nMatrícula: " + getMatricula() + "\nNome Gerência: " + getNomeGerencia() + "\nValor INSS: " + valorInss();
	}
}
