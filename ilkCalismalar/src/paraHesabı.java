import java.util.Scanner;

public class paraHesabı {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.print("Paranızın miktarını tl cinsinden giriniz : ");
		float paraMiktarı = oku.nextInt();
		paraMiktarı*=100;
		float kr_25, kr_10, kr_5, kr_1;
		
		kr_25 = (paraMiktarı / 25);
		paraMiktarı = paraMiktarı % 25;
		kr_10 = (paraMiktarı / 10);
		paraMiktarı = paraMiktarı % 10;
		kr_5 = (paraMiktarı / 5);
		paraMiktarı = paraMiktarı % 5;
		kr_1=paraMiktarı;
		System.out.println(kr_25+" tane 25 kuruş, "+kr_10+" tane 10 kuruş, "+kr_5+" tane 5 kuruş, "+kr_1+" tane 1 kuruş.");
		oku.close();
	}

}
