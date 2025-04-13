package br.com.serratec.heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		//Polimorfismo - pode substituir Gerente por Empregado, porem não
		//apresentará os campos do Gerente
		Gerente gerente = new Gerente("Joca", "J@gmail.com","2222",5500.,10);
		Diretor diretor = new Diretor("Bidu", "B@gmail.com","2422",9000.,"ADM");
		
		
		System.out.println(gerente.getNome()+"-"+gerente.getEmail());
		System.out.println(gerente.getNumEmpregadoGerenciado());
		gerente.aumentarSalario(10.);
		diretor.aumentarSalario(10.);
		System.out.println("Novo Salário: "+ gerente.getSalario());
		System.out.println("Novo Salário: "+ diretor.getSalario());
		
		System.out.println(gerente.toString());//não é preciso colocar o to string
		System.out.println(diretor);
		
	}

}
