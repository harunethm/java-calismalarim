package guiCalismasi;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;

public class Arayuz2 extends JFrame{
private static final long serialVersionUID = 1L;
	
	public int sayi_1;
	public int sayi_2;
	public int sonuc;
	public Arayuz2() {
		Frame fr = new Frame ("hello");
		fr.setLayout(new GridLayout(2,2));
		fr.add(new JLabel("Sayý 1 : ", 10));
		fr.add(new JTextField());
		fr.add(new JLabel("Sayý 2 : ", 10));
		fr.add(new JTextField());
		
		fr.setBounds(1000 ,1000, 4000, 3000);
		fr.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}