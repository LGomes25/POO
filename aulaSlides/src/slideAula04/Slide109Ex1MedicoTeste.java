package slideAula04;

public class Slide109Ex1MedicoTeste {

	public static void main(String[] args) {
		
		Slide109Ex1Medico cons1 = new Slide109Ex1Medico("12345","Ana Maria",0,250.0);
		Slide109Ex1Medico cons2 = new Slide109Ex1Medico("456789","Antonio J.",0,300.0);
		
		cons2.pagamentoPlano();
		cons1.pagamentoDinheiro();
		
		System.out.println("Médico: "+cons1.getNome()+"\tCRM: "+cons1.getCrm()
				+"\tSalário: "+cons1.getSalario()+"\tValor Consulta: "+cons1.getValorConsulta());
		System.out.println("Médico: "+cons2.getNome()+"\tCRM: "+cons2.getCrm()
				+"\tSalário: "+cons2.getSalario()+"\tValor Consulta: "+cons2.getValorConsulta());
		
		System.out.println("\nTotal de médicos: "+Slide109Ex1Medico.getTotalMedicos());
		
		
		
	}

}
