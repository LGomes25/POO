package bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class FuncionarioDao {

	private Connection connection;
	
	public FuncionarioDao() {
		connection = new DadosConexao().getConnection();
		
	}
	
	public void inserir(Funcionarios empregado) {
		String sql = "insert into empregado(nome,profissao,salario) values(?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, empregado.getNome());
			stmt.setString(2, empregado.getProfissao());
			stmt.setDouble(3, empregado.getSalario());
			stmt.execute();
			System.out.println("Cadastrado com sucesso!");
			
		} catch (Exception e) {
			System.out.println("Empregado não Cadastrado!");
		}
	}
}
//SQL Shell - criação de tabela:
//CREATE TABLE empregado(id SERIAL PRIMARY KEY, nome VARCHAR(50), profissao VARCHAR(30), salario NUMERIC);
//SQL Shell - mostrar tabela:
//SELECT * FROM empregado;