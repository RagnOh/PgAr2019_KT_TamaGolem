package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPietre implements ActionListener {

	
	private JButton aggiungiP;
	private int click=0;
	
	public PanelPietre() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void disegnaPanel() {
		
		BorderLayout b1=new BorderLayout();
		
		aggiungiP=new JButton();
		aggiungiP.setText("ADD");
		
		
		JPanel panel=new JPanel(b1);
		
		JLabel label1=new JLabel("pietra");
		
		panel.add(label1,BorderLayout.WEST);
		panel.add(aggiungiP,BorderLayout.CENTER);
		
		aggiungiP.addActionListener(this);
		
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		click=1;
	}
	
	
	public int getClick() {
		
		return click;
	}

	
	public void setClick(int a) {
		
		click=a;
	}
}