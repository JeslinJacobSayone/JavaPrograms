import java.io.*;  

public class StringTest{
	
	public static void findlarge(String in1,String in2){
		 	if(in1.length()>in2.length())
		 		System.out.println("1st string is bigger ");
		 	else
		 		System.out.println("2st string is bigger ");
		 		
		 }
	public static void main(String[] args){
		
		Console console= System.console();

		String input1=console.readLine("enter any string : ");

		String input2=console.readLine("again enter any string : ");

		System.out.println("what would u like to do ??\n-------------------------\n(select corresponding number to menue )\n1.find which string is larger \n2.Concatinate both string\n3.to lower case");
		
		int input = Integer.parseInt(console.readLine("Enter input:"));
		
		switch(input){
			case 1: findlarge(input1,input2);
					break;

			case 2:	System.out.println("The concatinated string is :"+input1.concat(input2));
					break;

			case 3: System.out.println("lower case strings are : "+input1.toLowerCase()+" and "+input2.toLowerCase());
					break;
			
			default: System.out.println("thanks for comming ");
		}
	

		
	}



}

