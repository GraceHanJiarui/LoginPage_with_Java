/* Group Members Name: GRACE HAN, Ada Zhang & Nina Zhang
 * Subject:            COMPUTER PROGRAMMING 12
 * Topic:     	       JAVA GUI FINAL ASSESSMENT - Part 1
 * Date:               June 15, 2022
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDandPasswords IDandP = new IDandPasswords();
		
		LoginPage loginPage = new LoginPage(IDandP.getLoginInfo());
	}
}