package exceptionsAula7;

public class Exceptions {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		int[] vetor = { 10, 20, 56, 90, 100 };
		String a = null;
		int c = 10;
		int d = 0;

		try {
			System.out.println(vetor[0]/d);//primeiro catch
			System.out.println(vetor[5]/c);//segundo catch
			System.out.println(a.equalsIgnoreCase("aula"));//terceiro catch
		} catch (ArithmeticException e) {
			System.out.println("divisão por zeros");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("acesso a index inexistente");
		} catch (NullPointerException e) {
			System.out.println("Comparação inadequada com variavel null");
		}

	}

}
