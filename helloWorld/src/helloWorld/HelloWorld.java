package helloWorld;

public class HelloWorld {

	public static void uyar�Yap() {
		System.out.println("uyar�ld�n");
	}
	
	
	public void gul() {
		System.out.println(":D");
	}
	
	public static void main(String args []){
		
		System.out.println("deneme");
		uyar�Yap();
		HelloWorld hw = new HelloWorld();
		hw.gul();
		System.out.println("Birinci arg = "+args[0]+" ikinci arg = "+args[1]);
	}
}
