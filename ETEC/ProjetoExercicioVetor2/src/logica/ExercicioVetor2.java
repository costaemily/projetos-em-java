package logica;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExercicioVetor2 {
	
	int[] posicoes = new int[10];
	int[] acertos = new int[2];
	int[] chance = new int[1];
	Random rand = new Random();
	
	public void valorPosicoes() {
		for (int i = 0; i < posicoes.length; i++) {
			posicoes[i] = 0;
		}
	}
	public void sorteio() {
		for (int i = 0; i < 3; i++) {
			int val = rand.nextInt(10);
			posicoes[val] = 1;
		}
	}
	public void chance() {
		chance[0] = Integer.parseInt(JOptionPane.showInputDialog("Você terá 5 chances para acertar onde está o número 1\nDigite Um Número de 1 a 10: "));
	}
	public void verificar() {
		switch (chance[0]) {
		case 1:
			if (posicoes[0] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 2:
			if (posicoes[1] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 3:
			if (posicoes[2] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 4:
			if (posicoes[3] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 5:
			if (posicoes[4] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 6:
			if (posicoes[5] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 7:
			if (posicoes[6] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 8 :
			if (posicoes[7] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 9 :
			if (posicoes[8] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
		case 10:
			if (posicoes[9] == 1) {
				JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
				acertos[0]++;
			}else {
				JOptionPane.showMessageDialog(null, "Sinto Muito, Tente Novamente.");
			}
			break;
			
		default:
			JOptionPane.showConfirmDialog(null,"Opção Inválida ");
			break;
	}
	}
	public void verificarAcertos() {
		if (acertos[0] >= 2) {
			JOptionPane.showMessageDialog(null, "Parabéns, Você Ganhou!\nCom " + acertos[0] + "  Acertos.");
		}else {
			JOptionPane.showMessageDialog(null, "Que Pena, Você Perdeu\nSe Quiser Jogue Novamente ");
		}
	}
	public void menu() {
		valorPosicoes();
		sorteio();
		for (int i = 0; i < 5; i++) {
			chance();
			verificar();
		}
		verificarAcertos();
	}

}
