package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelSquadraBatt extends JPanel  {

	private JPanel panelVita;
	private JPanel panelTama;
	private JPanel panelSfere;
	
	private GraficaVita boxVita;
	
	
	private BorderLayout composition;
	
	private GraficaSaccaSfere sf1;
	
	//---------------------------------------------------------------------------
	public PanelSquadraBatt() {
		// TODO Auto-generated constructor stub
	}
	
	
	//---------------------------------------------------------------------------
	
	public void disegnaTeam(JPanel panelMain ) {
		
		
		JLabel l3=new JLabel("sfere");
		
		composition=new BorderLayout();
		
		panelVita=new JPanel(new BorderLayout());
		panelTama=new JPanel();
		panelSfere=new JPanel();
		
		panelMain.setLayout(composition);
		
		panelMain.add(panelTama,BorderLayout.CENTER);
		panelMain.add(panelVita,BorderLayout.WEST);
		panelMain.add(panelSfere,BorderLayout.EAST);
		
		
		
		
		
		
		disegnaTama();
		
		
		
		
		panelMain.validate();
		panelMain.repaint();
	}
	
	
	//--------------------------------------------------------------------------
	
	public void disegnaVita(int vitaTama) {
		
		if(vitaTama<=0) {
			vitaTama=0;
		}
		
		boxVita=new GraficaVita(vitaTama);
        panelVita.add(boxVita,BorderLayout.CENTER);
		
		panelVita.setVisible(true);
		panelVita.validate();
		//panelVita.repaint();
		
	}
	
	
	//--------------------------------------------------------------------------
	
	public void disegnaTama() {
		
		JLabel l1=new JLabel("tama");
		panelTama.add(l1);
		
	}
	
	
	//--------------------------------------------------------------------------
	
	public void disegnaSfere(int element1,int element2,int element3) {
		
		 sf1=new GraficaSaccaSfere(element1,element2,element3);
		//sf1.switchSfere();
		
		panelSfere.add(sf1);
		
		panelSfere.validate();
		panelSfere.repaint();
	}


	//--------------------------------------------------------------------------
	
	public void Aggiorna() {
		
		sf1.switchSfere();
		panelSfere.validate();
		panelSfere.repaint();
	}
	
}
