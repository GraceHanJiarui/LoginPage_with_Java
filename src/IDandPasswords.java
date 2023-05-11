/* Group Members Name: GRACE HAN, Ada Zhang & Nina Zhang
 * Subject:            COMPUTER PROGRAMMING 12
 * Topic:     	       JAVA GUI FINAL ASSESSMENT - Part 2
 * Date:               June 15, 2022
 */
import java.util.HashMap;

public class IDandPasswords {
	
	//Store the user names and corresponding passwords
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Grace","1");
		logininfo.put("Bro","pizza");
		logininfo.put("Ada","1234");
		logininfo.put("Nina","abcd");
		logininfo.put("BroCode","123abc");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
