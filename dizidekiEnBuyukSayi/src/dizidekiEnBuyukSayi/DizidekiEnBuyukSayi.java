package dizidekiEnBuyukSayi;
import java.util.Random;
public class DizidekiEnBuyukSayi {

		public static int buyuk = 0;
		
		public static void enBuyukBul(int[] dizi) {
			for(int i = 0; i<10;i++) {
				if(dizi[i]>buyuk)
					buyuk=dizi[i];
			}
		}
		
		public static void main(String[] args) {
			int dizi[] = new int[10];
			Random rand = new Random();
			
			System.out.println("Deðiþmemiþ hali:");
			for(int i = 0; i<dizi.length;i++) {
				dizi[i]= rand.nextInt(100);
				System.out.printf("dizi["+i+"] = "+dizi[i]+"\n");		
			}
			
			int a = rand.nextInt(10);
			int b = rand.nextInt(10);
			int c = dizi[a];
			dizi[a]=dizi[b];
			dizi[b]=c;

			System.out.println("\nRastgele iki sayýnýn yeri deðiþtirilmiþ hali:");
			for(int i = 0; i<dizi.length;i++)
				System.out.printf("dizi["+i+"] = "+dizi[i]+"\n");
			
			enBuyukBul(dizi);
			System.out.println("\nDizinin en büyük sayýsý : " + buyuk);
			
		}
	}