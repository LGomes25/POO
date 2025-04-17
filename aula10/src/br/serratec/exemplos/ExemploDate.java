package br.serratec.exemplos;

import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Date data = new Date();//import java util
		System.out.println("Data de hoje: "+data);
		System.out.println(data.getDate());

		Calendar dataHoje = Calendar.getInstance();
		System.out.println(dataHoje);
		System.out.println(dataHoje.get(Calendar.MONTH));
		
	}

}
