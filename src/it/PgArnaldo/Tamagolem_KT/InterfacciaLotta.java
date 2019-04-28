package it.PgArnaldo.Tamagolem_KT;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SwingConstants;

public class InterfacciaLotta extends JFrame{

	

	public InterfacciaLotta() {
		// TODO Auto-generated constructor stub
		
		super("Tamagolem");
		this.setBounds(0, 0,1300 , 900);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		introIniziale();
	}
	
	
	
	private void introIniziale() {
		
		
		JLabel label1 = new JLabel("KT Studios Presents");
		add(label1);
		
		
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setVerticalAlignment(SwingConstants.CENTER);
		
		pausa(2000);
		
		label1.setText(" ");
		
		pausa(1000);
		
		label1.setFont(label1.getFont ().deriveFont (64.0f));
		label1.setText("TAMAGOLEM!");
		
	}
	
	
	private void pausa(int tempo) {
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
