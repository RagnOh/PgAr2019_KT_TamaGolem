package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IAssegnaPietre extends JPanel{

	
	private ArrayList<PanelPietre> addPietre= new ArrayList<PanelPietre>(); //ArrayList per gestione grafica a caselle pietre da dare al tamagolem
	private ArrayList<PanelPietreTama> pietreTama= new ArrayList<PanelPietreTama>(); //ArrayList per gestione grafica a caselle pietre possedute dal tamagolem
	
	private BorderLayout bordi;
	private final static int NUMELEMENTI=6;
	
	private String tamaName;
	private String nomeSquad;
	
	private int numPietreTama=3; //Numero di pietre che ciascun Tamagolem può possedere
	private int numClick=0; //Conta il numero di volte che viene premuto il pulsante
	
	
	
	//----------------------------------------------------
	
	
	
	public IAssegnaPietre() {
		// TODO Auto-generated constructor stub
	}
	
	
	//------------------------------------------------------------
	
	public void drawInterface(JPanel panelA,String nameTama) {
		

		bordi=new BorderLayout();
		
		JPanel panelTama=new JPanel(new GridLayout(5, 1));
		JPanel panelPietre=new JPanel(new GridLayout(5,1));
		JPanel infoTama=new JPanel(new BorderLayout());
		
		JLabel nomeTama=new JLabel(nameTama);
		
		infoTama.add(nomeTama,BorderLayout.CENTER);
		
		panelA.setLayout(bordi);
		
		panelA.add(infoTama,BorderLayout.NORTH);
		panelA.add(panelTama,BorderLayout.WEST);
		panelA.add(panelPietre,BorderLayout.CENTER);
		
		
		panelTama.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		inizPanelPietre();
		inizPanelPietreTama();
		
		panelA.validate();
		panelA.repaint();
		
		
		 for(int i=0;i<addPietre.size();i++) {
				
		    	panelPietre.add(addPietre.get(i));
		    }
		 
		 for(int i=0;i<pietreTama.size();i++) {
				
		    	panelTama.add(pietreTama.get(i));
		    }
		
		do {
			
			controlloPulsanti();
			panelA.validate();
			panelA.repaint();
			
		}while(numClick<3);
		 
		
		System.out.println("FINE");
		
		panelA.removeAll();
	}
	
	
	
	//--------------------------------------------------------------------------
	
      private void inizPanelPietre() {
		
		for(int i=0;i<NUMELEMENTI;i++) {
		addPietre.add(new PanelPietre());
		}   
	
    }
      
      
      
	//-------------------------------------------------------------------------------
	
	private void inizPanelPietreTama() {
		
		for(int i=0;i<NUMELEMENTI;i++) {
			pietreTama.add(new PanelPietreTama());
			}   
	}
	
	
	
	//--------------------------------------------------------------------------------
	
	private void controlloPulsanti() {
		
		first:
		for(int i=0;i<addPietre.size();i++) { //Panel con pulsanti
			
			if(addPietre.get(i).getClick()==1) {
				
				addPietre.get(i).resetClick();
				
				pietreTama.get(i).addPietra();
				
				 pietreTama.get(i).aggiornaConto();
				
				numClick++;
				
			}
		
		  if(numClick==3) {
			  
			  break first;
		  }
		
		}
		
		
		
	}
	
	
	
	//-----------------------------------------------------------------------------------
	
	private void refreshConto() {
		
		 for(int i=0;i<pietreTama.size();i++) {
			 
			 pietreTama.get(i).aggiornaConto();
			 
		 }
	}
	
	
	
	//-------------------------------------------------------------------------------------
	
	public void copyIntoTama(Tamagolem tama) {
		
		for(int i=0;i<NUMELEMENTI;i++) {
			
			tama.setPietra(i, pietreTama.get(i).getNumPietre());
			
			} 
		
	}
	
	public void resetRisorse() {
		

		for(int i=0;i<NUMELEMENTI;i++) {
			
			
			addPietre.clear();
			pietreTama.clear();
			
			
			
			} 
		
		numClick=0;
	}
	
}
