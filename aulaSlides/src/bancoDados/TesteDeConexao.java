package bancoDados;

import java.sql.Connection;

public class TesteDeConexao {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Connection connection = new DadosConexao().getConnection();
		
	}
}
