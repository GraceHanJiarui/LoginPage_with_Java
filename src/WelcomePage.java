/* Group Members Name: GRACE HAN, Ada Zhang & Nina Zhang
 * Subject:            COMPUTER PROGRAMMING 12
 * Topic:     	       JAVA GUI FINAL ASSESSMENT - Part 4
 * Date:               June 15, 2022
 */
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	//initialization
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	JLabel nextLine = new JLabel();
	ImageIcon i = new ImageIcon("routineIcon1.png");
	JLabel l = new JLabel();
	
	//set the appearance of the welcome page
	WelcomePage(String userID, int userNumber){
		welcomeLabel.setBounds(30,0,800,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,16));
		welcomeLabel.setText("Hello! " +userID+"! Your age is "+ userNumber+" !");
		nextLine.setBounds(200,40,800,35);
		nextLine.setFont(new Font("Times New Roman",Font.PLAIN,10));
		nextLine.setText("This project belongs to Grace, Nina and Ada.");
		//set the image
		l.setIcon(i);
		l.setBounds(30,80,300,300);
		
		//add all the components to the page
		frame.add(welcomeLabel);
		frame.add(nextLine);
		frame.add(l);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
