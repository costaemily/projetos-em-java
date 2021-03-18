package logica;

import javax.swing.JOptionPane;

public class Media {

	private String nome;
	private int n1;
	private int n2;
	private int n3;
	private int m;
	private int escolha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public Media(){
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja Executar O Programa (escolha o numero correspondente):\n 1 - sim 2 - não"));
		if(escolha == 1){
			calc();
		}
		else{
			System.exit(0);
		}
	}
	
	public void calc(){
		nome = JOptionPane.showInputDialog("Digite O Nome Do Aluno:");
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite A Primeira Nota Do Aluno"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite A Segunda Nota Do Aluno"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite A Terceira Nota Do Aluno"));
		
		m = (n1 + n2 + n3) / 3;
	}
	public void analisaNotas(){
		if(m < 5){
			JOptionPane.showMessageDialog(null,"A Media Do Aluno " + nome + " É: " + m + "\n" + "Retido: Media Abaixo Do Esperado");
		}
		else if(m >= 5 && m <= 7){
			JOptionPane.showMessageDialog(null,"A Media Do Aluno " + nome + " É: " + m + "\n" + "Recuperação: Ainda Não Atingiu O Esperado");
		}
		else{
			JOptionPane.showMessageDialog(null,"A Media Do Aluno " + nome + " É: " + m + "\n" + "Parabens Você é foda!!!");
		}
		
	}
	
	
	
	
}
