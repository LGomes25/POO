package slideAula03;

import java.util.Scanner;

public class Slide089Ex1Pessoa {
	//Atributos
	public String nome;
	public Double peso;
	public Double altura;
	
	//Método para pegar dados
	public void preencherDados (Scanner sc) {
		System.out.println("Qual o seu nome?");
		this.nome = sc.next();
		System.out.println("Qual seu peso?");
		this.peso = sc.nextDouble();
		System.out.println("Qual sua altura?");
		this.altura = sc.nextDouble();
	}
	//Método para exibir dados
	public void exibirDados() {
		System.out.println("Nome: "+nome+"\tPeso: "+peso+"Kg\tAltura: "+altura+"m.");
	}
	
}
