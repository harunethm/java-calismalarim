package dizilerEkleSilSirala;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Anasayfa {

	public static int sayac = 0 ;
	public static int[] dizi= new int[10];
	
	public static void randomEkle() {
		for(int i = 0; i < 2; i++) {
			Random rand = new Random ();
			dizi[i] = rand.nextInt (100);
			sayac++;
		}
	}
	
	public static void yazdir() {
		System.out.println("\n");
		if(sayac < 0)
			System.out.println("dizi boþ");
		else {
			for (int i= 0; i < dizi.length; i++) {
				if(dizi[i] != 0)
					System.out.println("dizi["+i+"] = "+dizi[i]);			
			}			
		}
	}
	
	public static int enKucukBul() {
		sirala();
		int enKucuk = dizi[0];
		return enKucuk;
	}
	
	public static void sirala() {
		int[] array = new int[10];
		System.arraycopy(dizi, 0, array,0,sayac);
		Arrays.sort(array);
		System.arraycopy(array, 10-sayac, dizi,0,sayac);
	}
	
	public static void dizidenSil(int silinecek) {
			for (int i = 0; i < dizi.length; i++) {
				if(dizi[i] == silinecek) {
					for (int j = i; j < dizi.length - 1; j++) {
						dizi[j]=dizi[j+1];
					}
				break;
				}
			}
			dizi[dizi.length - 1] = 0;
			sayac--;
	}
	
	public static void diziyeEkle(int eklenecek) {
		if(sayac >= dizi.length)
			System.out.println("yer yok");
		else {
			dizi[sayac] = eklenecek;
			sayac++;
			sirala();
		}
	}
	
	public static void main(String[] args) {

		randomEkle();
		yazdir();
		System.out.print("\nEn Küçük Sayý = "+ enKucukBul());
		sirala();
		yazdir();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Yapmak istediðiniz iþlemi seçiniz(1-eleman ekle, 2-eleman silme) : ");
			int islem = sc.nextInt();
			switch (islem) {
			case 1:
				System.out.print("Eklemek istediðiniz sayýyý giriniz : ");
				int eklenecek = sc.nextInt();
				diziyeEkle(eklenecek);
				yazdir();
				break;
			case 2:
				if(sayac < 1) {
					System.out.println("dizi boþ");
				}
				else {
					System.out.print("Silmek istediðiniz sayýyý giriniz : ");
					int silinecek = sc.nextInt();
					dizidenSil(silinecek);
					yazdir();					
				}
				break;
			default:
				break;
			}
			sc.close();
		}
	}
}