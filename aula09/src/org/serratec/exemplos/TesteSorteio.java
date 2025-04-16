package org.serratec.exemplos;

public class TesteSorteio {

	public static void main(String[] args) {

		Aluno al1 = new Aluno("Dans", 25);
		Aluno al2 = new Aluno("Moren", 35);
		Aluno al3 = new Aluno("Jó", 29);
		
		//inicia um novo objeto sorteio aluno
		Sorteio<Aluno> sort = new Sorteio<>();//Sorteia um numero
		
		sort.adicionar(al1);
		sort.adicionar(al2);
		sort.adicionar(al3);
		
		System.out.println(sort.sorteio());
		
		
		//inicia um novo objeto sorteio inteiros
		Sorteio<Integer> sortnum = new Sorteio<>();
		
		sortnum.adicionarVarios(1,2,3,4,0);
		
		System.out.println("Numero sorteado: "+ sortnum.sorteio());
		
		
		
		
		
	}

}
