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
	
	private BorderLayout composition;
	
	
	
	//---------------------------------------------------------------------------
	public PanelSquadraBatt() {
		// TODO Auto-generated constructor stub
	}
	
	
	//---------------------------------------------------------------------------
	
	public void disegnaTeam(JPanel panelMain) {
		
		
		JLabel l3=new JLabel("sfere");
		
		composition=new BorderLayout();
		
		panelVita=new JPanel(new BorderLayout());
		panelTama=new JPanel();
		panelSfere=new JPanel();
		
		panelMain.setLayout(composition);
		
		panelMain.add(panelTama,BorderLayout.CENTER);
		panelMain.add(panelVita,BorderLayout.WEST);
		panelMain.add(panelSfere,BorderLayout.EAST);
		
		
		
		
		
		disegnaVita();
		disegnaTama();
		disegnaSfere();
		
		
		
		panelMain.validate();
		panelMain.repaint();
	}
	
	
	//--------------------------------------------------------------------------
	
	public void disegnaVita() {
		
		GraficaVita boxVita=new GraficaVita(100);
        panelVita.add(boxVita,BorderLayout.CENTER);
		
		panelVita.setVisible(true);
		
	}
	
	
	//--------------------------------------------------------------------------
	
	public void disegnaTama() {
		
		JLabel l1=new JLabel("tama");
		panelTama.add(l1);
		
	}
	
	
	//--------------------------------------------------------------------------
	
	public void disegnaSfere() {
		
		GraficaSaccaSfere sf1=new GraficaSaccaSfere();
		
		panelSfere.add(sf1);
		
	}


	//--------------------------------------------------------------------------
	
	
}
