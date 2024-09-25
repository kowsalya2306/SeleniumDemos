package JavaAbstraction;

public class AbstractSubBenz extends AbstractMainCar {   
	
	@Override
	public void enginedesign() {
		System.out.println("Benz engine secret");
	}
	@Override
	public void companyvalut() {
		System.out.println("Benz company valt");
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//parent name ref = new classname
		AbstractMainCar car = new AbstractSubBenz();             //dynamic polymorphism
		car.enginedesign();
		car.companyvalut();

	}

}
