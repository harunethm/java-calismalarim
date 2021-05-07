import java.util.Scanner;

public class paraHesabý {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.print("Paranýzýn miktarýný tl cinsinden giriniz : ");
		float paraMiktarý = oku.nextInt();
		paraMiktarý*=100;
		float kr_25, kr_10, kr_5, kr_1;
		
		kr_25 = (paraMiktarý / 25);
		paraMiktarý = paraMiktarý % 25;
		kr_10 = (paraMiktarý / 10);
		paraMiktarý = paraMiktarý % 10;
		kr_5 = (paraMiktarý / 5);
		paraMiktarý = paraMiktarý % 5;
		kr_1=paraMiktarý;
		System.out.println(kr_25+" tane 25 kuruþ, "+kr_10+" tane 10 kuruþ, "+kr_5+" tane 5 kuruþ, "+kr_1+" tane 1 kuruþ.");
		oku.close();
	}

}
