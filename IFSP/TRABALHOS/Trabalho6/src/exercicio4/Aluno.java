package exercicio4;

public class Aluno {

	private String matricula;
	private double nota1, nota2;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double calcularMedia() {
		return (getNota1() + getNota2()) / 2;
	}
	
	public String imprimirDados() {
		return "\n\nMatr�cula: " + getMatricula() + "\n1� Nota: " + getNota1() + "\n2� Nota: " + getNota2() +
		"\nM�dia: " + calcularMedia();
	}
}
