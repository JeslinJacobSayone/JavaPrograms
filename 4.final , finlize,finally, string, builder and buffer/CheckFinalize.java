class Finalizedemo{
	
	public void finalize()	throws Throwable{
		System.out.println("object is destroyed");
	}
}
public class CheckFinalize{
	public static void main(String[] args) {

		try{
			final int i=9;
		System.out.println("object is prepared and the value of our final variable is :"+i);
		Finalizedemo demo= new Finalizedemo();
		demo=null;
		System.gc();
		}
		catch(Exception e)
		{
			System.out.println("there is an exception");
		}
		finally{
			System.out.println("finally should work no matter how");
		}
		
	}
}	