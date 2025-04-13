package slideAula08;

import java.time.LocalDate;

public class TesteLanchonete {

	public static void main(String[] args) {

		//Slide 195!!!!!!!!!!!
		Bebidas bb1 = Bebidas.REFRI;
		Sanduiches sd1 = Sanduiches.MIXTO;
		
		Pedido pd1 = new Pedido(LocalDate.of(2025, 4, 11), bb1, sd1);
		
		pd1.menu();
		
		
		
	}

}
