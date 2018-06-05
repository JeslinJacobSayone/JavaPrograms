public class Foreachtry{
	
	 public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,4,2};
		int grt=0;
		for(int element:a)
		{
			if(element>grt)
				grt=element;
		}
		System.out.println("greatest number is : "+grt);
	}
}