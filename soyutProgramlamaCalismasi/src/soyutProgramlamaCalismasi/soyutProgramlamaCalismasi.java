package soyutProgramlamaCalismasi;

interface matsabitleri {
	double PI = 3.14;
}

public class soyutProgramlamaCalismasi implements matsabitleri {

	private static double yaricap = 6.0;
	
	public static double dairecevresihesapla() {
		return 2 * PI  * yaricap;
	}
	
	public static void main(String[] args) {
		
		System.out.println(dairecevresihesapla());
		
		int a = 3, b =2, c;
		c = ++a*b--/3*5*a-2*b+(4)*a--;
		System.out.println(c);
	}

}