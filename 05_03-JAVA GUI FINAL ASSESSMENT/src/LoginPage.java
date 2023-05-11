/* Group Members Name: GRACE HAN, Ada Zhang & Nina Zhang
 * Subject:            COMPUTER PROGRAMMING 12
 * Topic:     	       JAVA GUI FINAL ASSESSMENT - Part 3
 * Date:               June 15, 2022
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LoginPage implements ActionListener, ChangeListener{
	
	//initialization
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel userNumber = new JLabel("your age:");
	JLabel messageLabel = new JLabel();
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	JPanel p = new JPanel();
	JLabel l = new JLabel("ghwi");
	JSlider s2 = new JSlider(0,90,18);
	
	LoginPage(HashMap<String,String> LoginInfoOriginal){
		logininfo = LoginInfoOriginal;
		
		//set the appearance of the text area
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		userNumber.setBounds(50,200,75,25);
		
		messageLabel.setBounds(125,280,250,35);
		messageLabel.setFont(new Font("Times New Roman",Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		p.setBounds(100,200,250,80);
		l.setFont(new Font("MV Boli",Font.PLAIN,12));
		
		//set the appearance of the slider
		s2.setPreferredSize(new Dimension(220,50));
		s2.setPaintTicks(true);
		s2.setMinorTickSpacing(5);
		s2.setPaintTrack(true);
		s2.setMajorTickSpacing(10);
		s2.setPaintLabels(true);
		s2.setFont(new Font("MV Boli",Font.PLAIN,10));
		s2.setOrientation(SwingConstants.HORIZONTAL);
		
		l.setText("age = "+s2.getValue());
		
		s2.addChangeListener(this);
		
		//set the appearance of the buttons
		loginButton.setBounds(125,320,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,320,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		resetButton.setBackground(new Color(101010));
		
		p.add(s2);
		p.add(l);
		
		//add all components to the page
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(userNumber);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(p);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	//logic of how the number changes when the slider changes
	public void stateChanged(ChangeEvent e) {
//		 TODO Auto-generated method stub
		l.setText("age = "+s2.getValue());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//reset all the data
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
			s2.setValue(18);
		}
		
		//when the user clicks on the login button
		if(e.getSource()==loginButton) {
			String userID = userIDField.getText();
			int userAge = s2.getValue();
			String password = String.valueOf(userPasswordField.getPassword());
			
			//Query the user name entered by the user if any
			if(logininfo.containsKey(userID)) {
				
				//If the user enters the correct corresponding password, navigate the user to the welcome page.
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userID,userAge);
				}
				
				//If the user enters the wrong password, show "wrong password".
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password");
				}
			}
			
			//If the usesr name is not stored, show "Username not found".
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username Not Found");
			}
		}
	}
}
