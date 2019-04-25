package it.PgArnaldo.Tamagolem_KT;

public class Lotta {

	private Squadra squadra1;
	private Squadra squadra2;
	private Tamagolem tama1;
	private Tamagolem tama2;
	
	
	
	public Lotta(Squadra _squadra1,Squadra _squadra2,Tamagolem _tama1,Tamagolem _tama2) {
		
		squadra1=_squadra1;
		squadra2=_squadra2;
		tama1=_tama1;
		tama2=_tama2;
		
	}
	
	
	
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
	
	
	private Tamagolem sceltaTama(Squadra squad) {
		
		
		
		return new Tamagolem();
	}
	
	
	
	
}
