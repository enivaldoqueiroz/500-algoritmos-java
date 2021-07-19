package cursojava.modulo15.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class LocalDateDiasMesesAnos {

	public static void main(String[] args) {
		// TODO Data, anos, dias, meses e parcelas com LocalDate
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		for (int mes = 1; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Data de vencimento do boleto : " +
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês: " + mes);
		}
		
		
		System.out.println("\n");
		System.out.println("Mais 5 dias : " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Mais 5 semanas : " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 anos : " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 5 meses : " + (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("Menos 1 anos : " + (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 1 meses : " + (dataBase = dataBase.minusMonths(1)));
		
		System.out.println("Menos 1 dias : " + (dataBase = dataBase.minusDays(1)));
		
		

	}

}
