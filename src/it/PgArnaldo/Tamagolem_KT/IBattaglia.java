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
	
	//---------------------------------------------------------------------------------------------
	public IBattaglia() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	//---------------------------------------------------------------------------------------------
	public void disegnaCampo(JPanel panelA,Tamagolem tama1,Tamagolem tama2) {
		
		
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
        
		team1=new PanelSquadraBatt();
		team2=new PanelSquadraBatt();
		
		team1.disegnaTeam(panelT1);
		team1.disegnaVita(tama1.getVita());
		passaSfere(tama1,1);
		
		team2.disegnaTeam(panelT2);
		team2.disegnaVita(tama2.getVita());
		passaSfere(tama2,2);
		
		
		panelA.validate();
		panelA.repaint();
		
		
	}
	
	
	
	//--------------------------------------------------------------------------------------------
     
	public void passaSfere(Tamagolem tama,int squadra) {
		
		int elemento1=800;
		int elemento2=800;
		int elemento3=800;
		
		
		for(int i=0;i<6;i++) {
			
			switch(tama.getPietra(i)) {
			    
			case 1:
				
				if(elemento2==800)elemento2=i;
				else if(elemento1==800)elemento1=i;
				else if(elemento3==800)elemento3=i;
				break;
				
				
			case 2:
				elemento1=i;
				elemento3=i;
				break;
				
			case 3:
				elemento2=i;
				elemento1=i;
				elemento3=i;
				break;
				
			default:
			break;
			
			
			}
		}
		
		if(squadra==1) {
			team1.disegnaSfere(elemento1, elemento2, elemento3);
		}
		
		else {
			team2.disegnaSfere(elemento1, elemento2, elemento3);
		}
		
	}
}
