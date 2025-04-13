package exemplos;

public class Ternario {

	public static void main(String[] args) {
			int qtdDiasmes = 29;
			
			if (qtdDiasmes<30) {
				System.out.println("Este mês é fevereiro");
			}else {
				System.out.println("Não é Fevereiro");
			}
			
			//Ternário
			String a = qtdDiasmes<30 ? "Este mês é fevereiro":"Não é Fevereiro";
			System.out.println(a);
	}

}
