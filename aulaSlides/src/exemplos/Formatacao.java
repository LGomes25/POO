package exemplos;

public class Formatacao {

	public static void main(String[] args) {
		
		String nome = "José";
		int idade = 45;
		double altura = 1.85;
		
		System.out.printf("%s tem %d anos e %.2f de altura.",nome, idade,altura);
	}
}
		/* Tipos de Formatação
		%c caracter simples (char)
		%d número decimal (inteiro) (base 10)
		%e número de ponto flutuante exponencial
		%f número de ponto flutuante
		%i inteiro (base 10)
		%s cadeia de caracteres
		%u número decimal (inteiro) sem sinal
		*/
