package SeleniumTestNG;

import org.testng.annotations.Test;

public class TestNGGrouping {
	
	/*
	 scenario:A big basket is having different kind of mobiles
	 Let us say they are MOTO,VIVO,Apple phones and Lenovo
	 I want to run for only MOTO and VIVO phones.write a program for that
	 */
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple phone");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple phone");
	}
	
	@Test(groups = {"MOTO"})
	public void MOTO1() {
		System.out.println("moto phone");
	}
	@Test(groups = {"MOTO"})
	public void MOTO2() {
		System.out.println("moto phone");
	}
	@Test(groups = {"VIVO"})
	public void VIVO1() {
		System.out.println("Vivo phone");
	}
	@Test(groups = {"VIVO"})
	public void VIVO2() {
		System.out.println("Vivo phone");
	}
	@Test(groups = {"LENOVO"})
	public void Lenovo1() {
		System.out.println("lenovo phone");
	}
	@Test(groups = {"LENOVO"})
	public void Lenovo2() {
		System.out.println("lenovo phone");
	}
	

}
