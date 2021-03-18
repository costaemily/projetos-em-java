package exercicio1;

public class Pessoa {

	private String nome, endereco, telefone;

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String ender, String tel) {
		this.nome = nome;
		this.endereco = ender;
		this.telefone = tel;
	}
	
	public Pessoa(String nome, String ender) {
		this.nome = nome;
		this.endereco = ender;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
