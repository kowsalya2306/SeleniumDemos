package javaPolymorphism;

public class SonOverriding extends ParentOverriding{
	
	@Override
	public void Marriage() {
		System.out.println("My marriage my rules");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentOverriding son = new SonOverriding();               //dynamic
		son.properties();
		son.Marriage(); 

	}

}
