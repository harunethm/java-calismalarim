package eklemeliSiralamaAlgoritmasi;

import java.util.Random;

public class Anasayfa {
	
	public static void eklemeliSirala(int[] a) {
		int temp, j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			for (j = i - 1; j >= 0 && temp < a[j]; j--) {
				a[j+1] = a[j]; 
			}
			a[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		long bas = System.currentTimeMillis();
		
		Random rnd = new Random();
		int[] a = new int[100];
	
		for (int i = 0; i < a.length; i++)
			a[i] = rnd.nextInt(9999);
		
		eklemeliSirala(a);
		
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		long son = System.currentTimeMillis();
		long gecenSure = son - bas;
		System.out.println(gecenSure);
	}

}
