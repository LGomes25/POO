package slideAula05;

public class Slide135Ex1MaratonaTeste {

	public static void main(String[] args) {

		Slide135Ex1AtletaProfissional atl1 = new Slide135Ex1AtletaProfissional("João", "Masculino", 32, 1.75, 60.);
		Slide135Ex1AtletaProfissional atl2 = new Slide135Ex1AtletaProfissional("Casen", "Masculino", 20, 1.95, 70.);
		Slide135Ex1AtletaProfissional atl3 = new Slide135Ex1AtletaProfissional("Reckout", "Masculino", 16, 1.95, 58.);
		Slide135Ex1AtletaProfissional atl4 = new Slide135Ex1AtletaProfissional("Robertson", "Masculino", 16, 1.58, 58.);

		Slide135Ex1AtletaAmador amd1 = new Slide135Ex1AtletaAmador("Juliana", "Feminino", 20, 1.65, true);

		atl1.verificaStuacao();
		atl2.verificaStuacao();
		atl3.verificaStuacao();
		atl4.verificaStuacao();
		amd1.verificaStuacao();

		System.out.println(atl1.toString());
		System.out.println(atl2.toString());
		System.out.println(atl3.toString());
		System.out.println(atl4.toString());
		System.out.println(amd1.toString());

	}

}
