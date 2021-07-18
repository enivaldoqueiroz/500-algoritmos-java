package cursojava.modulo15.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NovaAPIDeDataNoJava {

	public static void main(String[] args) {
		// TODO Nova API de Data e Hora do Java 8
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual : " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual : " + horaAtual);
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		//System.out.println("Hora e Data : " + dataAtualHoraAtual);
		System.out.println("Data e hora atual : " + new SimpleDateFormat("dd-MM-yyyy").format(dataAtualHoraAtual.toLocalDate()));
		
		
	}

}
