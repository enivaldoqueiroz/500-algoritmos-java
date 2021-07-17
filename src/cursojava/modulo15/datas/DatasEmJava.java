package cursojava.modulo15.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		// TODO Modulo 15 - Datas, tempo e período com API DateTime
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do mês: " 			+ date.getDate());
		
		System.out.println("Dia da semana: " 		+ date.getDay());
		
		System.out.println("Hora do dia: " 			+ date.getHours());
	
		System.out.println("Minuto da hora: " 		+ date.getMinutes());
		
		System.out.println("Segundos: " 			+ date.getSeconds());
		
		System.out.println("Ano: "					+ (1900 + date.getYear()));
		
		System.out.println("Mês : " 				+ (date.getMonth() + 1));
		
		//======================================================================
		System.out.println("\n");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formatado padrão e String: " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data atual em formata para banco de dados: " + simpleDateFormat.format(date));
		
		
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
