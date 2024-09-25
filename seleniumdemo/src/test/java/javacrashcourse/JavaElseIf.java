package javacrashcourse;

public class JavaElseIf {
	
	String whosthehero = "Dhanush";
	
	public void letsfindthehero() {
		if(whosthehero.equals("vijay")){
		System.out.println("Your thought is correct its vijay");          //if we use equalsignorecase method its doesn't check case
	}else if (whosthehero.equalsIgnoreCase("dhanush")) {
		System.out.println("Your thought is correct its dhanush");
	}else if (whosthehero.equals("Vikram")) {
		System.out.println("Your thought is correct its vikram");
	}else {
		System.out.println("sorry i con't guess");
	}
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaElseIf hero = new JavaElseIf();
		hero.letsfindthehero();
	}
  
}
