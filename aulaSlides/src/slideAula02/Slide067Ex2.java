package slideAula02;

public class Slide067Ex2 {

	public static void main(String[] args) {
		int cont=0;
		for (int i = 1; i <=22; i++) {
			if (i%2==0) {
				System.out.println("Java");
				cont++;
			}
		}
		System.out.println("Total de multiplos de 2: "+cont);
	}

}
