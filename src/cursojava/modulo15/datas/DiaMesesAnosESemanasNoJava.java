package cursojava.modulo15.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesesAnosESemanasNoJava {

	public static void main(String[] args) {
		// TODO Dia, meses, anos e semanas
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data atual : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana : " + localDate.getDayOfWeek().name());
		
		System.out.println("Dia da mês : " + localDate.getDayOfMonth());
		
		System.out.println("Dia do ano : " + localDate.getDayOfYear());
		
		System.out.println("Mês : " + localDate.getMonth());
		
		System.out.println("Ano : " + localDate.getYear());

	}

}
