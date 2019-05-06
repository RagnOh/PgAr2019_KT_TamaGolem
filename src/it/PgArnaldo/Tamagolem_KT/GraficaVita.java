package it.PgArnaldo.Tamagolem_KT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraficaVita extends JPanel{

	
	   private static final int RECT_X = 20;
	   private static final int RECT_Y = RECT_X;
	   private static final int RECT2_X = 23;
	   private static final int RECT2_Y = RECT2_X;
	   private static final int RECT_WIDTH = 206;
	   private static final int RECT_HEIGHT = 36;
	   private static final int RECT2_HEIGHT = 30;
	   
	   
	   private int lunghezzaVita;
	   
	   public GraficaVita(int _lunghezzaVita) {
		// TODO Auto-generated constructor stub
		  
			
			   lunghezzaVita=_lunghezzaVita;
		   
		   
	}

	   @Override
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      // draw the rectangle here
	      g.setColor(Color.DARK_GRAY);
	      g.fillRoundRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT,10,10);
	     
	      g.setColor(Color.GREEN);
	      g.fillRoundRect(RECT2_X, RECT2_Y, lunghezzaVita, RECT2_HEIGHT,10,10);
	      
	   }

	   @Override
	   public Dimension getPreferredSize() {
	      // so that our GUI is big enough
	      return new Dimension(RECT_WIDTH + 2 * RECT_X, RECT_HEIGHT + 2 * RECT_Y);
	   }
}
