package javaExceptions;

public class UncheckedFinally {
	public static  int dummy() {
		return 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			System.out.println("try block");
			/*    if one is throwing exception in try block it will move to catch block
			 * System.out.println(2/0); System.out.println("After execution"); throw new
			 * Exception();
			 */
		} catch (Exception e) {  // there is any execution then only catch block executes else only try block execte
			// TODO: handle exception
			System.out.println("catch block");
		}
		
		finally {
			System.out.println("finally");
		}

	}

}
