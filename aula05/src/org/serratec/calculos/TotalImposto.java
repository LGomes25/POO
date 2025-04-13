package org.serratec.calculos;

import org.serratec.exemplo.Tributos;

public class TotalImposto {

	public Double totalGeral=0.0;

	public Double getTotalGeral() {
		return totalGeral;
	}
	
	public void calcularTotalGeralTributos(Tributos tributos) {
		totalGeral += tributos.calcularICMS();
		totalGeral += tributos.calcularIR();
		System.out.println("Total Geral ICMS: "+ tributos.calcularICMS());
		System.out.println("Total Geral IR: "+ tributos.calcularIR());
		
	}

	
}
