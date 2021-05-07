public class calisan extends kisi{
	
	public calisan(String id, String ad, int yas) {
		super.setId(id);
		super.setAd(ad);
		super.setYas(yas);
	}

	public void yasKontrol() {
		if(super.getYas() < 16)
			System.out.println("Kişi Çalışan OLAMAZ !!!");
	}

	
}
