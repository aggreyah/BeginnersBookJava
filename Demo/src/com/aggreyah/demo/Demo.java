package com.aggreyah.demo;

abstract class AbstractClass{
	public void myMethod() {
		System.out.println("Hello");
	}
	public abstract void anotherMethod();
}

public class Demo extends AbstractClass{

	public static void main(String[] args) {
		AbstractClass obj0 = new Demo();
		obj0.myMethod();
		obj0.anotherMethod();
	}

	@Override
	public void anotherMethod() {
		System.out.println("In the abstract method.");		
	}

}
