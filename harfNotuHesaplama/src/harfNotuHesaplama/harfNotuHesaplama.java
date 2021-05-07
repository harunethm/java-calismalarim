package harfNotuHesaplama;
import java.util.Scanner;

public class harfNotuHesaplama {
	//x,0 ad, x,1 cinsiyet, x,2 vize1, x,3 vize2 
	static String[][] ogrenciBilgileri = new String[100][4];
	static int ogrenciSayisi = 0;
	
	public static boolean ogrenciBilgileriEkle(String ad, String cinsiyet, float vize1, float vize2) {
		try {
			ogrenciBilgileri[ogrenciSayisi][0] = ad;
			ogrenciBilgileri[ogrenciSayisi][1] = cinsiyet;
			ogrenciBilgileri[ogrenciSayisi][2] = vize1 + "";
			ogrenciBilgileri[ogrenciSayisi][3] = vize2 + "";
			ogrenciSayisi++;
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public static float ortHesapla(int vizeNo) {
		float ort = 0;
		int i = 0;
		try {
			for(i = 0; i < ogrenciSayisi;)	{
				ort += Float.valueOf(ogrenciBilgileri[i][vizeNo + 1]).floatValue();
				i++;
			}
			return ort / i;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public static void ortalamaUstuOgrenciAdlariListele() {
		float v1ort = ortHesapla(1);
		float v2ort = ortHesapla(2);
		
		try {
			int i = 0;
			while(i < ogrenciSayisi){
				if(Float.valueOf(ogrenciBilgileri[i][2]).floatValue() > v1ort && 
						Float.valueOf(ogrenciBilgileri[i][3]).floatValue() > v2ort) {
					System.out.println(ogrenciBilgileri[i][0]);
				}
				i++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static int farkliIsimSayisi() {
		int farkliIsimSayisi = ogrenciSayisi;
		for(int i = 0; i < ogrenciSayisi; i++) {
			for(int j = i + 1; j < ogrenciSayisi; j++) {
				if(ogrenciBilgileri[i][0] == ogrenciBilgileri[j][0])
					farkliIsimSayisi--;
			}
		}
		return farkliIsimSayisi;
	}
	
	public static String genelHarfNotuBelirle(int id) {
		float vize1 = Float.valueOf(ogrenciBilgileri[id][2]).floatValue();
		float vize2 = Float.valueOf(ogrenciBilgileri[id][3]).floatValue();
		float genelNot = (float) ((vize1 * 0.3) + (vize2 * 0.7));
		
		if(genelNot >= 85) {
			return "AA";
		}
		else if(genelNot <= 84 && genelNot >= 80) {
			return "BA";
		}
		else if(genelNot <= 79 && genelNot >= 75) {
			return "BB";
		}
		else if(genelNot <= 74 && genelNot >= 70) {
			return "CB";
		}
		else if(genelNot <= 69 && genelNot >= 65) {
			return "CC";
		}
		else if(genelNot <= 64 && genelNot >= 60) {
			return "DC";
		}
		else if(genelNot <= 59 && genelNot >= 50) {
			return "DD";
		}
		else if(genelNot <= 49) {
			return "FF";
		}
		else {
			return "";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//tek tek girmemek için
		ogrenciBilgileri[0][0] = "harun";
		ogrenciBilgileri[0][1] = "e";
		ogrenciBilgileri[0][2] = "88";
		ogrenciBilgileri[0][3] = "99";
		
		ogrenciBilgileri[1][0] = "ethem";
		ogrenciBilgileri[1][1] = "e";
		ogrenciBilgileri[1][2] = "88";
		ogrenciBilgileri[1][3] = "99";
		
		ogrenciBilgileri[2][0] = "anýl";
		ogrenciBilgileri[2][1] = "e";
		ogrenciBilgileri[2][2] = "100";
		ogrenciBilgileri[2][3] = "100";
		
		ogrenciBilgileri[3][0] = "berk";
		ogrenciBilgileri[3][1] = "e";
		ogrenciBilgileri[3][2] = "88";
		ogrenciBilgileri[3][3] = "99";
		
		ogrenciBilgileri[4][0] = "mert";
		ogrenciBilgileri[4][1] = "e";
		ogrenciBilgileri[4][2] = "10";
		ogrenciBilgileri[4][3] = "20";
		
		for (int i = 0; i < 5; i++) {
			try {
				/* tek tek girmek için yorumu kaldýrýn
				System.out.println("Ogrenci " + (i + 1) + " ad : ");
				String ad = sc.nextLine();
				System.out.println("Ogrenci " + (i + 1) + " cinsiyet (e-k) : ");
				String cinsiyet = sc.nextLine();
				System.out.println("Ogrenci " + (i + 1) + " vize 1 : ");
				Float vize1 = Float.valueOf(sc.nextLine());
				System.out.println("Ogrenci " + (i + 1) + " vize 2 : ");
				Float vize2 = Float.valueOf(sc.nextLine());
				if(!cinsiyet.equals("e") && !cinsiyet.equals("k"))
					throw new Exception("Yanlýþ cinsiyet girdisi.");
				if(vize1 > 100 || vize1 < 0 || vize2 < 0 || vize2 > 100)
					throw new Exception("Yanlýþ vize notu girdisi.");
				ogrenciBilgileriEkle(ad, cinsiyet, vize1, vize2);*/
				
				ogrenciBilgileriEkle(ogrenciBilgileri[i][0], 
						ogrenciBilgileri[i][1], 
						Float.valueOf(ogrenciBilgileri[i][2]),
						Float.valueOf(ogrenciBilgileri[i][3]));
				
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("Lütfen bilgileri doðru giriniz.");
				i--;
			}
		}
		sc.close();
		System.out.println("Ortalama üstü notu olanlar : ");
		ortalamaUstuOgrenciAdlariListele();
		
		System.out.print("Farklý isim sayýsý : ");
		System.out.println(farkliIsimSayisi());
		
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print(ogrenciBilgileri[i][0] + " adlý öðrencinin harf notu : ");
			System.out.println(genelHarfNotuBelirle(i) + "\n");
		}
	}

}