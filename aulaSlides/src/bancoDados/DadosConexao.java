package bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DadosConexao {

	private String url = "jdbc:postgresql://localhost:5432/bancopoo";
	private String user = "postgres";
	private String password = "xxxx";
	
	public Connection getConnection() {
		System.out.println("Fazendo a conexão...");
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão bem Sucedida!!!");
		} catch (SQLException e) {
			System.out.println("Conexão não efetuada!!!");
			e.printStackTrace();
		}
		return connection;
	}
}
