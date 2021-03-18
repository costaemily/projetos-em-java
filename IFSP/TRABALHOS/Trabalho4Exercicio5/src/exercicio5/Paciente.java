package exercicio5;

public class Paciente {

	String nome;
	double peso, altura;
	
	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}
	public String classificarIMC(double imc) {
		if(imc <= 18.5) {
			return "Abaixo do Peso.";
		}else if ((imc > 18.5) && (imc < 25)) {
			return "Peso ideal (parabéns).";
		}else if ((imc >= 25) && (imc < 30)) {
			return "Levemente acima do peso.";
		}else if ((imc >= 30) && (imc < 35)) {
			return "Obesidade grau 1.";
		}else if ((imc >= 35) && (imc < 40)) {
			return "Obesidade grau 2 (severa).";
		}else {
			return "Obesidade 3 (mórbida).";
		}
	}
	public String imprimirDados() {
		return "\nNome: " + this.nome + "\nPeso: " + this.peso + "\nAltura: " + this.altura;
	}
}
