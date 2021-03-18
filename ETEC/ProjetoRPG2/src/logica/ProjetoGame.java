package logica;

import javax.swing.JOptionPane;

public class ProjetoGame {
	
	String[] golpes = new String[9];
	String[] nomes = new String[2];
	int[] totalpontos = new int[2];
	int[] posicoes = new int[10];
	int[] chance = new int[2];
	boolean ganhou = false;
	
	public void valorPosicoes() {
		golpes[0] = "Soco";
		golpes[1] = "Chute";
		golpes[2] = "Facada";
		golpes[3] = "Defesa Leve";
		golpes[4] = "Defesa Média";
		golpes[5] = "Defesa Pesada";
		golpes[6] = "Esquiva";
		golpes[7] = "Esquiva Agil";
		golpes[8] = "Esquiva Crítica";
		totalpontos[0] = 10;
		totalpontos[1] = 10;
	}
	
	public void cadastrar() {
		nomes[0] = JOptionPane.showInputDialog("Jogador 1.\nDigite O Nome Do Seu Personagem: ");
		nomes[1] = JOptionPane.showInputDialog("Jogador 2.\nDigite O Nome Do Seu Personagem: ");
	}
	public void jogar1() {
		chance[0] = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1.\nDigite Um Número Para Lutar.\n--- Ataque ---\n"
				+ "1- Soco.\n2- Chute.\n3- Facada.\n--- Defesa ---\n4- Defesa Leve.\n5- Defesa Média.\n6- Defesa Pesada\n"
				+ "--- Esquiva ---\n7- Esquiva.\n8- Esquiva Agil.\n9- Esquiva Crítica."));
	}
	public void chanceJogador1() {
		switch (chance[0]) {
		case 1:
			if (golpes[0] ==  "Soco") {
				JOptionPane.showMessageDialog(null, "Você golpeou o adversário com um soco, ele perde 3 pontos.");
				totalpontos[1] = totalpontos[1] - 3;
			}
			break;
		case 2:
			if (golpes[1] ==  "Chute") {
				JOptionPane.showMessageDialog(null, "Você golpeou o adversário com um chute, ele perde 4 pontos.");
				totalpontos[1] = totalpontos[1] - 4;
			}
			break;
		case 3:
			if (golpes[2] ==  "Facada") {
				JOptionPane.showMessageDialog(null, "Você golpeou o adversário com uma facada, ele perde 7 pontos.");
				totalpontos[1] = totalpontos[1] - 7;
			}
			break;
		case 4:
			if (golpes[3] ==  "Defesa Leve") {
				JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Defesa Leve, voce ganha 2 pontos.");
				totalpontos[0] = totalpontos[0] + 2;
			}
			break;
		case 5:
			if (golpes[4] ==  "Defesa Média") {
				JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Defesa Média, voce ganha 3 pontos.");
				totalpontos[0] = totalpontos[0] + 3;
			}
			break;
		case 6:
			if (golpes[5] ==  "Defesa Pesada") {
				JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Defesa Pesada, voce ganha 4 pontos.");
				totalpontos[0] = totalpontos[0] + 4;
			}
			break;
		case 7:
			if (golpes[6] ==  "Esquiva") {
				JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a esquiva, voce ganha 2 pontos.");
				totalpontos[0] = totalpontos[0] + 2;
			}
			break;
		case 8 :
			if (golpes[7] ==  "Esquiva Agil") {
				JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Esquiva Agil, voce ganha 3 pontos.");
				totalpontos[0] = totalpontos[0] + 3;
			}
			break;
		case 9 :
			if (golpes[8] ==  "Esquiva Crítica") {
				JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Esquiva Crítica, voce ganha 4 pontos.");
				totalpontos[0] = totalpontos[0] + 4;
			}
			break;
			
		default:
			JOptionPane.showConfirmDialog(null,"Opção Inválida ");
			break;
		}
	}
	public void jogar2() {
		chance[1] = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2.\nDigite Um Número Para Lutar.\n--- Ataque ---\n"
				+ "1- Soco.\n2- Chute.\n3- Facada.\n--- Defesa ---\n4- Defesa Leve.\n5- Defesa Média.\n6- Defesa Pesada\n"
				+ "--- Esquiva ---\n7- Esquiva.\n8- Esquiva Agil.\n9- Esquiva Crítica."));
	}
		public void chanceJogador2() {
			switch (chance[1]) {
			case 1:
				if (golpes[0] ==  "Soco") {
					JOptionPane.showMessageDialog(null, "Você golpeou o adversário com um soco, ele perde 3 pontos.");
					totalpontos[0] = totalpontos[0] - 3;
				}
				break;
			case 2:
				if (golpes[1] ==  "Chute") {
					JOptionPane.showMessageDialog(null, "Você golpeou o adversário com um chute, ele perde 4 pontos.");
					totalpontos[0] = totalpontos[0] - 4;
				}
				break;
			case 3:
				if (golpes[2] ==  "Facada") {
					JOptionPane.showMessageDialog(null, "Você golpeou o adversário com uma facada, ele perde 7 pontos.");
					totalpontos[0] = totalpontos[0] - 7;
				}
				break;
			case 4:
				if (golpes[3] ==  "Defesa Leve") {
					JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Defesa Leve, voce ganha 2 pontos.");
					totalpontos[1] = totalpontos[1] + 2;
				}
				break;
			case 5:
				if (golpes[4] ==  "Defesa Média") {
					JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Defesa Média, voce ganha 3 pontos.");
					totalpontos[1] = totalpontos[1] + 3;
				}
				break;
			case 6:
				if (golpes[5] ==  "Defesa Pesada") {
					JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Defesa Pesada, voce ganha 4 pontos.");
					totalpontos[1] = totalpontos[1] + 4;
				}
				break;
			case 7:
				if (golpes[6] ==  "Esquiva") {
					JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a esquiva, voce ganha 2 pontos.");
					totalpontos[1] = totalpontos[1] + 2;
				}
				break;
			case 8 :
				if (golpes[7] ==  "Esquiva Agil") {
					JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Esquiva Agil, voce ganha 3 pontos.");
					totalpontos[1] = totalpontos[1] + 3;
				}
				break;
			case 9 :
				if (golpes[8] ==  "Esquiva Crítica") {
					JOptionPane.showMessageDialog(null, "Você se defendeu dos golpes do adversário com a Esquiva Crítica, voce ganha 4 pontos.");
					totalpontos[1] = totalpontos[1] + 4;
				}
				break;
				
			default:
				JOptionPane.showConfirmDialog(null,"Opção Inválida ");
				break;
			}

	}
		public void verificar() {
			if (totalpontos[0] <= 0) {
				JOptionPane.showMessageDialog(null, "O Jogador 2:\n"+ nomes[1] + " é o Vencedor!");
				ganhou = true;
			}else if(totalpontos[1] <= 0){
				JOptionPane.showMessageDialog(null, "O Jogador 1:\n" + nomes[0] + " é o Vencedor!");
				ganhou = true;
			}
			controle();
			
		}
		
		public void controle() {
			if (ganhou == true) {
				
			}else {
				jogar1();
				chanceJogador1();
				jogar2();
				chanceJogador2();
				verificar();	
			}
		}
		public void menu() {
			valorPosicoes();
			cadastrar();
			verificar();
			
		}

}
