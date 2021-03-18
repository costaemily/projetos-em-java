package exercicio2;

public class Retangulo {

	double base, altura;
	
	public double calculoArea() {
		return this.altura * this.base;
	}
	public double calculoPerimetro() {
		return 2 * (this.altura + this.base);
	}
	public String valores() {
		return "Base do Retângulo: \n" + this.base + "\nAltura do Retângulo:\n" + this.altura;
	}
}
