package javacrashcourse;

public class JavaSwitch {
	
	String herotamil = "vikram";
	
	public void letsfindthehero() {
		switch (herotamil) {
		case "vijay":
			System.out.println("yes its vijay");
			break;
		case "surya":
			System.out.println("yes its surya");
			break;
		case "vikram":
			System.out.println("yes its vikram");
			break;
		default:
			System.out.println("jeyamravi is a super hero");
			break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaSwitch hero = new JavaSwitch();
		hero.letsfindthehero();

	}

}
