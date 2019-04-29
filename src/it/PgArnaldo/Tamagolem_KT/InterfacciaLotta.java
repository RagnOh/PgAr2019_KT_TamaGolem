package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class InterfacciaLotta extends JFrame implements KeyListener{

	private int clicked=0;
	private JPanel panel1;
	private JButton avanti;
	private JLabel label1;
	private JPanel panelA;
	private ArrayList<PanelScelta> scelte= new ArrayList<PanelScelta>();
	private String [] nomi= { "a","b","c","d","e","f","g","h","i","l"};
	
	

	public InterfacciaLotta() {
		// TODO Auto-generated constructor stub
		
		super("Tamagolem");
		this.setBounds(0, 0,1300 , 900);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		introIniziale();
 		sceltaSquadre();
	}
	
	
	
	private void introIniziale() {
		
		
		panelA= new JPanel(new BorderLayout());
	    panel1 = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		 label1 = new JLabel("KT Studios Presents");
		JLabel label2 = new JLabel("..premi un tasto qualsiasi per continuare..");
		
	     
		add(panelA);
	    panelA.add(panel1 ,BorderLayout.CENTER);
	    
	    
	    panel1.add(label1);
		
		
		pausa(2000);
		
		label1.setText(" ");
		
		pausa(2000);
		
		label1.setFont(label1.getFont ().deriveFont (64.0f));
		label1.setText("TAMAGOLEM!");
		
		c.anchor = GridBagConstraints.PAGE_END;
		c.gridy=1;
	    panel1.add(label2,c);
	    
	    label2.setVisible(false);
	    label2.setForeground(Color.RED);
	    
		pausa(1350);
		 
		addKeyListener(this);
		do {
			pausa(650);
		 label2.setVisible(true);
		 pausa(650);
		 label2.setVisible(false);
		 
		 }while(clicked==0);
		
		
		panel1.removeAll();
		panel1.setVisible(false);
		
	}
	
	
	
	
	private void pausa(int tempo) {
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		clicked=1;
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void sceltaSquadre() {
		
		avanti = new JButton("Conferma");
		avanti.setSize(80, 80);
	    BorderLayout bordi=new BorderLayout();
	    BorderLayout bordi2=new BorderLayout();
		bordi.setHgap(70);
		bordi2.setVgap(70);
		panel1.setVisible(false);
		panelA.setLayout(bordi);
	
		JPanel panel3=new JPanel(new GridLayout(5,2));
		JPanel panel4=new JPanel(bordi2);
		
		
		//this.add(panel1,BorderLayout.CENTER);
		panelA.add(panel3,BorderLayout.CENTER);
		panelA.add(panel4,BorderLayout.EAST);
		
		
		
		
		JLabel label1 = new JLabel("Nome Giocatore");
		JLabel label2 = new JLabel("dic");
		
		
		
		
		inizArray();
		
		
	   for(int i=0;i<scelte.size();i++) {
		   panel3.add(scelte.get(i));
	   }
         
           
        panel4.add(label1,BorderLayout.NORTH);
        panel4.add(avanti,BorderLayout.SOUTH);
       
		
		
		panel3.setVisible(true);
		panel4.setVisible(true);
		panelA.validate();
		panelA.repaint();
		
		
		
		
		
	}
	
	private void inizArray() {
		
		for(int i=0;i<nomi.length;i++) {
		scelte.add(new PanelScelta(nomi[i]));
		}
	}
}
