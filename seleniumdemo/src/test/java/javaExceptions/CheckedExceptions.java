package javaExceptions;

public class CheckedExceptions {            //compile time exception
	
	static String name = "kows";            

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "kows";

		
        System.out.println(name);
	}
	
	/*
	 * we give string ouside of the main method it will throw error we need to add
	 * static in outside and also we give string ininside the class no need to add
	 * static specificlly if the erroe throws outside class without static called
	 * compile error or checked error
	 */

}
