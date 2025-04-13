package slideAula02;

public class Slide056Ex1 {//A classe deveria ser SituacaoAluno

	public static void main(String[] args) {
		double nota1=7.5;
		double nota2=6;
		
		if ((nota1+nota2)/2==10) {
			System.out.println("Aprovado Parabéns");
		}else if ((nota1+nota2)/2>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
	}

}
