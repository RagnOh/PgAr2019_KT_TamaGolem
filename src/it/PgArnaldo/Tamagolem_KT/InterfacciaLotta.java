package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class InterfacciaLotta extends JFrame implements KeyListener{

	
	private int clicked=0;
	private JPanel panel1;
	private JPanel panelA;
	private JLabel label1;
	private JLabel label2;
	private int numTama=6;
	
	private Squadra s1;
	private Squadra s2;
	
	private IAssegnaPietre a;
	private IGestioneSquad player;
	

	public InterfacciaLotta() {
		// TODO Auto-generated constructor stub
		
		super("Tamagolem");
		this.setBounds(0, 0,1300 , 900);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	//----------------------------------------------------------------------------
	
	public void vivoLotta(String p1, String p2) {
		
	    s1=new Squadra(numTama);
		s2=new Squadra(numTama);
		
		
		introIniziale();
		
		player = new IGestioneSquad(p1,s1);
		
		player.AggiungiElementi(panelA);
		
		player=new IGestioneSquad(p2,s2);
		
		player.AggiungiElementi(panelA);
		
		a=new IAssegnaPietre();
			
		a.drawInterface(panelA,s1.getTama(0).getNome()+"   Team1");
		a.copyIntoTama(s1.getTama(0));
		
		
	    a.resetRisorse();
	    
		
		a.drawInterface(panelA,s2.getTama(0).getNome()+"   Team2");
		a.copyIntoTama(s2.getTama(0));
	
	    s1.getTama(0).stampaPietre();
	    s2.getTama(0).stampaPietre();
	
	
	
	}
	
	
	
	//-----------------------------------------------------------------------------------------------------
	
	private void introIniziale() {
		
		
		panelA= new JPanel(new BorderLayout());
	    panel1 = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		label1 = new JLabel("KT Studios Presents");
		label2 = new JLabel("..premi un tasto qualsiasi per continuare..");
		
	     
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
	
	
	
	//-------------------------------------------------------------------------------------------------------
	
	private void pausa(int tempo) {
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
    //---------------------------------------------------------------------------------------------------------
	
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

	
}
