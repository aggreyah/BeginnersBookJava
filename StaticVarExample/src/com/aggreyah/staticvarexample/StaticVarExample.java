package com.aggreyah.staticvarexample;

public class StaticVarExample {
	public static String classVar = "Class or Static Variable";

	public static void main(String[] args) {
		// Creating objects of the class.
		StaticVarExample obj0 = new StaticVarExample();
		StaticVarExample obj1 = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		// All three will display the class or static variable.
		System.out.println(obj0.classVar);
		System.out.println(obj1.classVar);
		System.out.println(obj2.classVar);
		// Change the classVar values using one of the class objects.
		obj2.classVar = "Changed Static Var Value.";
		// Let's see what is displayed by all three.
		System.out.println(obj0.classVar);
		System.out.println(obj1.classVar);
		System.out.println(obj2.classVar);
		// Direct access
		System.out.println("Direct access");
		System.out.println(classVar);
	}

}
