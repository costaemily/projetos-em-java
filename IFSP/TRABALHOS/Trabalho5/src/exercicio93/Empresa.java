package exercicio93;

public class Empresa {

	String nome, endereco, cidade, estado;
	double valorP;
	int qtdFun;
	
	public Empresa() {
		
	}
	public Empresa(String n, String end, String cid, String est, double vP, int qtdF) {
		this.nome = n;
		this.endereco = end;
		this.cidade = cid;
		this.estado = est;
		this.valorP = vP;
		this.qtdFun = qtdF;
	}
	public String print() {
		return "\nNome: " + this.nome + "\nEndereco: " + this.endereco + "\nCidade: " + this.cidade +
				"\nEstado: " + this.estado + "\nValor Patrimonial: " + this.valorP + "\nQuantidade de Funcionarios: " + this.qtdFun + "\n\n";
	}
}
