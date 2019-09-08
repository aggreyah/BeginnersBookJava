package com.aggreyah.localvarexample;

public class LocalVarExample {
	
	String myVar = "Hey, I am an instance variable.";
	
	public void myMethod() {
		String myVar = "I am Local";
		System.out.println(myVar);
	}

	public static void main(String[] args) {
		LocalVarExample obj = new LocalVarExample();		
		System.out.println("Calling Method");
		obj.myMethod();
		System.out.println(obj.myVar);
	}

}
