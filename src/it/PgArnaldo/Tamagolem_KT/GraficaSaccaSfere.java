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
	
	
	  @Override
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      // draw the rectangle here
	      g.setColor(Color.DARK_GRAY);
	      g.drawRect(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
	     
	      g.setColor(Color.GREEN);
	      g.fillOval(BOX_X+6, BOX_Y+5, 40, 40);
	      
	      g.setColor(Color.ORANGE);
	      g.fillOval(BOX_X+60, BOX_Y+5, 40, 40);
	      
	      g.setColor(Color.YELLOW);
	      g.fillOval(BOX_X+120, BOX_Y+5, 40, 40);
	   }

	  
	  @Override
	   public Dimension getPreferredSize() {
	      // so that our GUI is big enough
	      return new Dimension(BOX_WIDTH + 2 * BOX_X, BOX_HEIGHT + 2 * BOX_Y);
	   }
	 
}
