package exercicio4;

public class Quadrado {

	double lado, area, perimetro;
	
	public void calcularArea() {
		this.area = (this.lado * this.lado);
	}
	public void calcularPerimetro() {
		this.perimetro = (4 * this.lado);
	}
	public String imprimir() {
		return "Lado do Quadrado: \n" + this.lado + "\n�rea do Quadrado:\n" + this.area + "\nPer�metro do Quadrado:\n" + this.perimetro;
	}
}
