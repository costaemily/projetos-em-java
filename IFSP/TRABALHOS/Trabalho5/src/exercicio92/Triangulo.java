package exercicio92;

public class Triangulo {

	double base, altura;
	
	public Triangulo(double bas, double alt) {
		this.base = bas;
		this.altura = alt;
	}
	public double area() {
		return (this.base * this.altura) / 2;
	}
}
