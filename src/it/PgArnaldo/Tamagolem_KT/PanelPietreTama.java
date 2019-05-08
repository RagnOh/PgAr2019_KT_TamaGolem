package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPietreTama extends JPanel{

	private int numPietre=0; 
	private String nomeElement;
	private JLabel label1;
	
	
	//-----------------------------------------------------------------------
	
	/**
	 * Disegna il box per la viusalizzazione delle pietre del tamagolem 
	 * @param _nomeElemento nome dell' elemento
	 */
	public PanelPietreTama(String _nomeElemento){
		
		nomeElement=_nomeElemento;
		
		disegnaInterface();
	}
	
	
	//------------------------------------------------------------------------
	
	/*
	 * Disegna il box con il numero di pietre per l' elemento selezionato
	 */
	public void disegnaInterface() {
		
        BorderLayout b1=new BorderLayout();
		
		
		
		JPanel panel=new JPanel(b1);
		
		this.add(panel);
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		label1=new JLabel(String.valueOf(numPietre));
		JLabel label2=new JLabel(nomeElement);
		
		panel.add(label1,BorderLayout.CENTER);
		panel.add(label2,BorderLayout.NORTH);
		
	}
	
	
	//--------------------------------------------------------------------
	
	/**
	 * Aggiunge pietre al conto
	 */
	public void addPietra() {
		
		numPietre++;
		System.out.println(numPietre);
		
	}
	
	
	//-------------------------------------------------------------------
	
	/**
	 * Aggiorna il conto delle pietre
	 */
	public void aggiornaConto() {
		
		label1.setText(String.valueOf(numPietre));
	}
	
	
	//--------------------------------------------------------------------
	
	public int getNumPietre() {
		
		return numPietre;
	}
	
	
	//---------------------------------------------------------------
	
	public void resetPietre() {
		
		numPietre=0;
	}
}
