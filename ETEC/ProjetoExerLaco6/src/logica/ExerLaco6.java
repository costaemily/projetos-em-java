package logica;

import javax.swing.JOptionPane;

public class ExerLaco6 {
	
	String nome, sexo, numero;
	int idade = 0, masculino, feminino, sexoinvalido, quantidade, femininoI;
	float HT, SH, MediaMulheres, Salario = 0, SalarioM, MediaTodos, SalarioF, SalarioTodos, SalarioFI, SalarioMulheres, MediaMulheres30, QM;
	
	public void receber() {
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcion�rios: "));
	}
	public void receber1() {
		nome = JOptionPane.showInputDialog("Digite Seu Nome: ");
		numero = JOptionPane.showInputDialog("Digite Seu N�mero de Identifica��o: ");
		sexo = JOptionPane.showInputDialog("Digite Seu Sexo: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Idade: "));
		HT = Float.parseFloat(JOptionPane.showInputDialog("Digite A Qunatidade de Horas Trabalhadas: "));
		SH = Float.parseFloat(JOptionPane.showInputDialog("Digite Seu Sal�rio Hora: "));
	}
	public void salario() {
		Salario = HT * SH;
	}
	public void identificarSexo() {
		if(sexo.equals("masculino")) {
			masculino++;
			SalarioM = Salario;
		}else if(sexo.equals("feminino") && idade <= 30) {
			feminino++;
			SalarioF = Salario;
		}else if(sexo.equals("feminino") && idade > 30) {
			SalarioFI = Salario;
			femininoI++;
		}else {
			sexoinvalido++;
		}
	}
	public void mediaTodos() {
		SalarioTodos = SalarioM + SalarioF + SalarioFI;
		MediaTodos = SalarioTodos / quantidade;
	}
	public void mediaMulheres() {
		SalarioMulheres = SalarioF + SalarioFI;
		QM = feminino + femininoI;
		MediaMulheres = SalarioMulheres / QM;
	}
	public void mediaMulheres30() {
		MediaMulheres30 = SalarioF / feminino;
	}
	public void exibir() {
		JOptionPane.showMessageDialog(null,"N�mero: " + numero + "\nNome: " + nome + "\nIdade:" + idade +
											"\nSal�rio Hora: " + SH + "\nHoras Trabalhadas: " + HT + "\nSalario: " + Salario);
	}
	public void exibir1() {
		JOptionPane.showMessageDialog(null, "Quantidade De Homens: " + masculino + "\nM�dia Salarial de Todas as Mulheres: " + MediaMulheres +
				"\nM�dia Salarial Das Mulheres com Menos de 30 Anos: " + MediaMulheres30 + "\nM�dia Salarial de Todos os Funcion�rios: " + MediaTodos);
	}
	public void menu() {
		receber();
		for(int i = 0; i < quantidade; i++) {
		receber1();
		salario();
		identificarSexo();
		exibir();
		}
		mediaTodos();
		mediaMulheres();
		mediaMulheres30();
		exibir1();
	}
	
}
