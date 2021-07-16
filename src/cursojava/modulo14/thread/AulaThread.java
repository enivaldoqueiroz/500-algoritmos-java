package cursojava.modulo14.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Thread

		//Thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//====================================================================================
		
		//Thread processando em paralelo do envio de nota fiscal
		 Thread threadNotaFiscal = new Thread(thread2);
		 threadNotaFiscal.start();
					
		//Codigo do sistema do usuario continua o fluxo de trabalho
		System.out.println("Fim do codigo de Thread");
		//Fluxo do sistema, cadastro de vendas
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			//Codigo da rotina
			for (int pos = 0; pos < 10; pos++) {
				
				//Executar com o tempo de parada determinado
				System.out.println("Executando alguma rotina, por exemplo envio de email");
				//JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Dar um tempo

			}
			//Fim do codigo paralelo
		}
	};
	
	private static Runnable thread2  = new Runnable() {
		
		@Override
		public void run() {
			
			//Codigo da rotina
			for (int pos = 0; pos < 10; pos++) {
				
				//Executar com o tempo de parada determinado
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Dar um tempo

			}
			//Fim do codigo paralelo
		}
	};
}
