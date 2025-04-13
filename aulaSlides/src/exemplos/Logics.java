package exemplos;

public class Logics {

	public static void main(String[] args) {
		int a = 2; 
		int b = 5; 
		int c = 10; 
		boolean d = 2 == 20;
		if ((a > 5) && (c > b)) { 
			System.out.println(" && Somente primeira expressão avaliada caso falsa"); 
		}
		if ((b == 5) || (c == 0)) { 
			System.out.println("|| - Somente primeira expressão avaliada caso verdadeira"); 
		}
		if ((a > 5) & (c > b)) { 
			System.out.println("& As duas expressões são avaliadas sempre");
		}
		if ((b == 5) | (c == 0)) { 
			System.out.println(" | As duas expressões são avaliadas sempre"); 
		}
		System.out.println(d);
	}

}
