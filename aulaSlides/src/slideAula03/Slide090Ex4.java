package slideAula03;

import javax.swing.JOptionPane;

public class Slide090Ex4 {

	public static void main(String[] args) {
		
		String leiaNum = JOptionPane.showInputDialog("Informe um número inteiro");
		Integer num = Integer.parseInt(leiaNum);
		
		JOptionPane.showMessageDialog(null,"Número escolhido: "+num+"\nAntecessor: "+(num-1)
				+"\nSucessor: "+(num+1));
	}
}
