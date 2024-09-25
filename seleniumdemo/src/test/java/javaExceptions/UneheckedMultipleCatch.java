package javaExceptions;

public class UneheckedMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int number = 0;
			int number2 = 6;
			System.out.println(number2/number);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Operation is correct");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Operation is wrong");
			
		}
		
	

	}

}
