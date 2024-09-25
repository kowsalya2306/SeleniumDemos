package javaExceptions;

public class UncheckedExceptions {        //run time exception
	
	public void kows() {
		try{
			System.out.println("learning java is a problem") ;
			}
			catch (Exception e){
			System.out.println("arul prasath ji - dont worry I will be there for you ") ;
			}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedExceptions name = new UncheckedExceptions();
		name.kows();
		
	}

}
