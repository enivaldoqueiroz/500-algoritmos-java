package cursojava.modulo14.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{
 
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	
	}	
	
	@Override
	public void run() {
		System.out.println("Fila rodando");
		
		
		while(true) {
			Iterator iteracao = pilha_fila.iterator();
			synchronized (iteracao) {//Bloquear o acesso a esta lista por outro processos
				while(iteracao.hasNext()) {//Enquando conter dados na lista irá processar
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
					//Processar 10 mil notas fiscais
					//Gerar uma lista enome de PDF
					//Gerar um envio em massa de email
					System.out.println("----------------------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					
					iteracao.remove();
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}		
			
			//super.run();
			try {
				Thread.sleep(1000);//Processou toda da lista da um tempo para limpeza de memoria
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}	

}
