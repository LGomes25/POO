package slideAula04;

import javax.swing.JOptionPane;

public class Slide118Ex1FuncionarioTeste {

	public static void main(String[] args) {
		
		Slide118Ex1Funcionario func1 = new Slide118Ex1Funcionario("Adrianoo",3000.);
		
		func1.calcularInss();
		func1.calcularValeTransporte();
		
		//System.out.println("Nome: "+func1.getNome()+"\nSalário: "+func1.getSalario()
		//		+"\nINSS: "+func1.getInss()+"\nVale Transporte: "+func1.getVale()
		//		+"\nSalário Líqido: "+(func1.getSalario()-func1.getInss()-func1.getVale()));
		
		JOptionPane.showMessageDialog(null, "Nome: "+func1.getNome()+"\nSalário: "+func1.getSalario()
				+"\nINSS: "+func1.getInss()+"\nVale Transporte: "+func1.getVale()
				+"\nSalário Líqido: "+(func1.getSalario()-func1.getInss()-func1.getVale()));
	}
}