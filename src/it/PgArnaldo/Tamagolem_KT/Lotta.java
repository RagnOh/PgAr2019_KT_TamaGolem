package it.PgArnaldo.Tamagolem_KT;

import it.unibs.fp.mylib.InputDati;//Libreria per l'input dati da tastiera

public class Lotta {

	private Squadra squadra1; //Squadra del giocatore 1
	private Squadra squadra2; //Squadra del giocatore 2
	private Tamagolem tama1; //Tamagolem del giocatore 1
	private Tamagolem tama2; //Tamagolem del giocatore 2
	private int numGolem;    //Numero di Tamagolem ammessi per squadra
	
	
	
	public Lotta(int _numGolem) {
		
		
		numGolem=_numGolem;
		
		squadra1=inizTeam();
		squadra1.stampaSquad();
		System.out.println("     ");
		squadra2=inizTeam();
		squadra2.stampaSquad();
	}
	
	
	/**
	 * Inizializza una squadra di Tamagolem
	 * @return Ritorna la squadra inizializzata
	 */
	private Squadra inizTeam() {
		
		Squadra squad=new Squadra(numGolem);
		for(int i=0;i<numGolem;i++) {
		String nome="c";
		squad.addTama(new Tamagolem(nome));
		}
		
		return squad;
	}
	


	/**
	 * Mette in campo un Tamagolem
	 * @param nPlayer Il giocatore che evoca il Tamagolem
	 * @return Ritorna se l' operazione è andata a buon fine
	 */
	public boolean evocaTama(int nPlayer) {
		
		switch(nPlayer) {
		
		case 1:
			
			tama1=sceltaTama(squadra1);
			return true;
		
		case 2:
			
			tama2=sceltaTama(squadra2);
			return true;
			
		default:
			return false;
		
		}	
	}
	
	
	/**
	 * Sceglie il Tamagolem da evocare in base al nome
	 * @param squad Inserire la squadra da cui scegliere il Tamagolem
	 * @return Tamagolem da evocare scelto dalla squadra
	 */
	private Tamagolem sceltaTama(Squadra squad) {
		
		String nomeTama=InputDati.leggiStringaNonVuota("Inserisci il nome del Tamagolem da evocare:");
		
		return squad.getTama(nomeTama);
	}
	
	
	
	private void applicaDanno(Tamagolem tama,int danno) {
		
		int vita=tama.getVita();
		vita=vita-danno;
		
		if(vita<=0) {
			tama.isAlive=false;
		}
		else {
			tama.setVita(vita);
		}
		
		
	}
	
	
}
