package it.PgArnaldo.Tamagolem_KT;
import java.util.ArrayList;

public class Squadra
{
  int numGolem;		// numero di golem ammessi per la squadra
	ArrayList <TamaGolem> squadraGolem = new ArrayList <TamaGolem> ();

	public SquadraTama (int numElementi)
	{
		numGolem = ((numElementi-1)*(numElementi-2))/ (2*(((numElementi+1)/3) +1));		// formula per calcolare il numero di Golem
		for (int i = 0; i< numGolem; i++)	// ciclo per la creazione dei golem -> da define poi
		{

		}
	}
}
