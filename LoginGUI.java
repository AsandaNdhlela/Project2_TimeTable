package ac.za.cput;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class LoginGUI extends JFrame implements ActionListener{
	
	private JPanel mainPanel, loginDetailsPanel, loginBtnPanel;
	private JButton forgotBtn, LoginBtn;
	private JLabel studentNo, password;
	private JTextField studentNoTxt;
	private JPasswordField passwordTxt;
	
	public LoginGUI() {
		super("Login");
		
		mainPanel = new JPanel();
		loginDetailsPanel = new JPanel();
		loginBtnPanel = new JPanel();
		
		studentNo = new JLabel("Student No");
		password = new JLabel("Password");
		
		studentNoTxt = new JTextField();
		passwordTxt = new JPasswordField();
		
		forgotBtn = new JButton("Forgot Password");
		LoginBtn = new JButton("Login");
		
	}
	
	public void setLoginGUI() {
		//setting the layout of the main panel to accommodate all panels using the grid layout
		mainPanel.setLayout(new GridLayout(2,1)); //2 rows and 1 column
		
		//setting the panel to accommodate the Login details using the Grid Layout 
		loginDetailsPanel.setLayout(new GridLayout(2,1));// 2 rows and 1 column
		
		//adding Labels and text fields to the login details panel
		loginDetailsPanel.add(studentNo);
		loginDetailsPanel.add(studentNoTxt);
		
		loginDetailsPanel.add(password);
		loginDetailsPanel.add(passwordTxt);
		
		//setting the loginBtnPanel layout to accommodate the forgot button and login button
		loginBtnPanel.setLayout(new GridLayout(1,2)); //2 row and 1 columns
		
		//adding the forgot password button and login button to the loginBtnPanel
		loginBtnPanel.add(LoginBtn);
		loginBtnPanel.add(forgotBtn);
		
		//adding the loginDetailsPanel and loginBtnPanel to the Main Panel
		this.add(loginDetailsPanel, BorderLayout.CENTER);
		this.add(loginBtnPanel, BorderLayout.SOUTH);
		
		//adding the Main Panel to the frame
//		this.add(mainPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
