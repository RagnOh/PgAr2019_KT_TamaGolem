package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPietreTama {

	private int numPietre;
	
	public PanelPietreTama(){
		
	}
	
	
	public void disegnaInterface() {
		
        BorderLayout b1=new BorderLayout();
		
		
		
		JPanel panel=new JPanel(b1);
		
		JLabel label1=new JLabel("0");
		JLabel label2=new JLabel("nome");
		
		panel.add(label1,BorderLayout.CENTER);
		panel.add(label2,BorderLayout.NORTH);
		
	}
	
	
	public void setNumPietre(int a) {
		
		numPietre=a;
	}
}
