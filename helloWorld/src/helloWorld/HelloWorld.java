package helloWorld;

public class HelloWorld {

	public static void uyarýYap() {
		System.out.println("uyarýldýn");
	}
	
	
	public void gul() {
		System.out.println(":D");
	}
	
	public static void main(String args []){
		
		System.out.println("deneme");
		uyarýYap();
		HelloWorld hw = new HelloWorld();
		hw.gul();
		System.out.println("Birinci arg = "+args[0]+" ikinci arg = "+args[1]);
	}
}
