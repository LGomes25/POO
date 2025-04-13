package slideAula02;

public class Slide057Ex2 {//A classe deveria ser CalculoInss

	public static void main(String[] args) {
		String nome = "José";
		double sal = 2000.0;
		if (sal<=1518) {
			System.out.println("Salário de "+nome+" é R$"+sal);
		}else if (sal<=2793.88) {
			System.out.println("Salário de "+nome+" é R$"+(sal-(sal*0.09)));
		}else if (sal<=4190.83) {
			System.out.println("Salário de "+nome+" é R$"+(sal-(sal*0.12)));
		}else if(sal<=8157.41){
			System.out.println("Salário de "+nome+" é R$"+(sal-(sal*0.14)));
		}
	}
}

