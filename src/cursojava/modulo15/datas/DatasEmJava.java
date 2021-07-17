package cursojava.modulo15.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		// TODO Modulo 15 - Datas, tempo e período com API DateTime
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mês: " 			+ date.getDate());
		System.out.println("Dia do mês: " 			+ calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " 		+ date.getDay());
		System.out.println("Dia da semana: "        + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("Hora do dia: " 			+ date.getHours());
		System.out.println("Hora do dia: " 			+ calendar.get(Calendar.HOUR_OF_DAY));
	
		System.out.println("Minuto da hora: " 		+ date.getMinutes());
		System.out.println("Minuto da hora: " 		+ calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " 			+ date.getSeconds());
		System.out.println("Segundos: " 			+ calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: "					+ (1900 + date.getYear()));
		System.out.println("Ano: " 					+ calendar.get(Calendar.YEAR));
		
		System.out.println("Mês: " 					+ (date.getMonth() + 1));
		System.out.println("Mês:" 					+ (calendar.get(Calendar.MONTH) + 1));
		
		//======================================================================
		System.out.println("\n");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formatado padrão e String: " + simpleDateFormat.format(date));
		System.out.println("Calendar Data atual em formatado padrão e String: " + simpleDateFormat.format(calendar.getInstance().getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data atual em formata para banco de dados: " + simpleDateFormat.format(date));
		System.out.println("Data atual em formata para banco de dados: " + simpleDateFormat.format(calendar.getTime()));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println("Objeto Date: " + simpleDateFormat.parse("18/10/1987"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
