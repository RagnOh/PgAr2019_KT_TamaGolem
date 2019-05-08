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
	
	private String [] nomeElemento= {"ERBA","FUOCO","ARIA","ACQUA","KT","ETERE"};
	
	private BorderLayout bordi;
	private final static int NUMELEMENTI=6;
	
	private String tamaName;
	private String nomeSquad;
	
	private int numPietreTama=3; //Numero di pietre che ciascun Tamagolem può possedere
	private int numClick=0; //Conta il numero di volte che viene premuto il pulsante
	
	
	
	//----------------------------------------------------
	
	
	/**
	 * Gestisce l' assegnazione delle pietre per ciascun Tamagolem
	 */
	public IAssegnaPietre() {
		// TODO Auto-generated constructor stub
	}
	
	
	//------------------------------------------------------------
	
	/**
	 * Disegna l' interfaccia per l' assegnazione delle pietre
	 * @param panelA box all' interno del quale disegnare l' interfaccia
	 * @param nameTama nome del tamagolem + squadra
	 */
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
	
	/**
	 * Disegna i box con i pulsanti per assegnare le pietre
	 */
      private void inizPanelPietre() {
		
		for(int i=0;i<NUMELEMENTI;i++) {
		addPietre.add(new PanelPietre(nomeElemento[i]));
		}   
	
    }
      
      
      
	//-------------------------------------------------------------------------------
	
    /**
     * Disegna i box con i riferimenti alle pietre possedute dal tamagolem 
     */
	private void inizPanelPietreTama() {
		
		for(int i=0;i<NUMELEMENTI;i++) {
			pietreTama.add(new PanelPietreTama(nomeElemento[i]));
			}   
	}
	
	
	
	//--------------------------------------------------------------------------------
	
	/**
	 * Controlla quali pulsanti sono stati premuti ed aggiunge il conto alle pietre del tamagolem
	 */
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
	
	/**
	 * Aggiorna il conto delle sfere
	 */
	private void refreshConto() {
		
		 for(int i=0;i<pietreTama.size();i++) {
			 
			 pietreTama.get(i).aggiornaConto();
			 
		 }
	}
	
	
	
	//-------------------------------------------------------------------------------------
	
	/**
	 * Copia le pietre nell' array pietre del tamagolem
	 * @param tama Tamagolem in cui copiare le pietre
	 */
	public void copyIntoTama(Tamagolem tama) {
		
		for(int i=0;i<NUMELEMENTI;i++) {
			
			tama.setPietra(i, pietreTama.get(i).getNumPietre());
			
			} 
		
	}
	
	
	//---------------------------------------------------------------------------
	
	/**
	 * Resetta le risorse della classe in modo da poterla riutilizzare
	 */
	public void resetRisorse() {
		

		for(int i=0;i<NUMELEMENTI;i++) {
			
			
			addPietre.clear();
			pietreTama.clear();
			
			
			
			} 
		
		numClick=0;
	}
	
}
