package cursojava.modulo15.datas;

import java.time.LocalDate;
import java.time.Period;

public class ObjetoPeriodoComFaixaDeTempo {

	public static void main(String[] args) {
		// TODO Faixa de tempo com Objeto Period
		
		//LocalDate dataAntiga = LocalDate.of(2019, 2, 7);
		LocalDate dataAntiga = LocalDate.parse("2019-02-07");
		
		//LocalDate dataNova = LocalDate.of(2021, 7, 19);
		LocalDate dataNova = LocalDate.parse("2021-07-19");
		
		//Comparando as datas
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais : " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias : " + periodo.getDays());
		
		System.out.println("Quantos meses : " + periodo.getMonths());
		
		System.out.println("Quantos anos : " + periodo.getYears());
		
		System.out.println("Periodo é : " + periodo.getYears() + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " e dias");

	}

}
