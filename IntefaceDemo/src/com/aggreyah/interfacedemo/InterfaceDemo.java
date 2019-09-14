package com.aggreyah.interfacedemo;

interface MyInterface{
	public void method1();
	public void method2();
}
public class InterfaceDemo implements MyInterface {

	public static void main(String[] args) {
		MyInterface obj0 = new InterfaceDemo();
		obj0.method2();
		obj0.method1();
	}

	@Override
	public void method1() {	
		System.out.println("Implementation of method1.");
	}

	@Override
	public void method2() {	
		System.out.println("Implementation of method2.");
	}

}
