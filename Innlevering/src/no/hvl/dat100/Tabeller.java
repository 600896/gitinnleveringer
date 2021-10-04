package no.hvl.dat100;

import java.util.Arrays;

public class Tabeller {
	public static void main(String[] args) {
	int [] tab = {2, 4, 7, 8, 9, 6};
	int [] tabell1 = {42,67,89};
	
	skrivUt(tab);
	tilStreng(tabell1);
	summer(tab);
	int tall = 6; // tall jeg vil finne i finnesTall
	
	
	System.out.println(finnesTall(tabell1, tall));
	System.out.println(posisjonTall(tab, tall));
	System.out.println(reverser(tab));
	System.out.println(erSortert(tab));
	System.out.println(settSammen(tab, tabell1));
}
	
	// a)
	public static void skrivUt(int[] tabell) {

	int [] tab = {2, 4, 7, 8, 9, 6};
		
		System.out.print("[");
		
		for (int tall : tab) {
			System.out.print(tall + " ");
		}
		
		System.out.println("]");
		
			
		}
	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
	int [] tabell1 = {42,67,89};
		
		String [] strtabell = new String[tabell1.length];
	 
	        for (int i = 0; i < tabell1.length; i++) {
	        strtabell[i] = String.valueOf(tabell1[i]);
	        }
	        
	        String str = Arrays.toString(tabell1);
	        	
	        System.out.println(str); 
	        
			return str;
	        
}

	// c)
	public static int summer(int[] tabell) {

		int [] tab = {2, 4, 7, 8, 9, 6};
		
		int sumFor = 0;
		int sumWhile = 0;
		int sumUtvidetfor = 0;
		
		for ( int i = 0; i < tab.length; i++) {
			sumFor += tab[i];
		}
		
		for (int j : tab) {
			sumUtvidetfor += j;
			}
		
		int f = 1;
		while(f < tab.length) {
			sumWhile += f;
		}
		
		
		System.out.println(sumFor);
		System.out.println(sumUtvidetfor);
		System.out.println(sumWhile);
		
		
		return(sumFor);
		
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int [] tabell1 = {4, 9, 7, 8, 5 };
		
		boolean funnet = false; // deklarere en boolean 
		
		int i = 0;
		
		while(!funnet && i < tabell1.length) { // hvis det første punktet i tabellen ikke er 6 og er i tabelllengden
			if (tabell1[i] == tall) 
				funnet = true; // hvis tabelltallet = 6, vil funnet være sant, og man går ut av while-løkka
			else
				i++; //hvis ikke flytter videre til neste tall og skjekker på nytt
			break;
		}
		if (funnet )			
			System.out.println("true");
		else
		System.out.println("false");

		
		return(funnet);
		
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int [] tab = {2, 4, 7, 8, 9, 6};
		
		 int pos = Arrays.binarySearch(tab, tall); //funker ikke på usorterte tabeller
		 
		 if (pos < 0)
			 return (pos); 
		 
		 else 
			 return(-1);
		
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] tab = {2, 4, 7, 8, 9, 6};
		
		// printer ut tabellen fra det siste elementet
		System.out.print(" [");
		
		for (int i = tab.length - 1; i >= 0; i--) {	
		System.out.print(tab[i] + " ");
	}
		System.out.print(" ]");
		
		return(tab);
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int [] tab = {2, 4, 7, 8, 9, 6};
		
		int j = 1;
		boolean sortert = true;
		
		// skjekker hvert tall fra tabellen hvis den er større en 0 og mindre enn lengden til tabellen og om 
		// det er mindre enn det neste tallet, hvis den er det går koden videre og skjekker neste tall
		
		for (int i = 0; (i < tab.length - 1) && sortert; i++){
			if (tab[j] > tab[j + 1]) {
				sortert = false;
			}
			j++;
		}
		return sortert;
		
		}
		
	// h)
	public static int[] settSammen(int[] tabell1, int[] tab) {

		 int nyLengde = tab.length + tabell1.length;
		 int [] nyTab = new int [nyLengde];
		 
		 for (int i = 0; i < tab.length; i++) {
			 nyTab[i] = tab[i];
		 }
		 for (int j = 0; j < tabell1.length; j++) {
			 nyTab[tab.length + j] = tabell1[j];
		 }
		 System.out.print("[");
		 for (int k = 1; k < nyTab.length; k++) {	
				System.out.print(nyTab[k]);
			}
		 System.out.print("]");
		 
		 return(nyTab);
		
	}
}
