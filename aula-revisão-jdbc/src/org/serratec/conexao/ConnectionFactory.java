package org.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	//Baixar arquivo e adicionar a raiz d projeto, com o botão direito do mouse, selecionar add path
	//site para baixar arquivo: https://jdbc.postgresql.org/download/
	
	private String url = "jdbc:postgresql://localhost:5432/bancopoo";
	private String username = "postgres";
	private String password = "********";
	
	public Connection getConnection() {
		System.out.println("Fazendo a conexão....");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.err.println("Conexão não efetuada!");
			e.printStackTrace();
		}
		return connection;
	}
}
