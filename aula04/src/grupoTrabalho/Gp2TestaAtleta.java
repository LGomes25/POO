package grupoTrabalho;

public class Gp2TestaAtleta {

	public static void main(String[] args) {

		Gp2Pais pais1 = new Gp2Pais("Brasil");
		Gp2Pais pais2 = new Gp2Pais("EUA");
		
		Gp2Atleta atl1 = new Gp2Atleta("Anderson Silva", 98., pais1);
		Gp2Atleta atl2 = new Gp2Atleta("Jon Jone", 59., pais2);
		Gp2Atleta atl3 = new Gp2Atleta("Vitor Belfort", 110., pais1);
		
		System.out.println("O atleta "+atl1.getNome()+ "\t" + atl1.verificaSituacao());
		System.out.println("O atleta "+atl2.getNome()+ "\t" + atl2.verificaSituacao());
		System.out.println("O atleta "+atl3.getNome()+ "\t" + atl3.verificaSituacao());
				
		System.out.println("Total de Participntes: "+Gp2Atleta.getTotalParticipante());
		
	}

}
