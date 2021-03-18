package logica;

import javax.swing.JOptionPane;

public class Area {

	private float areaQ;
	private float areaT;
	private double areaC;
	private float lado;
	private float base;
	private float altura;
	private int escolha;
	private int escolheu;
	private double raioC;
	
	public int getEscolheu() {
		return escolheu;
	}
	public void setEscolheu(int escolheu) {
		this.escolheu = escolheu;
	}
	public int getEscolha() {
		return escolha;
	}
	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	public float getAreaQ() {
		return areaQ;
	}
	public void setAreaQ(float areaQ) {
		this.areaQ = areaQ;
	}
	public float getAreaT() {
		return areaT;
	}
	public void setAreaT(float areaT) {
		this.areaT = areaT;
	}
	public double getAreaC() {
		return areaC;
	}
	public void setAreaC(double areaC) {
		this.areaC = areaC;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public Area(int escolha){
		if(escolha == 1){
			opcoes();
		}
		else if(escolha == 2){
			System.exit(0);
		}
	}
	
	public void opcoes() {
		escolheu = Integer.parseInt(JOptionPane.showInputDialog("Qual forma geom�trica voc� deseja calcular?\n\n 1 - Quadrado\n 2 - Tri�ngulo\n 3 - Circulo\n4 - Sair"));
		if (escolheu == 1) {
			calcQ();
		}
		else if (escolheu == 2) {
			calcT();
		}
		else if(escolheu == 3) {
			calcC();
		}
		else if(escolheu == 4){
			System.exit(0);
		}
	}
	
	public void calcQ() {
		lado = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida do lado do quadrado"));
		
		areaQ = lado * lado;
		
		JOptionPane.showMessageDialog(null, "A �rea do quadrado � " + areaQ);
	}
	
	public void calcT() {
		base = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida da base do tri�ngulo"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do tri�ngulo"));
		
		areaT = (base * altura)/2;
		
		JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo � " + areaT);
	}
	
	public void calcC(){
		raioC = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo"));
		
		areaC = 3.14 * (raioC * raioC);
		
		JOptionPane.showMessageDialog(null, "A �rea do circulo � " + areaC);
	
	
}
	public double getRaioC() {
		return raioC;
	}
	public void setRaioC(double raioC) {
		this.raioC = raioC;
	}
}
