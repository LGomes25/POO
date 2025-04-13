package grupoTrabalho;


public class Gp1TestaLivro {

	public static void main(String[] args) {
		
		Gp1Livro lvr1 = new Gp1Livro("Marco Anonio", "Cisco CCNA", 85.);
		Gp1Livro lvr2 = new Gp1Livro("Kathy Sierra", "Use a Cabeça Java", 98.);
		
		Gp1Operacao op1 = new Gp1Operacao("venda     ", lvr1);
		Gp1Operacao op2 = new Gp1Operacao("empréstimo", lvr2);
		
		lvr1.reajuste(0.06);
		
		op1.venderLivro();
		op2.emprestarLivro();
		
		System.out.println(op1.toString());
		System.out.println(op2.toString());
		
	}

}
