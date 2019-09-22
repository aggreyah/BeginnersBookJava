package com.aggreyah.innerclassdemo1;

public class InnerClassDemo1 {
	private int myOuterInt = 9;
	
	public void doStuff() {
		final String name = "Local var.";
		class InnerClass{
			public void seeOuter() {
				System.out.println("I see the outer class int: " + myOuterInt);
				System.out.println("I see the local string: " + name);
			}
		}
		InnerClass objInner = new InnerClass();
		objInner.seeOuter();
	}

	public static void main(String[] args) {
		InnerClassDemo1 obj0 = new InnerClassDemo1();
		obj0.doStuff();
	}

}
