package exercicio94;

public class Aluno {

	String cod, nome;
	double nota1, nota2, media;
	
	public Aluno() {
		
	}
	public Aluno(String c, String n, double n1, double n2) {
		this.cod = c;
		this.nome = n;
		this.nota1 = n1;
		this.nota2 = n2;
	}
	public void media() {
		this.media = (this.nota1 + this.nota2) / 2;
	}
	public String verificar() {
		if(this.media >= 6)
			return "\nAprovado\n";
		else
			return "\nReprovado\n";
	}
	public String imprimir() {
		return "\nCodigo: " + this.cod + "\nNome: " + this.nome + "\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2 + "\nMedia: " + this.media + "\n\n";
				
	}
}
