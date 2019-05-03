package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class IAssegnaPietre {

	private BorderLayout bordi;
	
	//----------------------------------------------------
	
	
	
	public IAssegnaPietre() {
		// TODO Auto-generated constructor stub
	}
	
	
	//------------------------------------------------------------
	
	public void drawInterface(JPanel panelA) {
		

		bordi=new BorderLayout();
		
		JPanel panelTama=new JPanel(new GridLayout(5, 1));
		JPanel panelPietre=new JPanel(new GridLayout(5,1));
		
		panelA.setLayout(bordi);
		
		panelA.add(panelTama,BorderLayout.WEST);
		panelA.add(panelPietre,BorderLayout.CENTER);
		
		
		
		
	}
	
	
}
