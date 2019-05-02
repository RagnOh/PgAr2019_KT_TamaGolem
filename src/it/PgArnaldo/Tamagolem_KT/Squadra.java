package it.PgArnaldo.Tamagolem_KT;
import java.util.ArrayList;
import it.unibs.fp.mylib.InputDati;;

public class Squadra
{
  
	
  private int numGolem;		// numero di golem ammessi per la squadra
  private int conteggioSquad=0;	//numero di golem aggiunti alla squadra
  private ArrayList <Tamagolem> squadraGolem = new ArrayList <Tamagolem> (); //Contiene i tamagolem di una Squadra

  
	public Squadra (int _numGolem)
	{
		numGolem=_numGolem;
		/*for (int i = 0; i< numGolem; i++)	// ciclo per la creazione dei golem -> da define poi
		{

		}*/
	}
	
	
	
	/**
	 * Aggiunge un Tamagolem alla squadra
	 * @param tama Tamagolem da aggiungere alla squadra
	 * @return Ritorna verso se l' operazione è andata a buon fin altrimenti falso
	 */
	public boolean addTama(String nome) {
		
		
		if (conteggioSquad<=numGolem) {
		squadraGolem.add(new Tamagolem(nome));
		conteggioSquad++;
		return true;
		}
		
		else return false;
	}
	
	
	
	/**
	 * Rimuove un Tamagolem dalla squadra 
	 * @param nomeTama Il nome del Tamagolem da rimuovere dalla squadra
	 */
	public void removeTama(String nomeTama ) {
		
		
        int posTama=searchTama(nomeTama);
		
		while(posTama==800) {
			
			nomeTama=InputDati.leggiStringaNonVuota("Tamagolem non trovato, inserisci un nome valido");
			posTama=searchTama(nomeTama);
			
		}
		
		squadraGolem.remove(posTama);
		
	}
	
	
	
	/**
	 * Estrae il Tamagolem voluto dalla squadra dopo averlo cercato tramite nome 
	 * @param nomeTama Nome del Tamagolem da cercare
	 * @return Ritorna il Tamagolem desiderato
	 */
	public Tamagolem getTama(String nomeTama) {
		
		int posTama=searchTama(nomeTama);
		
		while(posTama==800) {
			
			nomeTama=InputDati.leggiStringaNonVuota("Tamagolem non trovato, inserisci un nome valido");
			posTama=searchTama(nomeTama);
			
		}
		
		return squadraGolem.get(posTama);
	}
	
	
	
	/**
	 * Cerca il Tamagolem nella squadra in base al nome 
	 * @param nomeTama Nome del Tamagolem da cercare
	 * @return Se viene trovato ritorna la posizione nell' arraylist altrimenti ritorna il codice errore 800  
	 */
	private int searchTama(String nomeTama) {
		
		for (int tmp = 0; tmp < squadraGolem.size(); tmp++)
		{
			if (squadraGolem.get(tmp).getNome().trim().equalsIgnoreCase(nomeTama))
			{
				
			   return tmp;
				
		    }
		
		
		}
		return 800;
		
	}
	
	
	
	/**
	 * Stampa a video gli elementi della squadra
	 */
	public void stampaSquad() {
		
		for (int tmp = 0; tmp < squadraGolem.size(); tmp++)
		{
			
			System.out.println(squadraGolem.get(tmp).getNome());
		}
		
	}
	

}
