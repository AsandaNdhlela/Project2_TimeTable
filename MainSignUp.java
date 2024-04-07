package ac.za.cput;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainSignUp {


	public static void main(String[] args) {
		SignUpGUI signUp = new SignUpGUI();
		
		signUp.pack();
		signUp.setSize(400,500);
		signUp.setDefaultCloseOperation(EXIT_ON_CLOSE);
		signUp.setSignUpGui();
		signUp.setVisible(true);
	}

}
