import java.io.Console;

public class SwitchMenue{


	public static void main(String args[]){
		System.out.println("here is a menue for you\n-----------------------\n(select corresponding number to menue )\n1.burger\n2.sandwitch\n3.biriyani\n4.meals\n5.none");
		
		Console console = System.console();
		int input = Integer.parseInt(console.readLine("Enter input:"));
		
		switch(input){
			case 1: System.out.println("thanks for choosing burger");
					break;

			case 2: System.out.println("thanks for choosing sandwitch");
					break;

			case 3: System.out.println("thanks for choosing biriyani");
					break;

			case 4: System.out.println("thanks for choosing meals");
					break;
					
			default: System.out.println("thanks for comming ");
		}
	
	}
}