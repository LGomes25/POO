package exceptionsAula6;

public class DivisaoZeroException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisaoZeroException(String message) {
		super(message);
	}

}

/*
 * Criar a classe e herdar de RunTimeException ou de Exception(mais generico).
 * Inserir contrutor from super. 
 * Deixar apenas o contrutor que retorna a * mensagem.
 * ->Excessões personalizadas só funcionam com o uso do throw ou do throws<-
 */
