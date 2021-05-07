public class kisi {
	private String id;
	private String ad;
	private int yas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}

	public void goster(){
		System.out.println("Kiþinin id'si : " + id + "\nKiþinin adý : " + ad + "\nKiþinin yaþý : " + yas);
	}
	
	public void yasKontrol() {
		
	}
}
