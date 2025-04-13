package slideAula02;

public class Slide067Ex1 {

	public static void main(String[] args) {
		int par=0, impar=0;
		for (int i = 0; i <= 30; i++) {
			if (i%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("A Quantidade de pares é : "+par);
		System.out.println("A Quantidade de impares é : "+impar);
	}

}
