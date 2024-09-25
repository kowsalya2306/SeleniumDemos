//method overloading
package javaPolymorphism;
public class MainPolymorphism {
	                   //paramaters
      public void talk(SubParent talkingstyle) {             //method name will be same for all classes we can give different parameters
		System.out.println("Polite and respectfull");
	}
        
      public void talk(SubPartner talkingstyle) {
		System.out.println("love and care");
	}
      
      public void talk(Boss talkingstyle) {
		System.out.println("Business matters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainPolymorphism talk = new MainPolymorphism();
		SubParent parent = new SubParent();
	    talk.talk(parent);
        
		MainPolymorphism talk1 = new MainPolymorphism();
	    SubPartner partner = new SubPartner();
	    talk.talk(partner);
	    

		MainPolymorphism talk2 = new MainPolymorphism();
	    Boss boss = new Boss();
	    talk.talk(boss);
		
		
	}

}
