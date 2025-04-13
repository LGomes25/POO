package org.serratec.testes;

import java.util.Scanner;

import org.serratec.aula.Aluno;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno[] alunos = new Aluno[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do Aluno: ");
			String nome = sc.next();
			System.out.println("Digite a idade do Aluno: ");
			Integer idade = sc.nextInt();
			System.out.println("Digite o email do Aluno: ");
			String email = sc.next();
			System.out.println("Aluno Cadastrado co sucesso ");
			alunos[i] = new Aluno(nome, idade, email);
			
		}sc.close();
		
		for (Aluno xx : alunos) {
			System.out.println(xx);
		}
		
	}

}
