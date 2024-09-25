package javacrashcourse;

public class JavaStatic {
     
	static int accountnumber;
	static String accountname;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          JavaStatic object1 = new JavaStatic();
          object1.accountnumber=3000;
          object1.accountname="kows";
          
          JavaStatic object2 = new JavaStatic();
          object2.accountnumber=2000;
          object2.accountname="charu";
          
          
          System.out.println("Account number is " +object1.accountnumber);
          System.out.println("Account number is " +object1.accountname);
          System.out.println("Account number is " +object2.accountnumber);
          System.out.println("Account number is " +object2.accountname);
	}

}
