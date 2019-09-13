package com.aggreyah.encapsualtionexample;

class EmployeeCount{
	private int numOfEmployees = 0;
	// Setter method.
	public void setNumOfEmployees(int count) {
		this.numOfEmployees = count;
	}
	// Getter Method.
	public int getNumOfEmployees() {
		return numOfEmployees;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		EmployeeCount obj0 = new EmployeeCount();
		obj0.setNumOfEmployees(5613);
		System.out.println("No. of Employees: " + obj0.getNumOfEmployees());
	}

}
