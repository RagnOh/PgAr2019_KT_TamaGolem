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

	
	private JPanel panel1;
	private JPanel panelA;
	private JLabel label1;
	private JLabel label2;
	
	
	private Squadra s1;
	private Squadra s2;
	
	private IAssegnaPietre a;
	private IGestioneSquad player1;
	private IGestioneSquad player2;
	
	
	private int numTama=6;
	private int clicked=0;
	private int posTama1=0;
	private int posTama2=0;
	
	private int exit=0;
	
	
	//---------------------------------------------------------------------
	
    /**
     *Disegna l' interfaccia di inizio programma e gestisce l' andamento del programma
     */
	public InterfacciaLotta() {
		// TODO Auto-generated constructor stub
		
		super("Tamagolem");
		this.setBounds(0, 0,1300 , 900);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	//----------------------------------------------------------------------------
	
	/**
	 * Gestisce la grafica e la creazione della squadra con la relativa assegnazione degli elementi
	 * @param p1 nome del giocatore 1
	 * @param p2 nome del giocatore 2
	 */
	public void vivoLotta(String p1, String p2) {
		
	    s1=new Squadra(numTama);
		s2=new Squadra(numTama);
		
		
		introIniziale();
		
		
		player1 = new IGestioneSquad(p1,s1);
		
		player1.AggiungiElementi(panelA);
		
		player2=new IGestioneSquad(p2,s2);
		
		panelA.removeAll();
		
		player2.AggiungiElementi(panelA);
		
		a=new IAssegnaPietre();
			
		a.drawInterface(panelA,s1.getTama(posTama1).getNome()+"   Team1");
		a.copyIntoTama(s1.getTama(posTama1));
		
		
	    a.resetRisorse();
	    
		
		a.drawInterface(panelA,s2.getTama(posTama2).getNome()+"   Team2");
		a.copyIntoTama(s2.getTama(posTama2));
	
		a.resetRisorse();
		
	    s1.getTama(posTama1).stampaPietre();
	    s2.getTama(posTama2).stampaPietre();
	
	
	    
		IBattaglia m=new IBattaglia();
		
		vivoLotta:
		do {
			
			
			
		if(m.disegnaCampo(panelA,s1.getTama(posTama1),s2.getTama(posTama2))==1) {
			
			System.out.println("tama1 morto");
			s1.removeTama(posTama1);
			
			if(s1.retEmpty()==true)break vivoLotta;
			
			gestioneCambio(player1, s1, posTama1,1);
			
			panelA.validate();
			panelA.repaint();
			
		}
		
		else {
			
			System.out.println("tama2 morto");
			s2.removeTama(posTama2);
			
			if(s2.retEmpty()==true)break vivoLotta;
			
			gestioneCambio(player2, s2, posTama2,2);
			
			panelA.validate();
			panelA.repaint();
		}
		
		}while(s1.retEmpty()==false && s2.retEmpty()==false);
	
		
		panelA.removeAll();
		
		if(s1.retEmpty()==true) {
		label1 = new JLabel("Giocatore 2 Vince");
		}
		
		else label1 = new JLabel("Giocatore 1 Vince");
		
		panelA.add(label1,BorderLayout.CENTER);
		
		label1.setVisible(true);
		panelA.validate();
		panelA.repaint();
		
	}
	
	
	
	//-----------------------------------------------------------------------------------------------------
	
	/**
	 * Stampa delle scritte iniziali e permette di continuare una volta premuto un tasto della tastiera
	 */
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
	
	/**
	 * Pausa temporale per le scritte
	 * @param tempo Quanto far durare la pausa
	 */
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
		if(e.getKeyCode()==65)exit=1;
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	//---------------------------------------------------------------------
	
	/**
	 * Gestisce il cambio di Tamagolem
	 * @param player Box giocatore
	 * @param squad Squadra da cui prendere il Tamagolem
	 * @param posizioneTama Posizione del tamagolem nell' array
	 */
	public void gestioneCambio(IGestioneSquad player,Squadra squad,int posizioneTama,int numsquadra) {
		
		player.resetRis();
		
		panelA.removeAll();
		
		posizioneTama=player.evocaAltroTama(panelA);
		
		if(numsquadra==1) {
			
			posTama1=posizioneTama;
		}
		else if(numsquadra==2) {
			
			posTama2=posizioneTama;
		}
		
		a.drawInterface(panelA,squad.getTama(posizioneTama).getNome()+"   Team1");
		a.copyIntoTama(squad.getTama(posizioneTama));
		
		
	    a.resetRisorse();
		
	}
}
