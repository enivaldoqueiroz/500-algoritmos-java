package cursojava.modulo14.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Thread

		for (int pos = 0; pos < 10; pos++) {
			
			//Executar com o tempo de parada determinado
			System.out.println("Executando alguma rotina, por exemplo envio de email");
			Thread.sleep(1000);//Dar um tempo

		}
		System.out.println("Fim do codigo de Thread");
	}
}
