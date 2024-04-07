package ac.za.cput;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainLogin {

	public static void main(String[] args) {
		LoginGUI login = new LoginGUI();

		login.pack();
		login.setSize(300,100);
		login.setDefaultCloseOperation(EXIT_ON_CLOSE);
		login.setLoginGUI();
		login.setVisible(true);

	}

}
