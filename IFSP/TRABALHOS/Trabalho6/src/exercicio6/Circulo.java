package exercicio6;

public class Circulo {

	private double raio, area, perimetro;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void calcularArea() {
		setArea(Math.PI * Math.pow(getRaio(), 2));
	}
	
	public void calcularPerimetro() {
		setPerimetro(2 * 3.141516 * getRaio());
	}
	
	public String imprimir() {
		return "\n\nRaio: " + getRaio() + "\n¡rea: " + Math.round(getArea()) + "\nPerimetro: " + Math.round(getPerimetro());
	}
}
