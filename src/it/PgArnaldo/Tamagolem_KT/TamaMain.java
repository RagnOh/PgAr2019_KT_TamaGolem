package it.PgArnaldo.Tamagolem_KT;

import it.unibs.fp.mylib.InputDati;

public class TamaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        String p1="G1";//InputDati.leggiStringaNonVuota("Inserisci il nome del giocatore 1");
        String p2="G2";//InputDati.leggiStringaNonVuota("Inserisci il nome del giocatore 2");
        
        
		Partita play= new Partita(p1,p2,6);
        play.avvia();
        
        
	}

}
