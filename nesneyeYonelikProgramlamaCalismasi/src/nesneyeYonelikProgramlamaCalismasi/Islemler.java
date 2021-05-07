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
		int baySayýsý = 0;
		for (int i = 0; i < arabaSayisi; i++) {
			if(arabalar[i].getAracSahibi().getCinsiyet().equals("e")) {
				baySayýsý++;
			}
		}
		if(baySayýsý > 0)
			return arabaSayisi / baySayýsý * 100;
		else
			return 0;
	}
	
	public float bayanYuzde() {
		int bayanSayýsý = 0;
		for (int i = 0; i < arabaSayisi; i++) {
			if(arabalar[i].getAracSahibi().getCinsiyet().equals("k")) {
				bayanSayýsý++;
			}
		}
		if(bayanSayýsý > 0)
			return arabaSayisi / bayanSayýsý * 100;
		else
			return 0;
	}
	
	public void arabaBilgileriListele() {
		for (int i = 0; i < arabaSayisi; i++) {
			System.out.println("Araç " + (i+1) + " :");
			System.out.println("Sahibi : " + arabalar[i].getAracSahibi().getIsim());
			System.out.println("Plakasý : " + arabalar[i].getPlaka());
			System.out.println("Markasý : " + arabalar[i].getMarka());
			System.out.println("Modeli(Üretim Yýlý) : " + arabalar[i].getYýl());
			System.out.println("Durumu : " + (arabalar[i].isDurumu() ? "Ikinci El" : "Sýfýr"));
			System.out.println("Rengi : " + arabalar[i].getRenk());
			System.out.println("\n");
		}
	}
}
