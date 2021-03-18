package logicaAleatorio;

import java.util.Iterator;
import java.util.Random;

public class Aleato {

	private int numeros;
	Random rdn = new Random();
	int[] numerosSorteados;

	// Construtor
	public Aleato(int numeros) {
		this.setNumeros(numeros);
		numerosSorteados  = new int[getNumeros()];
		geraNumeros();
		imprimir();
	}

	// GET
	public int getNumeros() {
		return numeros;
	}

	// SET
	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	// Metodo
	public void geraNumeros() {
		for (int i = 0; i < getNumeros(); i++) {
			numerosSorteados[i] = rdn.nextInt(1000);
		}
	}
	public void imprimir() {
		System.out.println("Imprimindo com For comum");
		for (int i = 0; i < numerosSorteados.length; i++) {
			System.out.println(numerosSorteados[i]);
		}
		
		System.out.println("Imprimindo com Foreach");
		for (int vetor : numerosSorteados) {
			System.out.println(vetor);
		}
	}
}
