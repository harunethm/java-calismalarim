import java.util.Scanner;

public class hesapMak {
	public static void main(String[] args) {
		float sonuc = 0;
		Scanner oku = new Scanner(System.in);
		System.out.println("ilk sayýyý giriniz :");
		int say1 = oku.nextInt();
		System.out.println("ikinci sayýyý giriniz :");
		int say2 = oku.nextInt();
		System.out.println("Yapmak istediðiniz iþlemi giriniz : ");
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
			System.out.println("Yanlýþ deðer girdiniz !!!");
			break;
		}
		oku.close();
		System.out.println("Sonuç : "+ sonuc);
	}
}
