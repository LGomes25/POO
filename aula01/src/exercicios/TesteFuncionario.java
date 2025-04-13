package exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Variavel de instancia
		Funcionario f1 = new Funcionario("Lola",5000);
		Funcionario f2 = new Funcionario("Ana",3000);
		Funcionario f3 = new Funcionario("Joca",1486);
		
		System.out.println(f1.getNome());
		System.out.println(f2.getNome());
		System.out.println(f3.getNome());
		System.out.println("Total Geral de funcionarios: " + Funcionario.getCont());
	
		
	
	}

}
