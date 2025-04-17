package br.serratec.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TestLocalDate {

	public static void main(String[] args) {

		LocalDate dataHoje = LocalDate.now();
		LocalDate dataManual = LocalDate.of(2025, 4, 15);
		LocalTime hora = LocalTime.now();
		LocalDateTime dataHora = LocalDateTime.now();
		ZoneId fuso = ZoneId.systemDefault();
		
		Locale locale= new Locale("pt","BR");
		
		System.out.println(dataHoje);
		System.out.println(dataManual.getDayOfWeek().getDisplayName(TextStyle.FULL,locale));
		System.out.println(hora.plusHours(2));

		LocalDate dtNascimento = LocalDate.of(1980, 5, 30);
		
		Period periodo = Period.between(dtNascimento, dataHoje);
		System.out.println("Sua idade é: "+periodo.getYears() + " anos, "+ periodo.getMonths()
				+" meses e "+periodo.getDays()+" dias");
		
		System.out.println(ChronoUnit.DAYS.between(dtNascimento, dataHoje));
		
		System.out.println(dataHora);
		
		System.out.println(fuso);
		
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(dataHoje.format(formatarData));
		
		
		
		
		
		
		
	}

}
