public class string1 {
	public static void main(String[] args)
	{
		String str1 = new String("Ahmet");
		String str2 = new String("Ali");
		
		str1 = str2;
		
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = "Hasan";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1);
	}

}
