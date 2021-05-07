public class ogrenci extends kisi{

	String[] dersler = new String[20];
	int sayac = 0;
	
	public ogrenci(String id, String ad, int yas) {
		super.setId(id);
		super.setAd(ad);
		super.setYas(yas);
	}
	
	public void dersEkle(String dersAdi) {
		if(sayac > dersler.length) 
			System.out.println("ders alamaz");
		else {
			dersler[sayac] = dersAdi;
			sayac++;			
		}
	}
	
	public void dersListele() {
		for (int i = 0; i < sayac; i++) {
			System.out.println(dersler[i]);
		}
	}
	
	public void yasKontrol() {
		if(super.getYas() < 7)
			System.out.println("Kiþi Öðrenci OLAMAZ !!!");
	}
}
