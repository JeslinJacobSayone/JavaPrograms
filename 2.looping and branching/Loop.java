public class Loop{

	public static void main( String args[]){

		for (int i=0;i<10;i++){
			if(i==7)
			{
				System.out.println("reached break on i=7, counting stopped");
				break;
			}
			System.out.println("the value of i is ="+i);
		}
	}
}