package nesneyeYonelikProgramlamaCalismasi;

public class Kisi {
	private String isim = "";
	private String cinsiyet = "";
	private int yas = 0;
	
	public Kisi(String isim, String cinsiyet, int yas) {
		super();
		this.isim = isim;
		this.cinsiyet = cinsiyet;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
