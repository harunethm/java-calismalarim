package nesneyeYonelikProgramlamaCalismasi;

public class Araba {
	private Kisi aracSahibi = null;
	private String plaka = "";
	private String marka = "";
	private int yýl = 0;
	private boolean durumu = false;
	private String renk = "";
	
	public Araba(Kisi aracSahibi, String plaka, String marka, int yýl, boolean durumu, String renk) {
		super();
		this.aracSahibi = aracSahibi;
		this.plaka = plaka;
		this.marka = marka;
		this.yýl = yýl;
		this.durumu = durumu;
		this.renk = renk;
	}
	public Kisi getAracSahibi() {
		return aracSahibi;
	}
	public void setAracSahibi(Kisi aracSahibi) {
		this.aracSahibi = aracSahibi;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getYýl() {
		return yýl;
	}
	public void setYýl(int yýl) {
		this.yýl = yýl;
	}
	public boolean isDurumu() {
		return durumu;
	}
	public void setDurumu(boolean durumu) {
		this.durumu = durumu;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
}
