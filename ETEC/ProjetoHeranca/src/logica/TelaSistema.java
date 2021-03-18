package logica;

public class TelaSistema {
		
		public void func(){
			Funcionario objFun = new Funcionario("Emily", "42459227884", 2500);
			System.out.println(objFun.getBonificacao());
		}
		
		public void ger(){
			Gerente objGer = new Gerente("Eu", "42459227884", 4500, 2311, 23);
			System.out.println(objGer.getBonificacao());
		}

}
