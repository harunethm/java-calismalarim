public class test {
	static int count = 0;
	public static void ekle(kisi[] dizi, kisi a) {
		dizi[count] = a;
		count++;
	}
	
	public static void yasKontrolEt(kisi biri) {
		biri.yasKontrol();
	}

	public static void main(String[] args) {
		kisi[] kisiNesnesi = new kisi [20];
		
		kisi a = new calisan("18", "ibrahim", 50);
		calisan b = new calisan("19", "halil", 48);
		ogrenci	c = new ogrenci("183301051", "harun", 18);
		ogrenci	d = new ogrenci("183301013", "mert", 18);
		
		c.dersEkle("fizik");
		c.dersEkle("lineer");
		
		d.dersEkle("edebiyat");
		
		ekle(kisiNesnesi, a);
		ekle(kisiNesnesi, b);
		ekle(kisiNesnesi, c);
		ekle(kisiNesnesi, d);
		
		yasKontrolEt(a);
		yasKontrolEt(c);
		
		System.out.println("c öðrencisinin aldýðý ders sayýsý : " + c.sayac);
		c.dersListele();
		System.out.println("d öðrencisinin aldýðý ders sayýsý : " + d.sayac);
	}
}
