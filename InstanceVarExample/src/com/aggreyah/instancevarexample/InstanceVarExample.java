package com.aggreyah.instancevarexample;

public class InstanceVarExample {
	String instanceVar = "Look, I am an instance variable.";

	public static void main(String[] args) {
		// Let's create objects
		InstanceVarExample obj0 = new InstanceVarExample();
		InstanceVarExample obj1 = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		// Let's display and see what happens.
		System.out.println(obj0.instanceVar);
		System.out.println(obj1.instanceVar);
		System.out.println(obj2.instanceVar);
		// We now change the instance var in one object.
		obj2.instanceVar = "Hey, I am object 2 & my instance var changed.";
		// Let's display after changing.
		System.out.println(obj0.instanceVar);
		System.out.println(obj1.instanceVar);
		System.out.println(obj2.instanceVar);
	}

}
