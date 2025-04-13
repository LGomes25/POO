package slideAula03;

import javax.swing.JOptionPane;

public class Slide090Ex3 {

	public static void main(String[] args) {
		String nome, telefone, email;
		Double salario;
		
		//Mensagem na tela	
		JOptionPane.showMessageDialog(null, "Olá, bem-vindo ao programa!");
		//Leitura de uma String
		nome = JOptionPane.showInputDialog("Digite seu nome");
		telefone = JOptionPane.showInputDialog("Digite seu telefone");
		email = JOptionPane.showInputDialog("Digite seu e-mail");
		
		//Leitura e conversão em double
		String leiaSalario = JOptionPane.showInputDialog("Digite seu salario");
		salario = Double.parseDouble(leiaSalario);
				
		//Apresentando na tela
		JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nTelefone: "+telefone
				+"\nE-mail: "+email+"\nSalário: "+salario+"\nGanhou Aumento de 10%"
				+"\nNovo Salário: "+(salario*1.1));
		
	}

}
