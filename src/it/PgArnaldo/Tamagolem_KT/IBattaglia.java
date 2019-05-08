package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class IBattaglia extends JPanel {

	
	private JPanel panelT1;
	private JPanel panelT2;
	private JPanel panelScontro;
	
	private BorderLayout borderOut;
	
	private PanelSquadraBatt team1;
	private PanelSquadraBatt team2;
	
	private Lotta lotta1;
	
	
	//---------------------------------------------------------------------------------------------

	/**
	 * Gestisce il layout della battaglia ed inizializza la lotta
	 */
	public IBattaglia() {
		// TODO Auto-generated constructor stub
		lotta1=new Lotta();
	}
	
	
	
	//---------------------------------------------------------------------------------------------
	
	/**
	 * Disegna il layout del campo di battaglia
	 * @param panelA Box su cui disegnare il campo di battaglia
	 * @param tama1 Tamagolem squadra 1
	 * @param tama2 Tamagolem squadra 2
	 * @return 1 se il primo tamagolem muore 0 se muore il secondo
	 */
	public int disegnaCampo(JPanel panelA,Tamagolem tama1,Tamagolem tama2) {
		
		
		
		borderOut=new BorderLayout();
		
		panelA.setLayout(borderOut);
		
		panelT1=new JPanel();
		panelT2=new JPanel();
		panelScontro=new JPanel();
		
		
		panelA.add(panelScontro,borderOut.CENTER);
		panelA.add(panelT1,borderOut.NORTH);
		panelA.add(panelT2,borderOut.SOUTH);
		
		panelT1.setBorder(BorderFactory.createLineBorder(Color.black));
		panelT2.setBorder(BorderFactory.createLineBorder(Color.black));
        
		panelA.validate();
		panelA.repaint();
		
		
		lotta1.lanciaSfere(tama1, tama2, panelT1, panelT2,panelA);
		
		panelA.validate();
		panelA.repaint();
		
        if(tama1.getIsAlive()==false)return 1;
		
		else return 0;
		
	}
	
	
	
	//--------------------------------------------------------------------------------------------
     
	
}
