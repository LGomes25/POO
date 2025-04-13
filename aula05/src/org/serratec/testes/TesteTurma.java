package org.serratec.testes;

import org.serratec.exemplo.PeriodoCurso;
import org.serratec.exemplo.Turma;


public class TesteTurma {

	public static void main(String[] args) {

		Turma turma = new Turma("Programador Full Stack", PeriodoCurso.TARDE);

		System.out.println("Curso: " + turma.getCurso());
		System.out.println("Dias: " + turma.getPeriodoCurso().getDias());
		System.out.println("Valor: " + turma.getPeriodoCurso().getValor());
		System.out.println("Carga Horária: " + turma.getPeriodoCurso().getCargaHoraria());

	}

}
