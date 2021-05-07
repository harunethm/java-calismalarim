package soyutProgramlamaCalismasi2;

public class anasayfa {

	public static void main(String[] args) {
		direktTopla b = new direktTopla();
		System.out.println("b.deger : " + b.deger);
		b.deger = 30;
		System.out.println("b.deger : " + b.deger);
		
		toplaminIkiKati c = new toplaminIkiKati();
		ikiserKatlarinToplami d = new ikiserKatlarinToplami();
		System.out.println("c.deger : " + c.deger);
		System.out.println("d.deger : " + d.deger);
		c.deger = -20;
		System.out.println("c.deger : " + c.deger);
		System.out.println("d.deger : " + d.deger);
		
		System.out.println("b.topla(b.deger, c.deger) : " + b.topla(b.deger, c.deger));
		System.out.println("c.topla(b.deger, c.deger) : " + c.topla(b.deger, c.deger));
		System.out.println("d.toplama(b.deger, c.deger) : " + d.toplama(b.deger, c.deger));
	}

}
