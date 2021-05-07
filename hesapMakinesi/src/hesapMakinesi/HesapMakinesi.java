package hesapMakinesi;

public class HesapMakinesi {

	public static void main(String[] args) {
		protected Shell shell;
		private Text txt_1;
		private Text txt_2;

		public static void main(String[] args) {
			try {
				hesapla window = new hesapla();
				window.open();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void open() {
			Display display = Display.getDefault();
			createContents();
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}

		protected void createContents() {
			shell = new Shell();
			shell.setSize(600, 300);
			shell.setText("Hesap Makinesi");
			
			txt_1 = new Text(shell, SWT.BORDER);
			txt_1.setBounds(105, 46, 76, 21);
			
			txt_2 = new Text(shell, SWT.BORDER);
			txt_2.setBounds(105, 88, 76, 21);
			
			Button btnRadioButton = new Button(shell, SWT.RADIO);
			btnRadioButton.setBounds(10, 136, 90, 16);
			btnRadioButton.setText("topla");
			
			Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
			btnRadioButton_1.setBounds(105, 136, 90, 16);
			btnRadioButton_1.setText("çýkar");
			
			Button btnRadioButton_2 = new Button(shell, SWT.RADIO);
			btnRadioButton_2.setBounds(201, 136, 90, 16);
			btnRadioButton_2.setText("çarp");
			
			Button btnRadioButton_3 = new Button(shell, SWT.RADIO);
			btnRadioButton_3.setBounds(297, 136, 90, 16);
			btnRadioButton_3.setText("böl");
			
			CLabel label_1 = new CLabel(shell, SWT.NONE);
			label_1.setBounds(10, 46, 61, 21);
			label_1.setText("sayý 1");
			
			CLabel label_2 = new CLabel(shell, SWT.NONE);
			label_2.setBounds(10, 88, 61, 21);
			label_2.setText("sayý 2");
			
			CLabel label_sonuc = new CLabel(shell, SWT.NONE);
			label_sonuc.setBounds(10, 230, 61, 21);
			label_sonuc.setText("sonuc");
			
			Button btnNewButton = new Button(shell, SWT.NONE);
			btnNewButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					String sayý_1_s = txt_1.getText();
					String sayý_2_s = txt_2.getText();
					if(btnRadioButton.getSelection())
						label_sonuc.setText(sayý_1_s + sayý_2_s);
				}
			});
			btnNewButton.setSelection(true);
			btnNewButton.setBounds(10, 178, 75, 25);
			btnNewButton.setText("Hesapla");

	}

}
