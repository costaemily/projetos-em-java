package logica;

import javax.swing.JOptionPane;

public class ExercicioVetor1 {
	
	String[] nome = new String[5];
	int[] votos = new int[5];
	int[] operacional = new int[2];
	
	
	public void receber() {
		for (int i = 0; i < nome.length; i++) {
		nome[i] = JOptionPane.showInputDialog("Digite O Nome Do " + (i + 1) + "º Candidato(a): " );
		}
	}
		public void exibirCandidatos() {
			operacional[0] = Integer.parseInt(JOptionPane.showInputDialog("Vote: \n1- Primeiro Candidato(a): " + nome[0] + "\n2- Segundo Candidato(a): " + nome[1] +
								"\n3- Terceiro Candidato(a): " + nome[2] + "\n4- Quarto Candidato(a): " + nome[3] + 
								"\n5- Quinto Candidato(a): " + nome[4]));
			
		}
		public void votar() {
			switch (operacional[0]) {
			case 1:
				JOptionPane.showConfirmDialog(null,"Voto apurado com sucesso, Você votou em: " + nome[0]);
				votos[0]++;
				break;
			case 2:
				JOptionPane.showConfirmDialog(null,"Voto apurado com sucesso, Você votou em: " + nome[1]);
				votos[1]++;
				break;
			case 3:
				JOptionPane.showConfirmDialog(null,"Voto apurado com sucesso, Você votou em: " + nome[2]);
				votos[2]++;
				break;
			case 4:
				JOptionPane.showConfirmDialog(null,"Voto apurado com sucesso, Você votou em: " + nome[3]);
				votos[3]++;
				break;
			case 5:
				JOptionPane.showConfirmDialog(null,"Voto apurado com sucesso, Você votou em: " + nome[4]);
				votos[4]++;
				break;
				
			default:
				JOptionPane.showInputDialog(null,"Candidato Inválido ");
				break;
			}
	}
		public void apuracaoVotos() {
			if (votos[0] > votos[1] && votos[0] > votos[2] && votos[0] > votos[3] && votos[0] > votos[4]) {
				JOptionPane.showMessageDialog(null, "O Vencedor é:  " + nome[0]);
			}else if(votos[1] > votos[0] && votos[1] > votos[2] && votos[1] > votos[3] && votos[1] > votos[4]){
				JOptionPane.showMessageDialog(null, "O Vencedor é:  " + nome[1]);
			}else if(votos[2] > votos[0] && votos[2] > votos[1] && votos[2] > votos[3] && votos[2] > votos[4]) {
				JOptionPane.showMessageDialog(null, "O Vencedor é:  " + nome[2]);
			}else if(votos[3] > votos[0] && votos[3] > votos[1] && votos[3] > votos[2] && votos[3] > votos[4]) {
				JOptionPane.showMessageDialog(null, "O Vencedor é:  " + nome[3]);
			}else if(votos[4] > votos[0] && votos[4] > votos[1] && votos[4] > votos[2] && votos[4] > votos[3]){
				JOptionPane.showMessageDialog(null, "O Vencedor é:  " + nome[4]);
			}
		}
		public void exibirVotos() {
			JOptionPane.showMessageDialog(null,"Total de Votos: " + "\n" + nome[0] + " - " + votos[0] + "\n" + nome[1] + " - " + votos[1] +
											"\n" + nome[2] + " - " + votos[2] + "\n" + nome[3] + " - " + votos[3] +
											"\n" + nome[4] + " - " + votos[4]);
		}
		public void menu() {
			receber();
		
			for (int i = 0; i < votos.length; i++) {	
			exibirCandidatos();
			votar();
			}
			apuracaoVotos();
			exibirVotos();
		}

}