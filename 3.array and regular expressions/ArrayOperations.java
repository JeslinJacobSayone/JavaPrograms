import java.io.*;  

public class ArrayOperations{
	

	public static void main(String[] args){
		
		Console console= System.console();

		int a[]=new int[5];

		System.out.println("enter 5 integers that you like");

		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(console.readLine("enter number :"));
		}
		System.out.println("what would u like to do ??\n-------------------------\n(select corresponding number to menue )\n1.find largest element \n2.find sum\n3.print all elements");
		
		int input = Integer.parseInt(console.readLine("Enter input:"));
		int grt=a[0];
		switch(input){

			case 1: for(int i=1;i<5;i++)
					{
						if(a[i]>grt)
						{
							grt=a[i];
						}
					}

					System.out.println("greatest number is : "+grt);
					break;

			case 2:	int sum=0;
					for(int i=0;i<5;i++)
					{
						sum = sum+a[i];
					}

					System.out.println("sum is : "+sum);
					break;

			case 3: System.out.println("these are the elements of the array");
					for(int i=0;i<5;i++)
					{
						System.out.println(a[i]);
					}
					break;
			
			default: System.out.println("thanks for comming ");
		}
	

		
	}



}

