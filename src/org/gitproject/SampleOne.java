package org.gitproject;

public class SampleOne {
	
	public void empName() {
		
		System.out.println("anand");
	}
	
	public void empMobno() {
		
		System.out.println("8939278836");
	}
	private void empOffice() {
		System.out.println("OMR");
	}
	private void empBike() {
		
		System.out.println("jawa");
	}
//<<<<<<< HEAD
	
private void empAdd() {
		
		System.out.println("OMR, Greens");
}
//=======
	
//>>>>>>> 0bb75e661ac86932eb864e720a5e9cffe8b581a1
	
		
public static void main(String[] args) {
		
	SampleOne s = new SampleOne();
	
	s.empName();
	s.empMobno();
}

}
