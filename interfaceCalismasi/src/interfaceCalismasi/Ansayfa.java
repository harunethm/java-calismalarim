package interfaceCalismasi;

interface i_1 {
	interface i_2 {
		public void metod_2();
	}
	public void metod_1();
}

class c_1 implements i_1.i_2 {
	public void metod_2() {
		System.out.println("c_1, m_2");
	}
	/*
	public void metod_1() {
		System.out.println("c_1, m_1");
	}*/
}

class c_2 implements i_1 {
	public void metod_1() {
		System.out.println("c_2, m_1");
	}
}

public class Ansayfa {
	public static void main(String[] args) {
		c_1 a = new c_1();
		c_2 b = new c_2();
		//a.metod_1();
		a.metod_2();
		b.metod_1();
	}
}
