package ac.za.cput;

//import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class SignUpGUI extends JFrame implements ActionListener{
	
	private JPanel mainPanel,firstPanel,btnPanel,secondPanel,createAccPanel;
	private JLabel name,surname,studentNo,password,confirmPassword,cellNo;
	private JTextField nameTxt,surnameTxt,studentNoTxt,cellNoTxt;
	private JPasswordField passwordTxt,confirmPasswordTxt;
	private JButton createAccoBtn;
	@SuppressWarnings("rawtypes")
	private JComboBox courseBtn,codeBtn,classBtn;
	
	@SuppressWarnings("rawtypes")
	public SignUpGUI() {
		super("Sign Up");
		
		//creating objects
		mainPanel = new JPanel();
		firstPanel = new JPanel();
		btnPanel = new JPanel();
		secondPanel = new JPanel();
		createAccPanel = new JPanel();
		
		courseBtn = new JComboBox();
		courseBtn.setBounds(10, 100, 10, 20);
		
		codeBtn = new JComboBox();
		codeBtn.setBounds(30, 100, 10, 20);

		classBtn = new JComboBox();
		classBtn.setBounds(50, 100, 100, 20);

		createAccoBtn = new JButton("Create Account");
		classBtn.setBounds(50, 100, 100, 20);

		
		name = new JLabel("Name");
		nameTxt = new JTextField();
		
		surname = new JLabel("Surname");
		surnameTxt = new JTextField();
		
		studentNo = new JLabel("Student No");
		studentNoTxt = new JTextField();
		
		password = new JLabel("Password");
		passwordTxt = new JPasswordField();
		
		confirmPassword = new JLabel("Confirm Password");
		confirmPasswordTxt = new JPasswordField();
		
		cellNo = new JLabel("Cell No");
		cellNoTxt = new JTextField();
		
	}
	
	@SuppressWarnings("unchecked")
	public void setSignUpGui() {
		
		//first panel layout to accommodate name, surname, and student no using the grid layout 
		firstPanel.setLayout(new GridLayout(3,1)); // 3 rows and 1 column
		
		//first row
		firstPanel.add(name);
		firstPanel.add(nameTxt);
		
		//second row 
		firstPanel.add(surname);
		firstPanel.add(surnameTxt);
		
		//third row 
		firstPanel.add(studentNo);
		firstPanel.add(studentNoTxt);
		
		//button panel layout to accommodate the course, code, class buttons using the grid layout
		btnPanel.setLayout(new GridLayout(1,3)); // 1 row and 3 column
		
		//adding items to the course combo boxes
		courseBtn.addItem("Application Devevelopment");
		courseBtn.addItem("Communications Network");
		courseBtn.addItem("Mutlimedia Application Development");
		
		//adding items to the code combo boxes
		codeBtn.addItem("262S");
		codeBtn.addItem("261S");
		codeBtn.addItem("260S");
		
		//adding items to the class combo boxes
		classBtn.addItem("2A");
		classBtn.addItem("2B");
		classBtn.addItem("2C");
		classBtn.addItem("2D");
		classBtn.addItem("2E");
		classBtn.addItem("2F");
		classBtn.addItem("2G");
		classBtn.addItem("2H");
		classBtn.addItem("2I");
		classBtn.addItem("2J");
		classBtn.addItem("3A");
		classBtn.addItem("3B");
		classBtn.addItem("3C");
		classBtn.addItem("3D");
		classBtn.addItem("3D");
		classBtn.addItem("3E");
		classBtn.addItem("3O");
		classBtn.addItem("3P");
		classBtn.addItem("3Q");
		classBtn.addItem("3R");
		

		
		//adding button to the button panel
		btnPanel.add(courseBtn);
		btnPanel.add(codeBtn);
		btnPanel.add(classBtn);
		
		//second panel to accommodate the password and cell no using the grid layout 
		secondPanel.setLayout(new GridLayout(3,1)); // 2 rows and 1 column
		
		//first row
		secondPanel.add(password);
		secondPanel.add(passwordTxt);
		
		//second row
		secondPanel.add(confirmPassword);
		secondPanel.add(confirmPasswordTxt);
		
		//third row
		secondPanel.add(cellNo);
		secondPanel.add(cellNoTxt);
		
		
		//create account panel layout to accommodate the create account button
		createAccPanel.setLayout(new GridLayout(3,3)); // 1 row and 1 column
		
		//adding the button to the panel
		createAccPanel.add(createAccoBtn);
		
		//creating the main panel layout using the grid layout to accommodate all panels
		mainPanel.setLayout(new GridLayout(4,1)); //4 rows and 1 column
		
		//adding all panels to the Main panel
		mainPanel.add(firstPanel);
		mainPanel.add(btnPanel);
		mainPanel.add(secondPanel);
		mainPanel.add(createAccPanel);
		
		//adding the main panel which encompasses all panels to the frame
		this.add(mainPanel);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
