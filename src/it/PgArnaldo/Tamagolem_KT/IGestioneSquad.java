package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IGestioneSquad implements ActionListener{

	private JButton avanti;
	private ArrayList<PanelScelta> scelte= new ArrayList<PanelScelta>();
	private String [] nomi= { "a","b","c","d","e","f","g","h","i","l"};
	private BorderLayout bordi;
	private  BorderLayout bordi2;
	private int clicked=0;
	private int conteggio=0;
	private String nomeGiocatore;
	private Squadra squad;
	
	//---------------------------------------------------------------------------
	
	public IGestioneSquad(String _nomeGiocatore,Squadra _squad) {
		// TODO Auto-generated constructor stub
	
		nomeGiocatore=_nomeGiocatore;
		squad=_squad;
	
	}
	
	//-----------------------------------------------------------------------------------------------------
	
	public void AggiungiElementi(JPanel panelA) {
		
		
		bordi=new BorderLayout();
	    bordi2=new BorderLayout();
		
		avanti = new JButton("Conferma");
		avanti.setSize(80, 80);
		
		bordi.setHgap(70);
		bordi2.setVgap(70);
		
		panelA.setLayout(bordi);
	
		JPanel panel3=new JPanel(new GridLayout(5,2));
		JPanel panel4=new JPanel(bordi2);
		
		
		
		panelA.add(panel3,BorderLayout.CENTER);
		panelA.add(panel4,BorderLayout.EAST);
		
		
		
		
		JLabel label1 = new JLabel(nomeGiocatore);
		JLabel label2 = new JLabel("dic");
		
		
		
		
		inizArray();
		
		
	    for(int i=0;i<scelte.size();i++) {
		
	    	panel3.add(scelte.get(i));
	    }
         
           
        panel4.add(label1,BorderLayout.NORTH);
        panel4.add(avanti,BorderLayout.SOUTH);
       
        avanti.setVisible(false);
		
		panel3.setVisible(true);
		panel4.setVisible(true);
		panelA.validate();
		panelA.repaint();
		
		avanti.addActionListener(this);
		
		controlNumSquad();
		aggiungiTama();
		
		panelA.removeAll();
		
	}
	
	//--------------------------------------------------------------------------------
    
	private void inizArray() {
		
		for(int i=0;i<nomi.length;i++) {
		scelte.add(new PanelScelta(nomi[i]));
		}   
	
    }
	
	//--------------------------------------------------------------------------------
	
	private void controlNumSquad(){
		
		do {
		for(int i=0;i<scelte.size();i++) {
			
	    	if(scelte.get(i).getIsSelected()==true  && scelte.get(i).giaP()==false) {
	    		
	    		conteggio++;
	    		scelte.get(i).setgiaP(true);
	    		
	    	}
	    	else if(scelte.get(i).getSelection() ==true && scelte.get(i).giaP()==true ) {
	    		
	    		scelte.get(i).setgiaP(false);
	    		conteggio--;
	    		
	    	}
	    	
	    }
		
		if (conteggio==6) {
			
			avanti.setVisible(true);
		}
		
		else avanti.setVisible(false);
		
		}while(clicked==0);
		}

	//-------------------------------------------------------------------------------------
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		clicked++;
		
		
	}
	
	//--------------------------------------------------------------------------------
	
	public void aggiungiTama() {
		
		for(int i=0;i<scelte.size();i++) {
			
			if(scelte.get(i).getIsSelected()==true) {
				squad.addTama(scelte.get(i).getTamaName());
			}
		}
		
	}
	
}
