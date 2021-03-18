package logica;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private String setor;
	private float salario;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getSetor() {
		return setor;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
