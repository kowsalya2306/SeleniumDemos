package javacrashcourse;

public class JavaSample {
	
	Long AccountNumber =1234567890l;                                 //datas
	
	String HolderName = "kows";
	
	Integer  AccountBalance = 400;
	
	public void getbalance() {                                         //userdefined method
		System.out.println("Balance is" + AccountBalance);
	}

	public static void main(String[] args) {	                         //buildin method
		//classname objectname = new classname
		
	    JavaSample account = new JavaSample();
	    account.getbalance();
		

	}

}
