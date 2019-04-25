package it.PgArnaldo.Tamagolem_KT;
import java.util.ArrayList;
import it.unibs.fp.mylib.InputDati;;

public class Squadra
{
  
	
  private int numGolem;		// numero di golem ammessi per la squadra
  private int conteggioSquad=0;	
  private ArrayList <Tamagolem> squadraGolem = new ArrayList <Tamagolem> ();

  
	public Squadra (int _numGolem)
	{
		numGolem=_numGolem;
		for (int i = 0; i< numGolem; i++)	// ciclo per la creazione dei golem -> da define poi
		{

		}
	}
	
	
	
	
	public boolean addTama(Tamagolem tama) {
		
		
		if (conteggioSquad<=numGolem) {
		squadraGolem.add(conteggioSquad, tama);
		conteggioSquad++;
		return true;
		}
		
		else return false;
	}
	
	
	
	
	public boolean removeTama() {
		
		return true;
	}
	
	
	
	
	public Tamagolem getTama(String nomeTama) {
		
		int posTama=searchTama(nomeTama);
		
		while(posTama==800) {
			
			nomeTama=InputDati.leggiStringaNonVuota("Tamagolem non trovato, inserisci un nome valido");
			posTama=searchTama(nomeTama);
			
		}
		
		return squadraGolem.get(posTama);
	}
	
	
	
	
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
	

}
