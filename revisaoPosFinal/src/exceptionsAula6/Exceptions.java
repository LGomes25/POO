package exceptionsAula6;


public class Exceptions {

	public static void main(String[] args) {
		
		try {
			System.out.println("Resultado: "+ divisao(10,0));
		} catch (ArithmeticException e) {
			System.out.println("Valor divisor = 0 - não permitido");
			//e.printStackTrace();//apresenta a pilha do erro no console
		}
		
		
		
    }
	
	
	public static int divisao(int a, int b) throws ArithmeticException{
		
//		if(b==0) { //Lança comentário na tela 
//			throw new ArithmeticException("Valor divisor = 0 - não permitido");
//		}
//		return a/b;
		
		return a/b;
	
	
	
	
	}
	
	
}
