import java.util.regex.*;
import java.io.*;

public class Validationworks{

	public static void main(String[] args) {

		String myemail;
		Pattern emailPattern = Pattern.compile("[a-zA-Z0-9[!#$%&'()*+,/-_.]]+@[a-zA-Z0-9[!#$%&'()*+,/-_]]+.[a-zA-Z0-9[!#$%&'()*+,/-_.]]+");

		Console console=System.console();

		myemail=console.readLine("enter your email address : ");
		Matcher m = emailPattern.matcher(myemail);
		if(m.matches())
			System.out.println(" correct email");
		else 
			System.out.println(" incorrect email"+m.matches());
				
		
	}
	
}