package cursojava.modulo14.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());//Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton1 = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Thread1
			while(true) {//Ficará sempres rodando
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread threadTime1;

	public TelaTimeThread() {// Executa o que estiver dentro no momento da abertura ou execução
		setTitle("Minha Tela de time com Thread");
		setSize(new Dimension(240,240));
		setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
		setResizable(false);
		//Primeira parte concluida
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//Controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora,gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2,gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		//==================================================================
		gridBagConstraints.gridwidth = 1;
		
		jButton1.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton1, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//Executa o clique no botão
				threadTime1 = new Thread(thread1);
				threadTime1.start();
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				threadTime1.stop();
				
			}
		});
	
		add(jPanel, BorderLayout.WEST);
		
		setVisible(true);//Torna a tela visivel para o usuário
	}
	
}
