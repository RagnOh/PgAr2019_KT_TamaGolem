package it.PgArnaldo.Tamagolem_KT;
import java.util.ArrayList;

public class Tamagolem
{
    
	private int numPietre;			// identifica il numero massimo di pietre che può ingerire il golem
	private ArrayList <Integer> pietre = new ArrayList<Integer>(); //Identifichiamo ciascun elemento con un numero
	private int vita;
	private int vitaMax;
	private boolean isSulCampo = false;
	private boolean isAlive = true;
	private String nome;

	public Tamagolem(String _nome)	//COSTRUTTORE -> si deve dare: numPietre, vitaMax ,lanciatore
	{

		nome=_nome;
	}

	
	public void setVita (int valore)
	{
		vita = valore;
	}

	
	public void setSulCampo (boolean valore)
	{
		isSulCampo = valore;
	}
	
	
	public void setIsAlive (boolean valore)
	{
		isAlive = valore;
	}

	
	public boolean getIsAlive ()
	{
		return isAlive;
	}
	
	
	public boolean getSulCampo ()
	{
		return isSulCampo;
	}
	
	
	public int getVita ()
	{
		return vita;
	}
	
	
	public String getNome() {
		
		return nome;
	}
	
	public int getPietra(int indice) {
		
		return pietre.get(indice);
	}
	
	public void setPietra(int pos,int num) {
		
		pietre.add(pos, num);
		
	}
	
	public void stampaPietre() {
		
		for(int i=0;i<pietre.size();i++) {
			
			System.out.println(pietre.get(i));
		}
		
		System.out.println("  ");
	}
}
