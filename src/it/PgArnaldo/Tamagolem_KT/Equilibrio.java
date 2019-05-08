package it.PgArnaldo.Tamagolem_KT;

import it.unibs.fp.mylib.NumeriCasuali;

public class Equilibrio
{
	private final int NUM_ELEMENTI = 6;
	private int[][] sistemaForze = new int[NUM_ELEMENTI][NUM_ELEMENTI];

	
	/**
	 * Classe per gestire il rapporto di equilibrio tra gli elementi
	 */
	public Equilibrio ()		// serve per riempire la matrice equilibrio con i valori di efficienza dei diversi elementi
	{
		


	}	// fine COSTRUTTORE
	
	//---------------------------------------------------------------------
	
	/**
	 * Stampa i valori della tabella dell' equilibrio
	 */
	public void stampaValori ()
	{
		for (int i = 0; i < NUM_ELEMENTI; i++)
		{
			for (int j = 0; j < NUM_ELEMENTI; j++)
			{
				System.out.print(sistemaForze[i][j]+"  ");
			}
			System.out.print("\n");
		}
	}
	
	
	//--------------------------------------------------------------------
	
	/**
	 * Ritorna il valore della tabella data la riga e la colonna
	 * @param elemento1 Riga della matrice
	 * @param elemento2 Colonna della matrice
	 * @return elemento della matrice corrispondente
	 */
	public int getValore(int elemento1,int elemento2) {
		
		return sistemaForze[elemento1][elemento2];
	}
	
	
	//--------------------------------------------------------------------
	
	/**
	 * Crea la matrice per il rapporto tra gli elementi
	 */
	public void creaMatrice() {
		int tmp = 0;
		int danno = 0;
		int sommaVal = 0;
		for (int righe = 0; righe < NUM_ELEMENTI; righe++)
		{
			sommaVal = 0;
			for (int colonne = 0; colonne < NUM_ELEMENTI; colonne++)
			{
				if (colonne == righe)
					sistemaForze [righe][colonne] = 0;
				else if (righe < NUM_ELEMENTI-1 && colonne == NUM_ELEMENTI-1)
				{
					sistemaForze [righe][NUM_ELEMENTI-1] = -1*sommaVal;
					sistemaForze [NUM_ELEMENTI-1][righe] = sommaVal;
				}
				else
				{
					if (colonne > righe )
					{
						tmp = NumeriCasuali.estraiIntero(0, 1);
						danno = NumeriCasuali.estraiIntero(1, 30);		// numero casuale per l'efficacia dell'elemento
						if (tmp == 0)
						{
							danno *= -1;
						}

						sistemaForze [righe][colonne] = danno;
						sistemaForze [colonne][righe] = -1*danno;
						sommaVal += danno;
					}
					else
					{
						sommaVal += sistemaForze [righe][colonne];
					}

				}
			}	// fine FOR colonne
		} // fine FOR righe

		stampaValori();
	}
}
