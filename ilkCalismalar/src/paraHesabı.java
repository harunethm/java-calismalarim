import java.util.Scanner;

public class paraHesab� {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.print("Paran�z�n miktar�n� tl cinsinden giriniz : ");
		float paraMiktar� = oku.nextInt();
		paraMiktar�*=100;
		float kr_25, kr_10, kr_5, kr_1;
		
		kr_25 = (paraMiktar� / 25);
		paraMiktar� = paraMiktar� % 25;
		kr_10 = (paraMiktar� / 10);
		paraMiktar� = paraMiktar� % 10;
		kr_5 = (paraMiktar� / 5);
		paraMiktar� = paraMiktar� % 5;
		kr_1=paraMiktar�;
		System.out.println(kr_25+" tane 25 kuru�, "+kr_10+" tane 10 kuru�, "+kr_5+" tane 5 kuru�, "+kr_1+" tane 1 kuru�.");
		oku.close();
	}

}
