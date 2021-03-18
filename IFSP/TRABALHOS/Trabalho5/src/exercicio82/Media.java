package exercicio82;

public class Media {

	public double calcularMedia(double n1, double n2){
		return (n1 + n2) / 2;
	}
	public double calcularMedia(double n1, double n2, int p1, int p2) {
		return ((n1 * p1) + (n2 * p2)) / (p1 + p2);
	}
}
