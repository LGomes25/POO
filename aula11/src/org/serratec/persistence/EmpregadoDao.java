package org.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.serratec.conexao.ConnectionFactory;
import org.serratec.exemplos.Empregados;

public class EmpregadoDao {

	private Connection connection;
	
	public EmpregadoDao() {
		connection = new ConnectionFactory().getConnection();
		
	}

	public void inserir (Empregados empregado) {
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
	
	
	public static void main(String[] args) {
		
		EmpregadoDao dao = new EmpregadoDao();
		Empregados empregado = new Empregados(null, "leo", "eng", 9000.);
		dao.inserir(empregado);
		
	}
	
	
}
