package no.hvl.dat100;

import java.util.Arrays;

public class Matriser {
	public static void main(String[] args) {
		int [] [] matrise1 = { 
					{1,2,3}, 
					{4,5,6}, 
					{7,8,9} 
					};
		int [] [] matrise2 = { 
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9} 
				};
		
		int tall1 = 6;

		System.out.println((matrise1));
		tilStreng(matrise1);
		System.out.println(skaler(tall1, matrise1));
		System.out.println(erLik(matrise1,matrise2));
		
		}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		int [] [] matrise1 = { 
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9} 
				};


		for (int [] rad : matrise1) {
			
			for (int j : rad) {
				
				System.out.print(j + " ");
		
		}
		System.out.println();
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		int [] [] matrise1 = { 
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9} 
				};	

		String [] strmatrise = new String[matrise1.length];
		
		System.out.println("--------------------");
	    
        for (int i = 0; i < matrise1.length; i++) {
       
        	for (int j = 0; j < matrise1.length; j++) {
        		System.out.print(matrise1 [i] [j] + " ");
   
        	}
        	System.out.print(" /n");
        }
        System.out.println(" ");
        
    	System.out.println("--------------------");
    	
    	String str = Arrays.toString(matrise1);
    	
        
		return str;
		
	}
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int tall1 = 4;
		
		int [] [] matrise1 = { 
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9} 
				};	
	for (int j = 0; j < matrise1.length * tall1; j++) {
			for (int [] rad : matrise1) {
				System.out.print(rad [j * tall1]);
			System.out.println();
				
				for (int i : rad) {
					
					System.out.print(i * tall1 + " ");
			
			}

		}
	}
		
		return(matrise1);
}
	
	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		boolean erlik = true;
		
		for( int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
					
				if ( mat1[i][j] != mat2[i][j]) {
					erlik = false;
					break;
				}
			}
	}
		return erlik;

}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
