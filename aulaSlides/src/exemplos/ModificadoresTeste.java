package exemplos;

public class ModificadoresTeste {

	public static void main(String[] args) {
		
		Modificadores p = new Modificadores();
		
		p.setNome("Souza");
		p.setPeso(70.);
		p.setAltura(1.68);
		
		if (p.getPeso()<=0 || p.getAltura()<=0) {
			System.out.println("Peso ou altura Inválidos!");
		}else {
			System.out.println(p.getNome()+" tem o IMC de "+String.format("%.3f", p.calcularImc()));
			System.out.println(p.getNome()+" está "+p.resultado());
		}
	}

}
