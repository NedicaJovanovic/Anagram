package anagram;

import java.util.Scanner;

public class Anagram {
	
	private static double[] ucitaj(Scanner sc, int N) {		
		double[] niz = new double[N];
		for (int i=0; i<N; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	} 
	
	
	private static double[] kloniraj(double[] niz) {		
		double[] klonirani = new double[niz.length];
		for (int i=0; i<niz.length; i++) {
			klonirani[i] = niz[i];
		}
		return klonirani;
	}
	
	
	private static void sort(double[] niz) {
		for (int i = 1; i < niz.length; i++) {  
	         double key = niz[i];  
	         int j = i-1;  
	         while (j>=0 && niz[j]>key){  
	            niz [j+1] = niz[j];  
	            j--;  
	         }  
	         niz[j+1] = key;  
		}  
	}
	
	
	private static boolean anagram(double[] niz1, double[]niz2) {
		
		niz1 = kloniraj(niz1);
		niz2 = niz2.clone(); 
		
		sort(niz1);
		sort(niz2);

		
		if(niz1.length != niz2.length)
			return false;
		
		
		for(int i=0; i<niz1.length; i++)
			if(niz1[i] != niz2[i])
				return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double[] niz1 = ucitaj(sc, N);
		double[] niz2 = ucitaj(sc, N);
		
		if(anagram(niz1, niz2))
			System.out.println("Jesu anagrami");
		else
			System.out.println("Nisu anagrami");
	}
}