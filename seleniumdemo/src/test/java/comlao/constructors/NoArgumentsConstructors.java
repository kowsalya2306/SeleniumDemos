package comlao.constructors;

public class NoArgumentsConstructors {
	String student_name;
	int rollno;
	int marks;
 
	NoArgumentsConstructors(){              //constructor name and class name are same
		student_name = "kows";
		rollno = 1;
		System.out.println("student object is created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoArgumentsConstructors student = new NoArgumentsConstructors();           //object
		System.out.println(student.student_name);

	}

}
