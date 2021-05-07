
public class zaman {
	int saat;
	int dakika;
	int saniye;
	
	void ilerle() {
		saniye++;
		if(saniye == 60) {
			saniye = 0;
			dakika++;
			if(dakika==60) {
				dakika = 0;
				saat++;
					if(saat==24) {
						saat = 0;
					}}}
	}
	void zamaniYaz() {
		System.out.println("Zaman : "+saat+":"+dakika+":"+saniye);
	}
public static void main(String[] args) {
	zaman zamanNesnesi = new zaman();
	zamanNesnesi.ilerle();
	zamanNesnesi.ilerle();
	zamanNesnesi.ilerle();
	zamanNesnesi.ilerle();
	zamanNesnesi.ilerle();
	zamanNesnesi.zamaniYaz();
	zamanNesnesi.ilerle();
	zamanNesnesi.zamaniYaz();
	zaman zamanNesnesi2 = new zaman();
	zamanNesnesi2.ilerle();
	zamanNesnesi2.zamaniYaz();
}}