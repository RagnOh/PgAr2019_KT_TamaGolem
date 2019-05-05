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
	
	
	//---------------------------------------------------------------------------------------------
	public IBattaglia() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	//---------------------------------------------------------------------------------------------
	public void disegnaCampo(JPanel panelA) {
		
		
		borderOut=new BorderLayout();
		
		panelA.setLayout(borderOut);
		
		panelT1=new JPanel();
		panelT2=new JPanel();
		panelScontro=new JPanel();
		
		//panelT1.setPreferredSize(new Dimension(200,300));
		
		panelA.add(panelScontro,borderOut.CENTER);
		panelA.add(panelT1,borderOut.NORTH);
		panelA.add(panelT2,borderOut.SOUTH);
		
		panelT1.setBorder(BorderFactory.createLineBorder(Color.black));
		panelT2.setBorder(BorderFactory.createLineBorder(Color.black));
        
		PanelSquadraBatt team1=new PanelSquadraBatt();
		PanelSquadraBatt team2=new PanelSquadraBatt();
		
		team1.disegnaTeam(panelT1);
		team2.disegnaTeam(panelT2);
		
		
		panelA.validate();
		panelA.repaint();
		
		
	}
}
