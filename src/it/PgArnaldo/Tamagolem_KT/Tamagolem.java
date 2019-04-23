package it.PgArnaldo.Tamagolem_KT;
import java.util.ArrayList;

public class Tamagolem
{
  int numPietre;			// identifica il numero massimo di pietre che può ingerire il golem
	ArrayList <Integer> pietre = new ArrayList<Integer>();
	int vita;
	int vitaMax;
	boolean isSulCampo = false;
	boolean isAlive = true;

	public TamaGolem()	//COSTRUTTORE -> si deve dare: numPietre, vitaMax ,lanciatore
	{

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
}
