package bancoDados;


public class TestFuncionarioDao {

	public static void main(String[] args) {

		FuncionarioDao dao = new FuncionarioDao();
		
		Funcionarios funcionario = new Funcionarios(null, "Leo", "Engenheiro", 9000.);
		Funcionarios funcionario1 = new Funcionarios(null, "Jó", "Técnico", 5000.);
		Funcionarios funcionario2 = new Funcionarios(null, "Kiko", "Auxiliar", 2000.);
		
		
		dao.inserir(funcionario);
		dao.inserir(funcionario1);
		dao.inserir(funcionario2);
		
	}

}
