package cursojava.modulo15.datas;

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
		
		
	}

}
