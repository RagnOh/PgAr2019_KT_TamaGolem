package it.PgArnaldo.Tamagolem_KT;

import it.unibs.fp.mylib.InputDati;//Libreria per l'input dati da tastiera

public class Lotta {

	private Squadra squadra1; //Squadra del giocatore 1
	private Squadra squadra2; //Squadra del giocatore 2
	
	private Tamagolem tama1; //Tamagolem del giocatore 1
	private Tamagolem tama2; //Tamagolem del giocatore 2
	
	private Equilibrio equilibrio1;
	
	private int numGolem;    //Numero di Tamagolem ammessi per squadra
	private int numPietre;
	
	
	public Lotta() {
		
		
	
	}
	
	
	
	
	/**
	 * Attribuisce il danno prestabilito al Tamagolem e controlla se la sua vita è zero o negativa
	 * @param tama Il tamagolem che subisce danni
	 * @param danno Il danno da attribuire al tamagolem
	 */
	private void applicaDanno(Tamagolem tama,int danno) {
		
		int vita=tama.getVita();
		
		vita=vita-danno;
		
		if(vita<=0) {
			tama.setIsAlive(false);
		}
		else {
			tama.setVita(vita);
		}
		
		
	}
	
	/**
	 * Il centro della lotta
	 */
	public void lanciaSfere() {
		
		int dSfera1=0;
		int dSfera2=0;
		int sfera1=0;
		int sfera2=0;
		int morti1=0;
		int morti2=0;
		
		do {
		first:
		for (int i=0;i<numPietre;i++) {
			
			sfera1=tama1.getPietra(i);
			sfera2=tama2.getPietra(i);
			
			if(dSfera1>dSfera2) {
				applicaDanno(tama2,2);//Inserire il danno da tabella elementi
				
				if(tama2.getIsAlive()==false) {
					morti2++;
					break first;
				}
			
			}
			
			else {
				applicaDanno(tama1,3);//Inserire il danno da tabella elementi
				
				if(tama1.getIsAlive()==false) {
					
					morti1++;
					break first;
				}
			}
		}
		
		
	}while(morti1!=numGolem && morti2!=numGolem);
		
		
		if(morti1==numGolem) {
			System.out.println("Il giocatore 2 ha vinto la partita!");
		}
		else System.out.println("Il giocatore 1 ha vinto la partita!");
	}
	
	
	
	
}
