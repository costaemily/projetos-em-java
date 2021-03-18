package exercicio3;

public class Quadrado {

	private double ladoTam;

	public double getLadoTam() {
		return ladoTam;
	}

	public void setLadoTam(double ladoTam) {
		this.ladoTam = ladoTam;
	}
	
	public double calcularArea() {
		return (getLadoTam() * getLadoTam());
	}
}
