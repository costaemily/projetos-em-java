package logica;

import java.util.Random;

import javax.swing.JOptionPane;

public class Aleatoria {
	
	int[] sortear = new int[100];
	Random rdn = new Random();
	
	public Aleatoria(int opc) {
		if(opc == 1) {
			gerarNumeros();
		}else if(opc == 2) {
			System.exit(0);
		}
	}
	
	public void gerarNumeros() {
		for(int i = 0; i < 100; i++) {
			sortear[i] = rdn.nextInt(100);
		}
		for(int i = 0; i < 100; i++) {
			System.out.println(sortear[i]);
		}
	}

	public int[] getSortear() {
		return sortear;
	}

	public void setSortear(int[] sortear) {
		this.sortear = sortear;
	}

	public Random getRdn() {
		return rdn;
	}

	public void setRdn(Random rdn) {
		this.rdn = rdn;
	}
}
