package slideAula02;

public class Slide062Ex1 {

	public static void main(String[] args) {
			String timeFut = "Porco";
			String result = switch (timeFut) {
			case "Fla"->"Rio de Janeiro";
			case "Flu"->"Rio de Janeiro";
			case "Bota"->"Rio de Janeiro";
			case "Vasco"->"Rio de Janeiro";
			case "Porco"->"São Paulo";
			case "Bambi"->"São Paulo";
			case "Timão"->"São Paulo";
			case "Peixe"->"São Paulo";
			default -> "Time fora do eixo Rio/SP";
			};
			System.out.println(result);
	}

}
