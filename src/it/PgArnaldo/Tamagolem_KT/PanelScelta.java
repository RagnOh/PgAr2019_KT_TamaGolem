package it.PgArnaldo.Tamagolem_KT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelScelta extends JPanel implements ItemListener {

	private String tamaName;
	private JLabel label1;
	private JCheckBox check1;
	private boolean isSelected=false;
	private boolean wasSelected=false;
	
	
	public PanelScelta(String _tamaName) {
		
		this.tamaName=_tamaName;
		
		
		creaBox();
	}
	
	
	
	private void creaBox() {
		
		BorderLayout a = new BorderLayout();
		label1=new JLabel(tamaName);
		check1=new JCheckBox("Aggiungi al Team");
		a.setVgap(30);
		this.setLayout(a);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		this.add(label1,BorderLayout.NORTH);
		this.add(check1,BorderLayout.SOUTH);
		
	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(check1.isSelected()) {
			
			isSelected=true;
		}
		
		else {
			
			isSelected=false;
		}
	}
	
	
	public boolean getIsSelected() {
		
		return isSelected;
	}
	
	public boolean getSelection() {
		
		return isSelected;
	}
}
