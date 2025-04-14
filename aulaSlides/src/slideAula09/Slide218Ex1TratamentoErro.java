package slideAula09;

public class Slide218Ex1TratamentoErro {

	public static void main(String[] args) {

		int[] cj1 = { 1, 2, 3, 4, 5 };
		int[] cj2 = { 3, 0, 2 };

		try {
			for (int i = 0; i < cj1.length; i++) {
				System.out.println((1 + i) + " - " + cj1[i] + " / " + cj2[i] + " = " + (cj1[i] / cj2[i]));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tentativa de cesso ao indexador inexistente");
		} catch (ArithmeticException e) {
			System.out.println("Divisão por zero não permitida");
		} finally {
			System.out.println("Programa Finalizado....");
		}

	}

}
