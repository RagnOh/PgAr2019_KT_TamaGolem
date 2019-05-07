package it.PgArnaldo.Tamagolem_KT;

public class Partita {

	private String nomeG1;
	private String nomeG2;
	private int numElementi;
	private int numGolem;
	private int numPietre;
	private int numPietreScorta;
	private int numPietreElem;
	private Lotta l1;
	
	
	
	
	
	
	public Partita(String _nomeG1, String _nomeG2,int _numElementi) {
		
		nomeG1=_nomeG1;
		nomeG2=_nomeG2;
		numElementi=_numElementi;
		numPietre=((numElementi+1)/3)+1;
		System.out.println("numP="+ numPietre);
		numGolem = ((numElementi-1)*(numElementi-2))/ (2*(((numElementi+1)/3) +1));		// formula per calcolare il numero di Golem
		numPietreScorta=((2*numGolem*numPietre)/numElementi)*numElementi;
		numPietreElem=((2*numGolem*numPietre)/numElementi);
		
		
		
	}
	
	public void avvia() {
		
		do {
		InterfacciaLotta a=new InterfacciaLotta();
		a.vivoLotta(nomeG1,nomeG2);
		a.removeAll();
		}while(true);
		
	}
	
	
	
	
	
}
