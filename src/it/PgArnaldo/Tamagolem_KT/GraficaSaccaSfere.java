package it.PgArnaldo.Tamagolem_KT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraficaSaccaSfere extends JPanel{

	
	private final static int BOX_X=200;
	private final static int BOX_Y=20;
	private final static int BOX_WIDTH=50;
	private final static int BOX_HEIGHT=50;
	
	private int elemento1;
	private int elemento2;
	private int elemento3;
	
	
	//------------------------------------------------------------------------
	
	/**
	 * Gestisce la grafica delle pietre nella fase di battaglia
	 * @param _elemento1 pietra elemento 1
	 * @param _elemento2 pietra elemento 2
	 * @param _elemento3 pietra elemento 3
	 */
	public GraficaSaccaSfere(int _elemento1,int _elemento2,int _elemento3) {
		// TODO Auto-generated constructor stub
		
		elemento1=_elemento1;
		elemento2=_elemento2;
		elemento3=_elemento3;
	}
	
	
	//------------------------------------------------------------------------
	
	/**
	 * Disegna le pietre degli elementi ed il rettangolo che indica la pietra da lanciare
	 */
	  @Override
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      // draw the rectangle here
	      g.setColor(Color.DARK_GRAY);
	      g.drawRect(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
	     
	      setColore(g, elemento1);
	      g.fillOval(BOX_X+6, BOX_Y+5, 40, 40);
	      
	      setColore(g, elemento2);
	      g.fillOval(BOX_X+60, BOX_Y+5, 40, 40);
	      
	      setColore(g, elemento3);
	      g.fillOval(BOX_X+120, BOX_Y+5, 40, 40);
	   }

	  
	  //---------------------------------------------------------------------
	  
	  /**
	   * Controlla le dimensioni del box che conterrà le sfere
	   */
	  @Override
	   public Dimension getPreferredSize() {
	      // so that our GUI is big enough
	      return new Dimension(BOX_WIDTH + 2 * BOX_X, BOX_HEIGHT + 2 * BOX_Y);
	   }
	 
	  
	  //---------------------------------------------------------------------
	  
	  /**
	   * Imposta il colore della pietra in base all' elemento corrispondente
	   * @param g elemento di grafica 
	   * @param elemento il numero corrispondente all' elemento in tabella
	   */
	  private void setColore(Graphics g,int elemento) {
		  
		  switch (elemento) {
		  
		  case 0:
			  g.setColor(Color.GREEN);
			  break;
			  
		  case 1:
			  g.setColor(Color.RED);
			  break;
			  
		  case 2:
			  g.setColor(Color.CYAN);
			  break;
			  
		  case 3:
			  g.setColor(Color.BLUE);
			  break;
		  
		  case 4:
			  g.setColor(Color.ORANGE);
			  break;
			  
		  case 5:
			  g.setColor(Color.GRAY);
			  break;
		  
		  
		  }
	  }
	  
	  
	  //---------------------------------------------------------------------
	  
	  /**
	   * Gestisce l' animazione del cambio sfere
	   */
	  public void switchSfere() {
		  
		  int supporto=0;
		  
		  supporto=elemento1;
		  elemento1=elemento2;
		  elemento2=elemento3;
		  elemento3=supporto;
	  }
	  
}
