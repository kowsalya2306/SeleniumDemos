package JavaAbstraction;

public class AbstractSubBMW extends AbstractMainCar{
	
	@Override
	public void enginedesign() {
		System.out.println("BMW engine secret");
	}
	@Override
	public void companyvalut() {
		System.out.println("BMW company valt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractMainCar car = new AbstractSubBMW();             //dynamic method
		car.enginedesign();
		car.companyvalut();


	}

}
