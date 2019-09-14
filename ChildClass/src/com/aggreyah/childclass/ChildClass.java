package com.aggreyah.childclass;

class ParentClass{
	public ParentClass() {
		System.out.println("In Parent Class");
	}
}

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		System.out.println("In Child Class");
	}

	public static void main(String[] args) {
		new ChildClass();
	}

}
