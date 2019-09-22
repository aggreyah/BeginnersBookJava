package com.aggreyah.innerclassdemo;

public class InnerClassDemo {
	private int myOuterVar = 7;
	
	class AnInnerClass{
		public void seeOuter() {
			System.out.println("I can see the private of outer: " + myOuterVar);
		}
	}

	public static void main(String[] args) {
		InnerClassDemo.AnInnerClass inner = new InnerClassDemo().new AnInnerClass();
		inner.seeOuter();
	}

}
