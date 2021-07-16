package cursojava.modulo14.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	public TelaTimeThread() {// Executa o que estiver dentro no momento da abertura ou execução
		setTitle("Tela de time com Thread");
		setSize(new Dimension(240,240));
		setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
		setResizable(false);
		
		
		setVisible(true);//Torna a tela visivel para o usuário
	}
	
}
