package guiCalismasi;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

public class Arayuz1 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public double sonuc = 0;
	public Arayuz1() {
		super("form");
		Container container = getContentPane();
		container.setLayout(new GridLayout(2, 2));
		container.add(new JLabel("Sayý 1 : "));
		container.add(new JTextField());
		//Container container_2 = getContentPane();
		//container_2.setLayout(new GridLayout(1, 2));
		container.add(new JLabel("Sayý 2 : "));
		container.add(new JTextField());
		
		Container container_3 = getContentPane();
		container_3.setLayout(new GridLayout(1, 4));
		container_3.add(new JRadioButton("Toplama"));
		container_3.add(new JRadioButton("Çýkarma"));
		container_3.add(new JRadioButton("Çarpma"));
		container_3.add(new JRadioButton("Bölme"));
		Container container_4 = getContentPane();
		container_4.add(new JButton("Hesapla"));
		Container container_5 = getContentPane();
		container_5.add(new JLabel("Sonuç : " + this.sonuc));
		setVisible(true);
		setSize(3000, 3000);
	}
}
