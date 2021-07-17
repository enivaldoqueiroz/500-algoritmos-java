package cursojava.modulo15.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ChronoUnitEmJava {

	public static void main(String[] args) throws ParseException {
		// TODO Faixa de tempo com ChronoUnit
		
		Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-01-01"), LocalDate.now());

		System.out.println("Possui " + dias + " dias entra a faixa de data");
		
		long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2021-01-01"), LocalDate.now());

		System.out.println("Possui " + meses + " meses entra a faixa de data");
		
		long ano = ChronoUnit.YEARS.between(LocalDate.parse("2020-01-01"), LocalDate.now());

		System.out.println("Possui " + ano + " ano(s) entra a faixa de data");
	}

}
