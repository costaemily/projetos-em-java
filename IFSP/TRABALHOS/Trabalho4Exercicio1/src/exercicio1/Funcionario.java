package exercicio1;

public class Funcionario {

	String nome;
	double salario;
	
	public void aumentarSalario() {
		if(this.salario <= 1500) {
			this.salario = this.salario * 1.25;
		}else if ((this.salario > 1500) && (this.salario <= 3000)) { 
			this.salario = this.salario * 1.20;
		}else if ((this.salario > 3000) && (this.salario <= 4500)) { 
			this.salario = this.salario * 1.15;
		}
	}
	public String dadosFunc() {
		return "\nNome do funcion�rio:" + this.nome + "\nSal�rio do funcion�rio\nR$: " + this.salario;
	}
}
