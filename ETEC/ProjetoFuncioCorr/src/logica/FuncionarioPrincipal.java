package logica;



public class FuncionarioPrincipal {

	public static void main(String[] args) {
		Funcionario objFun = new Funcionario();
		objFun.recebendoDados();
		objFun.calculos();
		objFun.bonus();
		objFun.imprime();
	}

}
