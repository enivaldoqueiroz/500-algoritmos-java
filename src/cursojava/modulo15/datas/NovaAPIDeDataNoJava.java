package cursojava.modulo15.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaAPIDeDataNoJava {

	public static void main(String[] args) {
		// TODO Nova API de Data e Hora do Java 8
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual : " + dataAtual);
		System.out.println("Data atual formatada : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("==============================================");
		
		System.out.println("Hora atual : " + horaAtual);
		System.out.println("Hora atual formatada : " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));		
		System.out.println("==============================================");
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		//System.out.println("Hora e Data : " + dataAtualHoraAtual);
		System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ISO_DATE));
		System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Data e hora atual formatadaos: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		
	}

}
