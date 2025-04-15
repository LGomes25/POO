package org.serratec.exercicios;

public class TestaAtleta {

	public static void main(String[] args) {

		Time tm = new Time("Jabarra");
		
		Atleta a1 = new Atleta("Rossi", 1.98);
		Atleta a2 = new Atleta("Léo", 1.68);
		Atleta a3 = new Atleta("Junio", 1.97);
		
		tm.adicionarAtleta(a3);
		tm.adicionarAtleta(a2);
		tm.adicionarAtleta(a1);
		tm.adicionarAtleta(new Atleta("Juninho", 1.80));
		
		
		System.out.println(tm.getAtletas());
		
	}

}
