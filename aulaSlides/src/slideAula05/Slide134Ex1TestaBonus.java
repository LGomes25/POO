package slideAula05;

public class Slide134Ex1TestaBonus {

	public static void main(String[] args) {
		
		Slide134Ex1Gerente gerente = new Slide134Ex1Gerente("Michelle",10000.,"Produção");
		Slide134Ex1Assistente assist = new Slide134Ex1Assistente("Leo",2000,0.02);
		
		gerente.aumentoSalario();
		assist.aumentoSalario();
		System.out.println(gerente.toString());
		System.out.println(assist.toString());
		
		
	}

}
