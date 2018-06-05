public class StringClasses{
	public static void main(String[] args) {

		String str="hello";
		StringBuilder builder = new StringBuilder("hello");
		StringBuffer buffer = new StringBuffer("hello");

		//str.concat will not work , becuase instead of appending it just returnes a concatinated string

		String newStr=str.concat("hai.....");

		//builder and buffer appends the new string to itself

		//not thread safe , faster than buffer
		builder.append("hai...");

		// thread safe , slower than builder
		buffer.append("hai..");

		System.out.println(newStr);
		System.out.println(builder);
		System.out.println(buffer);
	}	
}