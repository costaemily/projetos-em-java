package logicaMedia;

import javax.swing.JOptionPane;

public class Media {

	private String nome;
	private String resultado;
	private float n1, n2, n3, calcMedia;

	// Construtor Default
	public Media() {

	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	// Construtor com parametros
	public Media(String nome, float n1, float n2, float n3) {
		this.setNome(nome);
		this.setN1(n1);
		this.setN2(n2);
		this.setN3(n3);
	}

	public void calculandoMedias() {
		setCalcMedia((getN1() + getN2() + getN3())/3);
	}
	
	public void analisaDados() {
		if (getCalcMedia() < 5) {
			setResultado("RETIDO");
		}else if (getCalcMedia() >=5 && getCalcMedia()<=7) {
			setResultado("RECUPERAÇÃO");
		}else {
			setResultado("APROVADA");
		}
			
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getN3() {
		return n3;
	}

	public void setN3(float n3) {
		this.n3 = n3;
	}

	public float getCalcMedia() {
		return calcMedia;
	}

	public void setCalcMedia(float calcMedia) {
		this.calcMedia = calcMedia;
	}

}
