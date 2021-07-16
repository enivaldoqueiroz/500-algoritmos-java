package cursojava.modulo14.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Thread

		//Thread processando em paralelo do envio de email
		new Thread() {
			public void run() {//Executa o que n�s queremos
				//Codigo da rotina
				for (int pos = 0; pos < 10; pos++) {
					
					//Executar com o tempo de parada determinado
					System.out.println("Executando alguma rotina, por exemplo envio de email");
					//JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//Dar um tempo

				}
				//Fim do codigo paralelo
			};
		}.start();//Start inicia a thread que fica processando paralelamente por tr�s
		
		//====================================================================================
		
		//Thread processando em paralelo do envio de nota fiscal
		new Thread() {
			public void run() {//Executa o que n�s queremos
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
			};
		}.start();//Start inicia a thread que fica processando paralelamente por tr�s
		
		
		//Codigo do sistema do usuario continua o fluxo de trabalho
		System.out.println("Fim do codigo de Thread");
		//Fluxo do sistema, cadastro de vendas
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}
}
