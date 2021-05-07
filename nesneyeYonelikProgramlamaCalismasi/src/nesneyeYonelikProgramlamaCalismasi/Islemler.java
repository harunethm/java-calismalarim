package nesneyeYonelikProgramlamaCalismasi;

public class Islemler {
	private Araba[] arabalar = new Araba[30];
	private int arabaSayisi = 0;
	
	public void arabaVerileriEkle(Araba araba) {
		arabalar[arabaSayisi] = araba;
		arabaSayisi++;
	}
	
	public boolean plakaKontrol(String plaka) {
		for (int i = 0; i < arabaSayisi; i++) {
			if(arabalar[i].getPlaka().equals(plaka)) {
				return true;
			}
		}
		return false;
	}
	
	public float bayYuzde() {
		int baySay�s� = 0;
		for (int i = 0; i < arabaSayisi; i++) {
			if(arabalar[i].getAracSahibi().getCinsiyet().equals("e")) {
				baySay�s�++;
			}
		}
		if(baySay�s� > 0)
			return arabaSayisi / baySay�s� * 100;
		else
			return 0;
	}
	
	public float bayanYuzde() {
		int bayanSay�s� = 0;
		for (int i = 0; i < arabaSayisi; i++) {
			if(arabalar[i].getAracSahibi().getCinsiyet().equals("k")) {
				bayanSay�s�++;
			}
		}
		if(bayanSay�s� > 0)
			return arabaSayisi / bayanSay�s� * 100;
		else
			return 0;
	}
	
	public void arabaBilgileriListele() {
		for (int i = 0; i < arabaSayisi; i++) {
			System.out.println("Ara� " + (i+1) + " :");
			System.out.println("Sahibi : " + arabalar[i].getAracSahibi().getIsim());
			System.out.println("Plakas� : " + arabalar[i].getPlaka());
			System.out.println("Markas� : " + arabalar[i].getMarka());
			System.out.println("Modeli(�retim Y�l�) : " + arabalar[i].getY�l());
			System.out.println("Durumu : " + (arabalar[i].isDurumu() ? "Ikinci El" : "S�f�r"));
			System.out.println("Rengi : " + arabalar[i].getRenk());
			System.out.println("\n");
		}
	}
}
