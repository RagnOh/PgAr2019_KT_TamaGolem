package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPietre extends JPanel implements ActionListener {

	
	private JButton aggiungiP;
	private int click=0;
	private String nomeElemento;
	
	public PanelPietre(String _nomeElemento) {
		// TODO Auto-generated constructor stub
		
		nomeElemento=_nomeElemento;
		
		disegnaPanel();
	}
	
	
	public void disegnaPanel() {
		
		BorderLayout b1=new BorderLayout();
		
		aggiungiP=new JButton();
		aggiungiP.setText("ADD");
		
		
		JPanel panel=new JPanel(b1);
		this.add(panel);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		JLabel label1=new JLabel(nomeElemento+" ");
		
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

	
	public void resetClick() {
		
		click=0;
	}
}
