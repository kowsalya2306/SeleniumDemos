package comlao.constructors;

public class ParameterizedConstructor {
	String student_name;
	int rollno;
	int marks;
	
    ParameterizedConstructor(String name,int marks, int rollno){
    	student_name = name;
    	
    }
    
    public void sayAboutStudent() {
		System.out.println("Student name is "+student_name+" and rollno is "+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor student1 = new ParameterizedConstructor("kows",1,1 );
		student1.sayAboutStudent();
	}

}
