package cursojava.modulo15.datas;

import java.time.Duration;
import java.time.Instant;

public class TempoDeProcessoComInstant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Tempo de processo com Instant
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println(" Duração em nano segundos : " + duracao.toNanos());
		
		System.out.println(" Duração em nano minutos : " + duracao.toMinutes());
		
		System.out.println(" Duração em nano horas : " + duracao.toHours());
		
		System.out.println(" Duraçao em milisegundos : " + duracao.toMillis());
		
		System.out.println(" Duração em dias : " + duracao.toDays());
		
		
		

	}

}
