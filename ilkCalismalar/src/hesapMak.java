import java.util.Scanner;

public class hesapMak {
	public static void main(String[] args) {
		float sonuc = 0;
		Scanner oku = new Scanner(System.in);
		System.out.println("ilk say�y� giriniz :");
		int say1 = oku.nextInt();
		System.out.println("ikinci say�y� giriniz :");
		int say2 = oku.nextInt();
		System.out.println("Yapmak istedi�iniz i�lemi giriniz : ");
		String islem = oku.next();
		switch(islem) {
		case "+":
			sonuc = say1 + say2;
			break;
		case "*":
			sonuc = say1 * say2;
			break;
		case "/":
			sonuc = say1 / say2;
			break;
		case "-":
			sonuc = say1 - say2;
			break;
		default:
			System.out.println("Yanl�� de�er girdiniz !!!");
			break;
		}
		oku.close();
		System.out.println("Sonu� : "+ sonuc);
	}
}
