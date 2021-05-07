package classlarlaCalisma;

import java.util.Date;

public class Anasayfa {

	class kisi{
		private String isim;
		private Integer yas;
		private Boolean cinsiyet;
		
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public Integer getYas() {
			return yas;
		}
		public void setYas(Integer yas) {
			this.yas = yas;
		}
		public Boolean getCinsiyet() {
			return cinsiyet;
		}
		public void setCinsiyet(Boolean cinsiyet) {
			this.cinsiyet = cinsiyet;
		}
	}
	
	class araba{
		public araba() {
			
		}
		String plaka;
		String sahibi;
		Date uretimYili;
		Boolean durum;
		String renk;
		String marka;
	}
	
	class arabaSahiplik {
		public araba[] arabalar = new araba[20];
		
		public void ekle() {
			
		}
		public void plakaKontrol() {
			
		}
		public int yuzdelikBulma() {
			int yuzde = 0;
			
			
			
			return yuzde;
		}
		public void listele() {
			
		}
	}
	
	public int main(String[] args) {
		araba a1 = new araba();
		arabaSahiplik as = new arabaSahiplik();
		String plaka= "61ae389";
		a1.plaka = plaka;
		System.out.println(a1.plaka);
		as.yuzdelikBulma();
		return 1;
	}

}
