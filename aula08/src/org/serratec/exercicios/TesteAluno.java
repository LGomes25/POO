package org.serratec.exercicios;

import java.util.Set;
import java.util.TreeSet;

public class TesteAluno {

	public static void main(String[] args) {

		//Set<Aluno> alunos = new HashSet<>();//Usa o equals para ordenação
		Set<Aluno> alunos = new TreeSet<>();//Usa o compare to para ordenação
		
		
		alunos.add(new Aluno("José", "j@gmail.com", 45));
		alunos.add(new Aluno("Bruno", "b@gmail.com", 67));
		alunos.add(new Aluno("Carlos", "c@gmail.com", 25));
		alunos.add(new Aluno("Debi", "d@gmail.com", 18));
		alunos.add(new Aluno("Debi", "d@gmail.com", 18));
		
		for (Aluno xxx : alunos) {
			System.out.println(xxx);
		}
		
	}

}
