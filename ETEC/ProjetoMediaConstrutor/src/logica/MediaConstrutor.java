package logica;


public class MediaConstrutor {

	private String nome;
	private String estado;
	private float n1, n2, n3, calcmedia;
	
	//Construtor padrão (default)
	public MediaConstrutor() {
		
	}
	//Construtor com parametros
	public MediaConstrutor(String nome, float n1, float n2, float n3) {
		this.setNome(nome);
		this.setN1(n1);
		this.setN2(n2);
		this.setN3(n3);
	} 
	
	public void calculandoMedia() {
		setCalcMedia((getN1() + getN2() + getN3())/3);
		mediaCalculo();
	}
	public void mediaCalculo() {
		if(getCalcMedia() < 5) {
			setEstado("Reprovado.");
		}else if(getCalcMedia() >= 5 && getCalcMedia() <= 7) {
			setEstado("Recuperação");
		}else if(getCalcMedia() > 7 && getCalcMedia() <= 10) {
			setEstado("Aprovado!");
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
		return calcmedia;
	}
	public void setCalcMedia(float calcmedia) {
		this.calcmedia = calcmedia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getCalcmedia() {
		return calcmedia;
	}
	public void setCalcmedia(float calcmedia) {
		this.calcmedia = calcmedia;
	}

}
