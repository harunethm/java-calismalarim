package nesneyeYonelikProgramlamaCalismasi;

public class Anasayfa {

	public static void main(String[] args) {
		
		Kisi k1 = new Kisi("Anýl AGCAER", "e", 20);
		Kisi k2 = new Kisi("Harun CALIS", "e", 20);
		Kisi k3 = new Kisi("Ethem CALIS", "e", 19);
		
		Araba a1 = new Araba(k1, "06 YZZ 77", "Toyota", 2020, false, "Sarý");
		Araba a2 = new Araba(k2, "61 AE 389", "Wolsvagen", 1974, true, "Sarý");
		Araba a3 = new Araba(k3, "50 DU 071", "Ford", 2008, true, "Gri");
		
		Islemler islem = new Islemler();
		
		islem.arabaVerileriEkle(a1);
		islem.arabaVerileriEkle(a2);
		islem.arabaVerileriEkle(a3);

		islem.arabaBilgileriListele();
		
		System.out.println(islem.plakaKontrol("61 AE 389") ? "Plaka kayýtlý." : "Plaka kayýtlý deðil.");
		
		System.out.println("Erkek kullanýcý yüzdesi : " + islem.bayYuzde());
		System.out.println("Kadýn kullanýcý yüzdesi : " + islem.bayanYuzde());
	}

}
