package ilkProgram;

public class ilkProgram {
	
	public static void main() {
		for(int i = 0; i < 10; i++) {
			if(i==5)
				continue;
			System.out.println("i = "+i);
		}
		System.out.println("donguden cikildi.");		
	}
}