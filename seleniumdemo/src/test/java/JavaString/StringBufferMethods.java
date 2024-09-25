package JavaString;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name1 = new StringBuffer("swok");               //new keyword
		
		
		//StringBufferMethods
		//reverse
		System.out.println("Reverse name: "+name1.reverse());
		
        //replace
		System.out.println("Replace name: "+name1.replace(0,3,"alya" ));
		
		//delete
		System.out.println("delete:" +name1.delete(0, 1));
		
		//Insert
		System.out.println("insert:" +name1.insert(0, "charu"));
		
		//capacity
		System.out.println(name1.capacity());
		
		//like string we have charAt,Substring,Length methods as well
		
		
		
	}

}
